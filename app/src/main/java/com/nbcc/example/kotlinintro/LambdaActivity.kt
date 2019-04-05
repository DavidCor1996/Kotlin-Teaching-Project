package com.nbcc.example.kotlinintro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lambda.*
import kotlin.random.Random


class LambdaActivity : AppCompatActivity() {

    //Lambdas are basically unnamed, inline functions.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lambda)

    }

    /**
     * Roll click event
     */
    fun rollClick(view: View){
        val rnd1 = List(1) { Random.nextInt(1, 6) }
        val rnd2 = List(1) { Random.nextInt(1, 6) }
        diceRoll(rnd1.first(),rnd2.first())
    }

    fun diceRoll(roll: Int, cpuRoll: Int){
        var winCheck = ""
        playerText.text = roll.toString()
        cpuText.text = cpuRoll.toString()


        //Check Winner

        if(roll == cpuRoll){
            winCheck = "Draw :|"
        }else if(roll > cpuRoll){
            winCheck = "You win ☺!"
        }else{
            winCheck ="You lose :("
        }

        messageText.text = winCheck

    }




}
