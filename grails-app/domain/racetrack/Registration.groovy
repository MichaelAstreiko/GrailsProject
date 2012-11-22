package racetrack

class Registration {
    String name
    Date dateOfBirth
    String gender
    String address
    String city
    String state
    String zipcode
    String email
    Date dateCreated
    Boolean paid

    static constraints = {
        race()
        runner()
        paid()
        dateCreated()

    }

    static belongsTo = [race: Race, runner: Runner]

    @Override
    String toString() {
        return "${email}, ${city}"
    }

}
