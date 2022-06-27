package com.duran.fragment_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_main = findViewById<Button>(R.id.button1)
        val btn_menu = findViewById<Button>(R.id.button2)

    }
}