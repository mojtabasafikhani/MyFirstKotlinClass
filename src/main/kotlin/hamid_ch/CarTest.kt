package hamid_ch

fun main() {
    val benz = Car(
        brand = "bmw",
        model = "730",
        maxSpeed = 100
    )

    benz.start()
    benz.brake()
    benz.increaseSpeed()
    benz.increaseSpeed()
    benz.increaseSpeed()

}