package racetrack

class Runner {
    String firstName
    String lastName
    String gender
    String address
    String city
    String state
    String zipcode
    String email
    Date dateOfBirth


    static hasMany = [registrations: Registration]
    static constraints = {
        firstName(blank: false)
        lastName(blank: false)
        dateOfBirth()
        gender(inList: ["M", "F"])
        address()
        city()
        state()
        zipcode()
        email(email: true)
    }

    @Override
    String toString() {
        "${lastName}, ${firstName} (${email})"
    }
}
