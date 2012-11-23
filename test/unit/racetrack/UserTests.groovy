package racetrack

import grails.test.*

class UserTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testSimpleConstraints() {
        mockForConstraintsTests(User)
        User user = new User(login: "dsf", password: "sdf", role: "SuperUser")
        assertFalse user.validate()
        assertEquals "inList", user.errors["role"]
    }

    void testUniqueConstraint() {
        User jdoe = new User(login: "jdoe")
        User admin = new User(login: "admin")
        mockDomain(User, [jdoe, admin])

        User badUser = new User(login: "jdoe")
        badUser.save()
        assertEquals 2, User.count()
        assertEquals "unique", badUser.errors["login"]
        User goodUser = new User(login: "good", password: "password", role: "user")
        goodUser.save()
        assertEquals 3, User.count()
        assertNotNull User.findByLoginAndPassword("good", "password")
    }
}
