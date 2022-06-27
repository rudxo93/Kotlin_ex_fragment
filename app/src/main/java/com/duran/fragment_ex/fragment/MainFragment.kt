package com.duran.fragment_ex.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.duran.fragment_ex.MainActivity
import com.duran.fragment_ex.R
import com.duran.fragment_ex.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val btn_change_menu = view.findViewById<Button>(R.id.btn_change)
        val btn_change_setting = view.findViewById<Button>(R.id.btn_setting_change)

        btn_change_menu.setOnClickListener {
            val fragment = MenuFragment()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.ft_main, fragment).commit()
        }

        btn_change_setting.setOnClickListener {
            val fragment = SettingFragment()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.ft_main, fragment).commit()
        }

        return view
    }

}