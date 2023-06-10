package hamid_ch

fun main() {
    val benz = Car(
        brand = "benz",
        model = "e300",
        maxSpeed = 100
    )
    val bmw = Car(
        brand = "bmw",
        model = "730i",
        maxSpeed = 200
    )

//    benz.compare(bmw)

//    benz.start()
//    benz.brake()
    bmw.start()
    bmw.increaseSpeed()
    bmw.increaseSpeed()
    bmw.increaseSpeed()
    bmw.calculateDuration(200)
//    benz.decreaseSpeed()

}