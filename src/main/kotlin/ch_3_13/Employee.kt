package ch_3_13

import java.text.DecimalFormat

class Employee(
    private val firstName: String,
    private val lastName: String,
    private var mountSalary: Double
) {
    val df = DecimalFormat("#.##")


    fun getSalary(): Double {
        return mountSalary

    }

    fun setSalary(newSalary: Double) {
        mountSalary = newSalary
    }

    fun calculateSalary(): Double {
        return df.format(mountSalary).toDouble()
    }

    fun calculateTenPercentOfSalary(): Double {

        if (0 >= mountSalary) {
            println("to amount of salary is zero")
        }

        val tenPer = mountSalary * 0.1
        val lastTenPer = mountSalary + tenPer
        return df.format(lastTenPer).toDouble()

    }
}

