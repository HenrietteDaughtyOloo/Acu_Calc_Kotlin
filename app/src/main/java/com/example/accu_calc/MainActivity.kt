package com.example.accu_calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Input
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tvStart: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvStart = findViewById(R.id.tvStart)
        tvStart.setOnClickListener {
            val intent = Intent(this, page2Activity::class.java)
            startActivity(intent)
            //val intent = Intent(this, page2Activity::class.java)
            //            startActivity(intent)

        }
    }




}