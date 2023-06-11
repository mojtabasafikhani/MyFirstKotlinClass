package BookStore

import java.lang.Exception
import java.util.Scanner

fun main() {

    showMainScreen()
}

private fun showMainScreen() {
    val scanner = Scanner(System.`in`)

    println(" Choose one 1 or 2 \n *********************************************")
    println(" 1.Manage book")
    println(" 2.List of book")
    println(" *********************************************")
    print(" Your option: ")

    try {
        val choose = scanner.nextInt()
        when (choose) {
            1 -> showManageScreen()
            2 -> print("List of book selected")
            else -> print("You did not select correct code")
        }

    } catch (e: Exception) {
        println("You did not select correct code")
    }
}

fun showManageScreen(){
    println(" Choose one option\n ********************************************")
    println(" 1.Add book")
    println(" 2.Delete book")
    println(" 3.Edite")
    println(" 4.Back to main page")
    println(" *********************************************")
    print(" Your option: ")
    try {
        val scanner = Scanner(System.`in`)
        when (scanner.nextInt()) {
            1 -> println("Add book")
            2 -> print("Delete book")
            3 -> print("Edit")
            4 -> showMainScreen()
            else -> print("You did not select correct code")
        }

    } catch (e:Exception) {
        println("You did not select correct code")
    }

}