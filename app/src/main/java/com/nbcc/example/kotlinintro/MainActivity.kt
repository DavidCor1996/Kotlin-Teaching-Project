package com.nbcc.example.kotlinintro

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buttonClicked(view: View) {
        // Do something in response to button
        setContentView(R.layout.activity_main)
        when(view.id){
            R.id.btnBasics -> {
                toast("Basics")
                val intent = Intent(this@MainActivity, BasicsActivity::class.java)
                startActivity(intent)
            }

            R.id.btnNull -> {
                toast("Null Safety")
                val intent = Intent(this@MainActivity, NullSafetyActivity::class.java)
                startActivity(intent)
            }

            R.id.btnWhen -> {
                toast("When Statements")
                val intent = Intent(this@MainActivity, WhenActivity::class.java)
                startActivity(intent)
            }

            R.id.btnLambda -> {
                toast("Lambdas")
                val intent = Intent(this@MainActivity, LambdaActivity::class.java)
                startActivity(intent)
            }

            R.id.btnExercise ->{
                toast("Exercise Time!")
                val intent = Intent(this@MainActivity, ExerciseActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun toast(text: CharSequence?) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }
}
