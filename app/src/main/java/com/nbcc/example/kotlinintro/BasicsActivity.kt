package com.nbcc.example.kotlinintro

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_basics.*
import org.w3c.dom.Text
import java.util.*
import java.text.SimpleDateFormat


class BasicsActivity : AppCompatActivity() {

    //region Variables

    //Lets begin by creating the variables we will need.

    // Mutable vs Immutable
    val davidSanity = 0  //Cannot Change/Immutable
    var studentSanity = 100 //Can Change/Mutuable

    //Java Compatibility
    val calendar = Calendar.getInstance() // Uses Calendar
    val timeStamp = SimpleDateFormat("yyyy MM dd").format(calendar.time) //Uses SimpleDateFormat


    //endregion


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basics)

        //Try to add 20 to both

        //davidSanity += 20
        //studentSanity += 20
    }


    //region Functions
    /**
     * Button Click Event
     */
    fun buttonClick(view: View){

        //val textView = findViewById<TextView>(R.id.txtPrint)

        txtPrint.text = sanityCheck()
        //textView.text = sanityCheck(studentSanity)


        //String Interpolation
        txtDate.text = "Sanity Check Completed On : $timeStamp"


    }

    /**
     * Single line function - We all know at this time of year, that our sanity is gone.
     */
    fun sanityCheck() : String = "You are a student. Your sanity is gone"

    /**
     * Regular function
     */
    fun sanityCheck(sanity: Int) : String {
        if (sanity > 20) {
            return "Its gonna be okay"
        }
        return "You are too far gone"
    }

    //endregion




}
