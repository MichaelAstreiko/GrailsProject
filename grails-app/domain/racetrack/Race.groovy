package racetrack

class Race {
    String name
    Date startDate
    String city
    String state
    BigDecimal distance
    BigDecimal cost
    Integer maxRunners = 100000

    static constraints = {
        name()
        cost()
        city()
        startDate()
        distance()
        maxRunners()
    }
}
