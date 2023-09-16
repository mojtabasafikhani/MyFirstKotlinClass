package bank

data class Person(
    val firstName: String,
    val lastName: String,
    val accounts: MutableList<Account> = mutableListOf(),
    val accountId: Int,
    val passWord: Int
) {
    override fun toString(): String {
        return "$firstName - $lastName - $accounts - $accountId -  $passWord "
    }


}
