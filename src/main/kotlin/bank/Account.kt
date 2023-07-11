package bank

class Account(
    val firstName: String,
    val lastName: String,
    val initialCapital: Int,
    val accountNumber: Int
) {
    override fun toString(): String {
        return "$firstName - $lastName - $initialCapital $accountNumber"
    }


}
