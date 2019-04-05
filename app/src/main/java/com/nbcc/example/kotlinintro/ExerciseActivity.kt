package com.nbcc.example.kotlinintro

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_exercise.*


class ExerciseActivity : AppCompatActivity() {

    //bmi = (weight in pounds * 703) / (height in inches * height in inches).

    //under weight below 18.5 , normal weight: 18.5 to 25, overweight: 25 to 30, obese: over 30

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise)
    }

    /**
     * Calculate Click event
     */
    @SuppressLint("SetTextI18n")
    fun CalculateClicked(view: View){
        bmiText.text =""
        bmiStatusText.text=""

        var weight: Double? = null
        var height: Double? = null

        //Check for empty text values
        if(weightText.text.toString() != "" && heightText.text.toString() != ""){
            weight = weightText.text.toString().toDouble()
            height = heightText.text.toString().toDouble()
        }

        else{
            bmiStatusText.text = "Please fill out the fields"
        }

        val BMI = Calculations(weight,height)
        bmiStatus(BMI)

    }

    /**
     * performs Calculations
     */
    fun Calculations(weight: Double?, height: Double?): Double?{
        var BMI: Double? = null
        val w = (weight?.times(703))

        val h = (height?.times(height))

        if (h != null){
            val x = h
            BMI = w?.div(x)
        }

        return BMI
    }

    /**
     * Gets BMI Status
     */
    fun bmiStatus(bmi:Double?){
        var output = ""

        val formattedBMI = "%.2f".format(bmi)

        bmiText.text = ("Your bmi is $formattedBMI")
        if(bmi != null){
            if(bmi > 30){
                output += ("You are obese")
            }else if(bmi in 25.0..30.0){
                output += ("You are overweight")
            }else if(bmi in 18.5..25.0){
                output += ("You are healthy weight")
            }else{
                output += ("You are under weight")
            }

            when(bmi){

                    //> 30 -> output += ("You are obese")
               in 25.0..30.0 ->  output += ("You are overweight")

            }


            bmiStatusText.text = output

        }


    }


}
