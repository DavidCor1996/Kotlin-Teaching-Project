package com.nbcc.example.kotlinintro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_when.*

class WhenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_when)
    }

fun btnMonth(view: View){
    val monthNum = txtMonth.text;

    txtAnswer.text = getMonthString(monthNum.toString().toInt())
}

    /**
     * Turns number into that months string
     */
    fun getMonthString(num: Int) : String{
        val monthString: String
        when (num) {
        1 -> monthString = "January"
        2 -> monthString = "February"
        3 -> monthString = "March"
        4 -> monthString = "April"
        5 -> monthString = "May"
        6 -> monthString = "June"
        7 -> monthString = "July"
        8 -> monthString = "August"
        9 -> monthString = "September"
        10 -> monthString = "October"
        11 -> monthString = "November"
        12 -> monthString = "December"
        else -> monthString = "Invalid month"
    }

    return monthString
}
}
