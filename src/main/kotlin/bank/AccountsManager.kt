package bank


import kotlin.collections.ArrayList

class AccountsManager {

    private val arrayList = ArrayList<Account>()

    fun addAccount(account: Account){
        arrayList.add(account)

        for (index in 0 .. arrayList.lastIndex){
            val mamad = arrayList[index].lastName
            println("new account with this $mamad was add ")

        }



    }

}