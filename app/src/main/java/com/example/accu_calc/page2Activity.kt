package com.example.accu_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class page2Activity : AppCompatActivity() {

    lateinit var tvSelect: TextView
    lateinit var tvOutput: TextView
    lateinit var tilInput1: TextInputLayout
    lateinit var tilInput2: TextInputLayout
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button

    //    lateinit var etStart: Texthttps://appetize.io/app/zpilybwrk5vhw4sn4cvmutw22qInputEditText
    lateinit var etInput1: TextInputEditText
    lateinit var etInput2: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)
        castView()
    }

    fun castView() {
        tvSelect = findViewById(R.id.tvSelect)
        tilInput1 = findViewById(R.id.tilInput1)
        tilInput2 = findViewById(R.id.tilInput2)
        btnAdd = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        etInput1 = findViewById(R.id.etInput1)
        etInput2 = findViewById(R.id.etInput2)
        tvOutput = findViewById(R.id.tvOutput)

//THE FUNCTIONLITY OF THE CALCULATOR COMPONENTS

        btnAdd.setOnClickListener {

            val num1 = etInput1.text.toString()
            val num2 = etInput2.text.toString()
            if (num1.isBlank() || num2.isBlank()) {
                tvOutput.text = "Please put in a valid number"
            } else {
                val num1 = etInput1.text.toString().toInt()
                val num2 = etInput2.text.toString().toInt()
                val finalAnswer = num1 + num2
                tvOutput.text = "Result: $finalAnswer"
            }

        }
        btnSubtract.setOnClickListener {
            val num1 = etInput1.text.toString()
            val num2 = etInput2.text.toString()
            if (num1.isBlank() || num2.isBlank()) {
                tvOutput.text = "Please put in a valid number"
            } else {
                val num1 = etInput1.text.toString().toInt()
                val num2 = etInput2.text.toString().toInt()
                val finalAnswer = num1 - num2
                tvOutput.text = "Result: $finalAnswer"
            }
        }


        btnMultiply.setOnClickListener {
            val num1 = etInput1.text.toString()
            val num2 = etInput2.text.toString()
            if (num1.isBlank() || num2.isBlank()) {
                tvOutput.text = "Please put in a valid number"
            } else {
                val num1 = etInput1.text.toString().toInt()
                val num2 = etInput2.text.toString().toInt()
                val finalAnswer = num1 * num2
                tvOutput.text = "Result: $finalAnswer"
            }
        }

        btnModulus.setOnClickListener {
            val num1 = etInput1.text.toString()
            val num2 = etInput2.text.toString()
            val number1 = etInput1.text.toString().toInt()
            val number2 = etInput2.text.toString().toInt()
            if (num1.isBlank() || num2.isBlank()) {
                tvOutput.text = "Please put in a valid number"

            }
            else if (number2 == 0) {
                tvOutput.text = "Result: Wrong Syntax"
            }
            else {
                val finalAnswer = number1 % number2
                    tvOutput.text = "Result: $finalAnswer"
                }
            }
//            if ((num2 == 0) {
//                    tvOutput.text = "Result: Wrong Syntax"
//                })

        }
    }

    fun validateCalculate() {


    }


