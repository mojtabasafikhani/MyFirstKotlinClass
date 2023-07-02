package BookStore

data class Book(
     var name: String,
     val author : String,
     var price: Double,
     val id: Int
){
     override fun toString(): String {
          return "$name - $author - $price - $id"
     }

}