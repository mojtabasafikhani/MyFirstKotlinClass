package shape

fun main() {

    TestShape().testShapes()
}

class TestShape {


    fun testShapes() {
       val list = ArrayList<Shape>()

        val height = 6.0
        val width = 4.0
        val rec = Rectangle(height, width)


        val r = 5.0
        val circle = Circle(r)

        val h = 5.0
        val square = Square(h)

        list.add(rec)
        list.add(circle)
        list.add(square)
        for (index in 0 .. list.lastIndex){

            println(list[index].area())
        }

    }

}