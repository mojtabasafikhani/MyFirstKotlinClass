package bank


import kotlin.collections.ArrayList

class AccountsManager {

    private val people = HashMap<Int, Person>(fakePeople)
    private val accountNumbers = HashMap<Int, Int>(fakeAccount)
//

    fun registerAccount(person: Person) {

//        for (index in 0..arrayListPerson.lastIndex) {
//            if (person.accountNumber == arrayList[index].accountNumber) {
//                println("accountNumber is same")
//                return
//            }
//        }
        if (people.containsKey(person.accountId)) {
            println("accountNumber is same")
            return
        }
        people[person.accountId] = person
    }

    fun showAllAccount() {
        people.keys.forEachIndexed { index, key ->
            val person = people[key] ?: return
            for (otherIndex in 0..person.accounts.lastIndex) {
                val first = person.firstName
                val last = person.lastName
                val balance = person.accounts[otherIndex].balance
                val accountNumber = person.accounts[otherIndex].accountNumber
                println(" $index. first name $first ,  last name , $last balance is $balance and accountNumber $accountNumber  ")
            }
        }
    }


    fun withdraw(accountNumber: Int, amount: Int, passWord: Int) {
        val accountID = accountNumbers[accountNumber] ?: return
        val person = people[accountID] ?: return
        for (otherIndex in 0..person.accounts.lastIndex) {
            if (accountNumber == person.accounts[otherIndex].accountNumber) {
                if (passWord == person.passWord) {
                    val minus = person.accounts[otherIndex].balance - amount
                    var oldList = person.accounts[otherIndex].copy(balance = minus)
                    person.accounts[otherIndex] = oldList
                    people[accountID] = person
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

        val accountID = accountNumbers[accountNumber] ?: return
        val person = people[accountID] ?: return
        for (otherIndex in 0..person.accounts.lastIndex) {
            if (accountNumber == person.accounts[otherIndex].accountNumber) {
                val add = person.accounts[otherIndex].balance + amount
                println(" $person.lastName}'s new balance is ${person.accounts[otherIndex].accountNumber}")
                var oldList = person.accounts[otherIndex].copy(balance = add)
                person.accounts[otherIndex] = oldList
                people[accountID] = person
//                var oldAccount: Account = arrayList[index]
//                var updateAccount: Account = Account(firstName = oldAccount.firstName , oldAccount.lastName , oldAccount.initialCapital+amount , oldAccount.accountNumber)
//                arrayList[index] = updateAccount

            }
        }


    }

    fun transfer(accountNumber: Int, passWord: Int, transferAmount: Int, destinationAccountNumber: Int) {

        val accountID = accountNumbers[accountNumber] ?: return
        val person = people[accountID] ?: return
        val destinationAccountID = accountNumbers[destinationAccountNumber] ?: return
        val destinationPerson = people[destinationAccountID] ?: return
        for (otherIndex in 0..person.accounts.lastIndex) {
            if (accountNumber == person.accounts[otherIndex].accountNumber) {
                if (person.accounts[otherIndex].balance < transferAmount) {
                    return
                }

                if (passWord != person.passWord) {
                    return
                }
                for (otherIndex in 0..person.accounts.lastIndex) {
                    if (destinationAccountNumber == destinationPerson.accounts[otherIndex].accountNumber) {
                        val add = destinationPerson.accounts[otherIndex].balance + transferAmount
                        var otherList = destinationPerson.accounts[otherIndex].copy(balance = add)
                        destinationPerson.accounts[otherIndex] = otherList
                        people[destinationAccountID] = destinationPerson


                        val minus = person.accounts[otherIndex].balance - transferAmount
                        var oldList = person.accounts[otherIndex].copy(balance = minus)
                        person.accounts[otherIndex] = oldList
                        people[accountID] = person
                        return
                    }

                }

            }
        }

        println("user not found")
    }

//    private fun transferMoney(destinationAccountNumber: Int, transferAmount: Int, person: Person) {
//
//        for (otherIndex in 0..person.accounts.lastIndex) {
//            if (destinationAccountNumber == person.accounts[otherIndex].accountNumber) {
//                val add = person.accounts[otherIndex].balance + transferAmount
//                var otherList = person.accounts[otherIndex].copy(balance = add)
//                person.accounts[otherIndex] = otherList
//
//                val minus = person.accounts[otherIndex].balance - transferAmount
//                var oldList = person.accounts[otherIndex].copy(balance = minus)
//                person.accounts[otherIndex] = oldList
//                people[accountID] = person
//                return
//            }
//
//        }
//    }

    fun checkUserCondition(testAccount: TestAccount, accountID: Int, password: Int) {

        val person = people[accountID] ?: return

        if (accountID == person.accountId && password == person.passWord) {
            testAccount.showAccountsManager()
        }


    }

    fun addAccount(accountId: Int, passWord: Int, account: Account) {
        val person = people[accountId] ?: return
        if (passWord == person.passWord) {
            person.accounts.add(account)
            accountNumbers[account.accountNumber] = accountId
//            in shomare hesab marbot b in code melie


        }
    }
}