package com.duran.fragment_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.duran.fragment_ex.fragment.MainFragment
import com.duran.fragment_ex.fragment.MenuFragment
import com.duran.fragment_ex.fragment.SettingFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment_main = MainFragment()
        val fragment_menu = MenuFragment()
        val fragment_setting = SettingFragment()

        val btn_main = findViewById<Button>(R.id.button1)
        val btn_menu = findViewById<Button>(R.id.button2)
        val btn_setting = findViewById<Button>(R.id.button3)

        btn_main.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.ft_main, fragment_main).commit()
        }

        btn_menu.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.ft_main, fragment_menu).commit()
        }

        btn_setting.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.ft_main, fragment_setting).commit()
        }

    }
}