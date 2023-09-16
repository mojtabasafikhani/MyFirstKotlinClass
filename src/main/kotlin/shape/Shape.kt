package shape

abstract class Shape {

    abstract fun area(): Double

}

class Rectangle(val h: Double, val w: Double) : Shape() {

     override fun area(): Double {

        return h * w
    }

}

class Circle(val r: Double) : Shape() {

     override fun area(): Double {

        return r*r*Math.PI
    }

}
class Square(val h: Double) : Shape() {

    override fun area(): Double {

        return h*h
    }

}

