package ch_3_13

import java.text.DecimalFormat

class Employee(firstName: String, lastName: String, mountSalary: Double) {
    val salary = mountSalary * 12
    val df = DecimalFormat("#.##")

    fun calculateSalary(): Double {
        if (0 >= salary) {
            println("to amount of salary is zero")
        }

        return df.format(salary).toDouble()
    }

    fun calculateTenPercentOfSalary(): Double {

        if (0 >= salary) {
            println("to amount of salary is zero")
        }

        val tenPer2 = salary*0.1
        val lastTenPer = salary+tenPer2
        return df.format(lastTenPer).toDouble()

    }
}

