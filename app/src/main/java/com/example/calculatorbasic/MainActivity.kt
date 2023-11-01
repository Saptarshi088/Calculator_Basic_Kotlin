package com.example.calculatorbasic

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val AddButton = findViewById<Button>(R.id.addButton)
        val SubsButton = findViewById<Button>(R.id.subButton)
        val MulButton=findViewById<Button>(R.id.mulButton)
        val DivButton= findViewById<Button>(R.id.divButton)
        val InputFromUserOne = findViewById<TextInputEditText>(R.id.inputFromUser1)
        val InputFromUserTwo = findViewById<TextInputEditText>(R.id.inputFromUser2)
        val ResultView = findViewById<TextView>(R.id.resView)
        AddButton.setOnClickListener {
            val a = InputFromUserOne.text.toString().toInt()
            val b = InputFromUserTwo.text.toString().toInt()
            ResultView.text=(a+b).toString()
        }
        SubsButton.setOnClickListener {
            val a = InputFromUserOne.text.toString().toInt()
            val b = InputFromUserTwo.text.toString().toInt()
            ResultView.text=(a-b).toString()
        }
        MulButton.setOnClickListener {
            val a = InputFromUserOne.text.toString().toInt()
            val b = InputFromUserTwo.text.toString().toInt()
            ResultView.text=(a*b).toString()
        }
        DivButton.setOnClickListener {
            val a = InputFromUserOne.text.toString().toInt()
            val b = InputFromUserTwo.text.toString().toInt()
            ResultView.text=(a/b).toString()
        }
    }

}