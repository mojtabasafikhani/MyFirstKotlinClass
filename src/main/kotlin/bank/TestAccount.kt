package bank

import java.util.*


fun main() {
    TestAccount()
}
//init - try and cth

class TestAccount {

    private val scanner = Scanner(System.`in`)
    private val accountsManager = AccountsManager()

    init {
        showMainScreen()
    }

    private fun showMainScreen() {
        println(" Choose your option \n ************************************")
        println(" 1.showAccountsManager")
        println("************************************")
        print(" Your option is: ")


        try {

            when (scanner.nextInt()) {
                1 -> showAccountsManager()
                else -> println("You did not select correct code")
            }
        } catch (e: Exception) {
            println("You did not select correct code")
        }

    }

    private fun showAccountsManager() {
        println(" Choose one option\n ********************************************")
        println(" 1.Add account")
        print(" Your option is: ")

        try {

            when (scanner.nextInt()) {
                1 -> addAccount()
                2 -> showMainScreen()
                else -> print("You did not select correct code")
            }

        } catch (e: java.lang.Exception) {
            println("You did not select correct code")
        }
    }

    private fun addAccount() {
        val accountNumber = (1000..9999).random()
        val scanner = Scanner(System.`in`)

        print(" first name: ")
        val firstName = scanner.nextLine()
        print(" last name: ")
        val lastName = scanner.nextLine()
        print(" initial capital: ")
        val initialCapital = scanner.nextInt()

        val account = Account(firstName, lastName, initialCapital, accountNumber)
        accountsManager.addAccount(account)
        showMainScreen()


    }


}