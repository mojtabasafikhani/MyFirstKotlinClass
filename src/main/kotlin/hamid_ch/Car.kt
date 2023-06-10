package hamid_ch

class Car(
    private val brand: String,
    private val model: String,
    private val maxSpeed: Int
) {
    var currentSpeed = 0
    var isStart = false

    fun compare(car: Car){

        if (car.maxSpeed>maxSpeed){

            println("${car.brand+car.model} is faster")
        }else{
            println("${brand+model} is faster")
        }

    }
    fun calculateDuration(destination: Int){

        println("duration time is ${destination/currentSpeed.toDouble()} hour")
    }

    fun increaseSpeed() {
    if (!isStart) {
        println("the car in off")
        return
    }
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
        if (!isStart) {
            println("the car in off")
            return
        }
        currentSpeed -= 30
        if (currentSpeed <= 0){
            currentSpeed = 0
        }
            println("speed increase to $currentSpeed")
    }

    fun start() {
        isStart = true
        println("start")
    }

    fun brake() {
        println("break")
    }
}