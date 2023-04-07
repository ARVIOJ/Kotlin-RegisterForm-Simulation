package com.arvioj.example2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val button1 : Button = findViewById(R.id.button)
        val button2 : Button = findViewById(R.id.button2)
        val editText1 : EditText = findViewById(R.id.editText1)
        val editText2 : EditText = findViewById(R.id.editText2)
        val editText3 : EditText = findViewById(R.id.editText3 )
        val editText4 : EditText = findViewById(R.id.editText4)

        button1.setOnClickListener{

        finish()

        }

        button2.setOnClickListener{

            val userName = editText1.text.toString()
            val userEmail = editText2.text.toString()
            val userPhone = editText3.text.toString()
            val userAge = editText4.text.toString()

            val myIntent = Intent(this, DataReceived::class.java)

            myIntent.putExtra("ExtraName",userName)
            myIntent.putExtra("ExtraEmail",userEmail)
            myIntent.putExtra("ExtraPhone",userPhone)
            myIntent.putExtra("ExtraAge",userAge)
            startActivity(myIntent)
        }

    }
}