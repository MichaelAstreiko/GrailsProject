package racetrack

class Registration {
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
        "${race.name}, ${runner.lastName}"
    }
}
