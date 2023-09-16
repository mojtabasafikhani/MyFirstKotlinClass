package animal

fun main() {
    testAnimals().test()
}

class testAnimals {

    fun test() {
        val list = ArrayList<Animal>()
        val bird = Birds()
        val rep = Reptiles()
        val fish = Fishes()

        list.add(bird)
        list.add(rep)
        list.add(fish)
        for (index in 0..list.lastIndex) {
            list[index].move()
        }


    }

}