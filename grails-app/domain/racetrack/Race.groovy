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
        name(blank: false, maxSize: 50)
        cost()
        city()
        startDate(validator: {
            return (it > new Date())
        })
        distance(min: 0.0)
        maxRunners(min: 0, max: 100500)
    }
    static hasMany = [registrations: Registration]

    @Override
    String toString() {
        "${name}, ${startDate.format('MM/dd/yyyy')}"
    }

    BigDecimal inMiles() {
        distance * 0.6214
    }
}
