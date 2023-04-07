package com.arvioj.example2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DataReceived : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.data_received)

        val button1 : Button = findViewById(R.id.button)
        val button2 : Button = findViewById(R.id.button2)
        val Text1 : TextView = findViewById(R.id.text6)
        val Text2 : TextView = findViewById(R.id.text7)
        val Text3 : TextView = findViewById(R.id.text8)
        val Text4 : TextView = findViewById(R.id.text9)

        Text1.text = intent.extras!!.getString("ExtraName","Error")
        Text2.text = intent.extras!!.getString("ExtraEmail","Error")
        Text3.text = intent.extras!!.getString("ExtraPhone","Error")
        Text4.text = intent.extras!!.getString("ExtraAge","Error")

        button1.setOnClickListener{

            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
            finish()
        }

        button2.setOnClickListener {
            finish()
        }
    }
}
