package com.example.android_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var value1 : EditText = findViewById(R.id.Value1)
        var value2 : EditText = findViewById(R.id.Value2)
        var Equals : Button = findViewById(R.id.Equals)
        var result : TextView = findViewById(R.id.Result)

        Equals.setOnClickListener {

            var final_result : Double = (value1.text.toString().toDouble()) + (value2.text.toString().toDouble())

            result.text = "Resultado: " + final_result

        }

    }
}