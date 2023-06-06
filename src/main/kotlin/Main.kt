import ch3_3_12.Invoice
import java.util.Scanner


fun main() {

    val scanner = Scanner(System.`in`)

    val partNumber = "IR128792"
    val description = "sugar"
    val quantityItem = 5
    val priceItem = 10.66452754

    val inv = Invoice(partNumber,description,quantityItem,priceItem)
    val calculateInv = inv.calculate()
    println("invoice amount is $calculateInv")


//    println("pls enter number1")
//    var number1 = scanner.nextInt()
//    println("pls enter number2")
//    var number2 = scanner.nextInt()
//    println("pls enter number3")
//    var number3 = scanner.nextInt()
//    println("pls enter number4")
//    var number4 = scanner.nextInt()
//    println("pls enter number5")
//    var number5 = scanner.nextInt()
// var c = 0
//
//    var numbers = arrayListOf<Int>(number1, number2, number3, number4, number5)
//    var positive = 0
//    var negative = 0
//    var zero = 0
//    for (numb in numbers) {
//        var mainnumb = numb
//        if (mainnumb > 0) {
//            positive++
//        } else if(mainnumb == 0){
//            zero++
//        }else if (0 > mainnumb){
//            negative++
//        }
//    }
//    println("the positive numbers is $positive")
//    println("the zero numbers is $zero")
//    println("the negative numbers is $negative")



//    fun largest(num1: Int, num2: Int, numb3: Int, numb4: Int, numb5: Int) {
//
//
//    }

////    sum(number1, number2, number3)
////    product(number1, number2, number3)
//    largest(number1, number2, number3)
//
//}
//
//fun sum(numb1: Int, numb2: Int, numb3: Int) {
//    val sum = (numb1 + numb2 + numb3) / 3
//
//    println("the sum of 3 inputs is $sum")
//}
//
//fun product(numb1: Int, numb2: Int, numb3: Int) {
//    val product = numb1 * numb2 * numb3
//
//    println("the product of 3 inputs is $product")
//
//}
//
//fun largest(numb1: Int, numb2: Int, numb3: Int) {
//    var largest = numb1
//
//    if (largest < numb2) {
//        largest = numb2
//    }
//
//    if (largest < numb3) {
//        largest = numb3
//    }
//
//    println("hamid: $largest")
//
//    if (numb1 > numb2 && numb1 > numb3) {
//        println("largest number is $numb1")
//    } else if (numb2 > numb1 && numb2>numb3) {
//        println("largest number is $numb2")
//    } else
//        println("largest number is $numb3")
//}

}