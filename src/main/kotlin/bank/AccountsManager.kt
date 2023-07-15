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
        val first = account.firstName
        val last = account.lastName
        val balance = account.initialCapital
        val accountNumber = account.accountNumber
        println(" new account with this information first name $first  last name $last and $balance and accountNumber $accountNumber was add ")

    }

    fun deposit(accountNumber: Int,amount: Int) {
        for (index in 0 .. arrayList.lastIndex){
            if (accountNumber == arrayList[index].accountNumber){
                var total =   arrayList[index].initialCapital + amount
                println(" ${arrayList[index].lastName}'s new balance is $total")

            }

        }

    }

}