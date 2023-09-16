package animal

abstract class Animal {

    abstract fun move()
}

class Birds() : Animal() {
    override fun move() {
    println("fly")
    }

}

class Reptiles(): Animal() {
    override fun move() {
        println("crawl")
    }

}

class Fishes(): Animal(){
    override fun move() {
        println("swim")

    }

}
