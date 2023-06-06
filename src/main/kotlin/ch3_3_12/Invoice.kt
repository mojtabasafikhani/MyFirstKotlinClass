package ch3_3_12

import java.text.DecimalFormat

class Invoice(val partNumb: String, val desc: String, val quanItem: Int, val priceItm: Double) {

    fun calculate(): Double {

        val df = DecimalFormat("#.##")

        var multp = 0.0
        multp = quanItem * priceItm
        if (0 >= multp) {
            multp = 0.0
        }
        return df.format(multp).toDouble()
    }

}