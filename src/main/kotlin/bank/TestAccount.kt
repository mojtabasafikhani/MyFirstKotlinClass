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
        println(" 2.showAllAccounts")
        println("************************************")
        print(" Your option is: ")


        try {

            when (scanner.nextInt()) {
                1 -> showAccountsManager()
                2 -> listOfAccounts()
                else -> println("You did not select correct code")
            }
        } catch (e: Exception) {
            println("You did not select correct code")
        }

    }

    private fun showAccountsManager() {
        println(" Choose one option\n ********************************************")
        println(" 1.Add account")
        println(" 2.Deposit")
        println(" 3.withdraw")
        println(" 4.transfer")
        println(" 5.Show main screen")
        print(" Your option is: ")

        try {

            when (scanner.nextInt()) {
                1 -> addAccount()
                2 -> deposit()
                3 -> whitDraw()
                4 -> transfer()
                5 -> showMainScreen()
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
        print(" password: ")
        val password = scanner.nextInt()

        val account = Account(firstName, lastName, initialCapital, accountNumber, password)
        accountsManager.addAccount(account)
        showMainScreen()


    }

    private fun deposit() {
        val scanner = Scanner(System.`in`)
        print(" Enter your account number: ")
        val accountNumber = scanner.nextInt()
        print(" How much money to deposit: ")
        val amount = scanner.nextInt()
        accountsManager.deposit(accountNumber, amount)
        showMainScreen()
    }


    private fun whitDraw() {
        val scanner = Scanner(System.`in`)
        print(" Enter your account number: ")
        val accountNumber = scanner.nextInt()
        print(" How much money to withdrawn: ")
        val amount = scanner.nextInt()
        print(" Enter your password: ")
        val passWord = scanner.nextInt()
        accountsManager.withdraw(accountNumber, amount, passWord)
        showMainScreen()

    }

    private fun listOfAccounts() {
        val scanner = Scanner(System.`in`)

        println("1.showAllAccounts")
        print("your choose is:")
        try {
            when (scanner.nextInt()) {
                1 -> showAllAccounts()
                else -> print("You did not select correct code")
            }

        } catch (e: java.lang.Exception) {
            println("You did not select correct code")
        }

    }

    private fun showAllAccounts() {
        accountsManager.showAllAccount()
        showMainScreen()

    }

    private fun transfer() {
        val scanner = Scanner(System.`in`)
        print(" pls enter your account number: ")
        val accountNumber = scanner.nextInt()
        print(" pls enter your password: ")
        val passWord = scanner.nextInt()
        print(" pls enter transfer amount: ")
        val transferAmount = scanner.nextInt()
        print(" pls enter destination account number: ")
        val destinationAccountNumber = scanner.nextInt()
        accountsManager.transfer(accountNumber, passWord, transferAmount, destinationAccountNumber)
        showMainScreen()

    }


}