package bank


import javax.print.DocFlavor.INPUT_STREAM
import kotlin.collections.ArrayList

class AccountsManager {

    private val arrayList = ArrayList<Account>(fakeAccount)

    fun addAccount(account: Account) {

        for (index in 0..arrayList.lastIndex) {
            if (account.accountNumber == arrayList[index].accountNumber) {
                println("accountNumber is same")
                return
            }
        }
        arrayList.add(account)
//        println("${account.passWord} was add")

//        val first = account.firstName
//        val last = account.lastName
//        val balance = account.initialCapital
//        val accountNumber = account.accountNumber
//        println(" new account with this information first name $first  last name $last and $balance and accountNumber $accountNumber was add ")

    }

    fun showAllAccount() {
        for (index in 0..arrayList.lastIndex) {
            val first = arrayList[index].firstName
            val last = arrayList[index].lastName
            val balance = arrayList[index].initialCapital
            val accountNumber = arrayList[index].accountNumber
            println(" $index. first name $first ,  last name , $last balance is $balance and accountNumber $accountNumber  ")
        }
    }


    fun withdraw(accountNumber: Int, amount: Int, passWord: Int) {
        for (index in 0..arrayList.lastIndex) {
            if (accountNumber == arrayList[index].accountNumber) {
                if (passWord == arrayList[index].passWord) {
                    val minus = arrayList[index].initialCapital - amount
                    var oldList = arrayList[index].copy(initialCapital = minus)
                    arrayList[index] = oldList
                    return
                } else {
                    println(" password is wrong")
                    return
                }
            } else {
                println(" account number is wrong")
                return
            }
        }

    }


    fun deposit(accountNumber: Int, amount: Int) {
        for (index in 0..arrayList.lastIndex) {
            if (accountNumber == arrayList[index].accountNumber) {
                val add = arrayList[index].initialCapital + amount
                println(" ${arrayList[index].lastName}'s new balance is ${arrayList[index].accountNumber}")
                var oldList = arrayList[index].copy(initialCapital = add)
                arrayList[index] = oldList
//                var oldAccount: Account = arrayList[index]
//                var updateAccount: Account = Account(firstName = oldAccount.firstName , oldAccount.lastName , oldAccount.initialCapital+amount , oldAccount.accountNumber)
//                arrayList[index] = updateAccount


            }

        }

    }

    fun transfer(accountNumber: Int, passWord: Int, transferAmount: Int, destinationAccountNumber: Int) {

        for (index in 0..arrayList.lastIndex) {
            if (accountNumber == arrayList[index].accountNumber) {
                if (arrayList[index].initialCapital < transferAmount) {
                    return
                }

                if (passWord != arrayList[index].passWord) {
                    return
                }

                transferMoney(destinationAccountNumber, transferAmount, index)
                return
            }
        }

        println("user not found")
    }

    private fun transferMoney(destinationAccountNumber: Int, transferAmount: Int, index: Int) {
        for (otherIndex in 0..arrayList.lastIndex) {
            if (destinationAccountNumber == arrayList[otherIndex].accountNumber) {
                val add = arrayList[otherIndex].initialCapital + transferAmount
                var otherList = arrayList[otherIndex].copy(initialCapital = add)
                arrayList[otherIndex] = otherList

                val minus = arrayList[index].initialCapital - transferAmount
                var oldList = arrayList[index].copy(initialCapital = minus)
                arrayList[index] = oldList
                return
            }
        }
    }

}