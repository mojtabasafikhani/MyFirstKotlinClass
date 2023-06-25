package BookStore

import java.lang.Exception
import java.util.Scanner

fun main() {

    BookTest()
}

class BookTest {

    private val bookManage = BookManage()
    private val scanner = Scanner(System.`in`)

    init {
        showMainScreen()
    }

    private fun showMainScreen() {

        println(" Choose one 1 or 2 \n *********************************************")
        println(" 1.Manage book")
        println(" 2.List of book")
        println(" *********************************************")
        print(" Your option: ")

        try {
            val choose = scanner.nextInt()
            when (choose) {
                1 -> showManageScreen()
                2 -> listOfBookSelected()
                else -> print("You did not select correct code")
            }

        } catch (e: Exception) {
            println("You did not select correct code")
        }
    }

    private fun showManageScreen() {
        println(" Choose one option\n ********************************************")
        println(" 1.Add book")
        println(" 2.Delete book")
        println(" 3.Edit")
        println(" 4.Back to main page")
        println(" *********************************************")
        print(" Your option: ")
        try {

            when (scanner.nextInt()) {
                1 -> addBook()
                2 -> showDeleteScreen()
                3 -> showEditScreen()
                4 -> showMainScreen()
                else -> print("You did not select correct code")
            }

        } catch (e: Exception) {
            println("You did not select correct code")
        }

    }

    private fun showEditScreen() {
        print(" Write the name of the alternative book:")
        val sc = Scanner(System.`in`)
        val name = sc.nextLine()
        print(" write previous bookID: ")
        val id = sc.nextInt()
        println(id)
        println(name)
        editBook(id, name)
        showMainScreen()
    }

    private fun addBook() {
        val scanner = Scanner(System.`in`)
        print("book name: ")
        val bookName = scanner.nextLine()
        print("author name: ")
        val authorName = scanner.nextLine()
        print("book price: ")
        val bookPrice = scanner.nextDouble()
        print("book id: ")
        val bookId = scanner.nextInt()

        val book = Book(bookName, authorName, bookPrice, bookId)
        bookManage.addBook(book)
        showMainScreen()
    }

    private fun listOfBookSelected() {
        println(" 1.Show books")
        println(" *********************************************")
        print(" Your option: ")
        try {
            when (scanner.nextInt()) {
                1 -> showBooks()
                else -> print("You did not select correct code")
            }

        } catch (e: Exception) {
            println("You did not select correct code")
        }

    }

    private fun showBooks() {

        bookManage.showAllBooks()
        showMainScreen()

    }

    private fun showDeleteScreen() {
        print(" Enter the ID of the intended book: ")
        val id = scanner.nextInt()
        deleteBook(id)
        showMainScreen()

    }

    private fun editBook(id: Int, name: String) {
        bookManage.editBook(id, name)
    }

    private fun deleteBook(id: Int){
        bookManage.deleteBook(id)
    }
}

