package hamid_ch

class Car(
    private val brand: String,
    private val model: String,
    private val maxSpeed: Int
) {
    var currentSpeed = 0

    fun increaseSpeed() {

        currentSpeed += 50

        if (currentSpeed > maxSpeed) {
            currentSpeed = maxSpeed
            println("maxSpeed is $currentSpeed")
        }

        if (currentSpeed >= 80) {
            println("alarm is on")
        }

        println("maxSpeed is $currentSpeed")
    }

    fun decreaseSpeed() {
        currentSpeed -= 30
        if (currentSpeed <= 0){
            currentSpeed = 0
        }
            println("speed increase to $currentSpeed")
    }

    fun start() {
        println("start")
    }

    fun brake() {
        println("break")
    }
}