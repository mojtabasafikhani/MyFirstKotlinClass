package BookStore

class BookManage {


    private val arrayList = ArrayList<Book>(fakeData)
    fun addBook(book: Book) {
        for (index in 0..arrayList.lastIndex) {
            val bookID = arrayList[index]
            if (bookID.id == book.id) {
                println(" same ID")
                return
            }

        }
        arrayList.add(book)
        println(" the ${book.name} book was add")

    }

    fun deleteBook(id: Int) {
        for (index in 0..arrayList.lastIndex) {
            val book = arrayList[index]
            if (book.id == id) {
                arrayList.remove(book)
                println(" the ${book.name} book was deleted")
//                arrayList.removeAt(i)
                return
            }

        }
        println(" incorrect ID")
        return

//        arrayList.removeIf { it.id == id }
    }

    fun showAllBooks() {
        for (index in 0..arrayList.lastIndex) {
            println(" ${index + 1}. ${arrayList[index]}")
        }
    }

    fun editBook(id: Int, name: String) {
        for (index in 0..arrayList.lastIndex) {
            if (arrayList[index].id == id) {
                arrayList[index].name = name
                println(" changes were made")
                return
            }
        }
        println(" incorrect ID")
        return
    }
    fun sortByPrice(){
        for (index in 0..arrayList.lastIndex) {
            val topPrice = arrayList[index]
        }
    }
}



