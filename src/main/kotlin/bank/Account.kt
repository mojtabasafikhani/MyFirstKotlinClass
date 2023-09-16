package bank

data class Account(
    val balance: Int,
    val accountNumber: Int,

    ) {
    override fun toString(): String {
        return "$balance $accountNumber "
    }
}