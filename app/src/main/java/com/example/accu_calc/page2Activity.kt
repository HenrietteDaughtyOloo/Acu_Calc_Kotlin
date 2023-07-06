package com.example.accu_calc_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.TextView
import com.example.accu_calc.databinding.ActivityPage2Binding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onResume() {
        super.onResume()
        binding.btnAdd.setOnClickListener { calculate("+") }
        binding.btnSubtract.setOnClickListener { calculate("-") }
        binding.btnMultiply.setOnClickListener { calculate("*") }
        binding.btnModulus.setOnClickListener { calculate("%") }
    }

    fun calculate(operation: String) {
        clearErrors()
        val num1 = binding.etInput1.text.toString()
        val num2 = binding.etInput2.text.toString()
        var error = false

        if (num1.isBlank()) {
            binding.tilInput1.error = "Num1 is required"
            error = true

        }
        if (num2.isBlank()) {
            binding.tilInput2.error = "Num2 is required"
            error = true


        }
        if (!error) {
            val firstNum = num1.toDouble()
            val secondNum = num2.toDouble()


            val result = when (operation) {
                "+" -> firstNum + secondNum
                "-" -> firstNum + secondNum
                "*" -> firstNum * secondNum
                "%" -> {
                    firstNum % secondNum
                }
                else -> throw Exception("Invalid operator")

            }
            binding.tvOutput.text = result.toString()
        }

    }

    fun clearErrors(){
        binding.tilInput1.error=null
        binding.tilInput2.error=null


    }
}
