import ch3_3_12.Invoice
import ch_3_13.Employee
import java.util.Scanner


fun main() {

    val scanner = Scanner(System.`in`)

    val partNumber = "IR128792"
    val description = "sugar"
    val quantityItem = 5
    val priceItem = 10.66452754
    val firstName = "Tom"
    val lastName = "shelby"
    val mountSalary = 10.3



    val inv = Invoice(partNumber,description,quantityItem,priceItem)
    val emp = Employee(firstName, lastName, mountSalary)
    val calculateInv = inv.calculate()
    println("invoice amount is $calculateInv")
    val empSalary = emp.calculateSalary()
    println("invoice amount is $empSalary")
    val empSalaryTenPer = emp.calculateTenPercentOfSalary()
    println("invoice amount is $empSalaryTenPer")



}