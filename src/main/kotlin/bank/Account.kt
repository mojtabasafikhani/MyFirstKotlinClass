package bank

class Account(
    val firstName: String,
    val lastName: String,
//    val accountNumber: Int,
    val initialCapital: Int
) {
    override fun toString(): String {
        return "$firstName - $lastName  - $initialCapital"
    }


}
// TODO: $accountNumber