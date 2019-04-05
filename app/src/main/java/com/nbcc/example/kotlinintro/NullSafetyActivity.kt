package com.nbcc.example.kotlinintro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_null_safety.*

class NullSafetyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)
    }

    fun goClick(view: View){
        var name: String? = txtName.text.toString()
        if (name == ""){
            name = null
        }

        //Wont crash with null value
        txtWelcome.text = "Welcome $name your name has ${name?.length} letters!"

    }
}
