import racetrack.Runner
import racetrack.Race
import racetrack.Registration
import racetrack.User

class BootStrap {

    def init = { servletContext ->
//        def jane = new Runner(
//                firstName: "Jane",
//                lastName: "Doe",
//                dateOfBirth: (new Date() - 365 * 30),
//                gender: "F",
//                address: "123 Main Street",
//                city: "NY",
//                state: "NY",
//                zipcode: "2201023",
//                email: "jane@gmail.com"
//        )
//        jane.save()
//        if (jane.hasErrors()) {
//            println jane.errors
//        }
//
//        def raceOfMinsk = new Race(
//                city: "Minsk",
//                state: "Minskaya vobl",
//                cost: 100,
//                distance: 100400,
//                maxRunners: 100499,
//                name: "Race of Minsk",
//                startDate: (new Date() + 100),
//        )
//        raceOfMinsk.save()
//        if (raceOfMinsk.hasErrors()) {
//            println raceOfMinsk.errors
//        }
//
//        def registration = new Registration(
//                race: raceOfMinsk,
//                paid: true,
//                runner: jane
//        )
//        registration.save()
//        if (registration.hasErrors()) {
//            println registration.errors
//        }

        def admin = new User(login: "admin", password: "admin", role: "admin")
        admin.save()
        if (admin.hasErrors()) {
            println admin.errors
        }

        User jdoe = new User(login: "jdoe", password: "jdoe", role: "user")
        jdoe.save()
        if (jdoe.hasErrors()) {
            println jdoe.errors
        }

    }
    def destroy = {
    }
}
