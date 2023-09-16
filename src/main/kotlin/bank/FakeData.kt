package bank

val fakePeople = mapOf(
    2003 to Person("hamid", "bj", mutableListOf((Account(100, 1020))), 2003, 1234),
    7785 to Person("reza", "sn", mutableListOf((Account(100, 1234))), 7785, 2345),
    3663 to Person("mojtaba", "nasimi", mutableListOf((Account(100, 9876))), 3663, 3456),
    552 to Person("siroos", "odoos", mutableListOf((Account(100, 2020))), 552, 4567),
    123 to Person("amin", "adn", mutableListOf((Account(100, 1001))), 123, 5678)
)

val fakeAccount = mapOf(
    1020 to 2003,
    1234 to 7785,
    9876 to 3663,
    2020 to 552,
    2001 to 123
)