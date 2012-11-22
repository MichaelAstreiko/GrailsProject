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

    static constraints = {
    }

    static belongsTo = [race: Race]

    @Override
    String toString() {
        return "${email}, ${city}"
    }
}
