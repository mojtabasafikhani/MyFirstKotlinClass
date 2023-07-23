package bank

data class Account(
    val firstName: String,
    val lastName: String,
    val initialCapital: Int,
    val accountNumber: Int,
    val passWord: Int
) {
    override fun toString(): String {
        return "$firstName - $lastName - $initialCapital $accountNumber $passWord "
    }


}
