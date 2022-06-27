package com.duran.fragment_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.duran.fragment_ex.fragment.MainFragment
import com.duran.fragment_ex.fragment.MenuFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment_main = MainFragment()
        val fragment_menu = MenuFragment()

        val btn_main = findViewById<Button>(R.id.button1)
        val btn_menu = findViewById<Button>(R.id.button2)

        btn_main.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.ft_main, fragment_main).commit()
        }

        btn_menu.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.ft_main, fragment_menu).commit()
        }

        fun changeFragment(index: Int) {
            when(index) {
                1 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.ft_main, fragment_main)
                }
                2 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.ft_main, fragment_menu)
                }
            }
        }

    }
}