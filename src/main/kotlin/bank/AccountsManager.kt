package bank


import kotlin.collections.ArrayList

class AccountsManager {

    private val arrayList = ArrayList<Account>()

    fun addAccount(account: Account){

        for (index in 0 .. arrayList.lastIndex){
            if (account.accountNumber == arrayList[index].accountNumber){
                println("accountNumber is same")
                return
            }

        }
        arrayList.add(account)
        val first = account.firstName
        val last = account.lastName
        val balance = account.initialCapital
        val accountNumber =account.accountNumber
        println(" new account with this information first name $first  last name $last and $balance and accountNumber $accountNumber was add ")

    }

}