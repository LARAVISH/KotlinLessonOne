package com.example.kotlinlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.text)//нашли текст
        val list = Repository.getAll() //получили список из репо

        for (s in list) {
            Log.d("myLog", "{$s}")
        }

        val homeWork = HomeWork("title1", "description10")// created object HW
        val homeWork1 = homeWork.copy(title = "title1")//created copy homeWork
        //  Log.d("myLog",homeWork.title2) вызов свойста тайтл2 из класса HW

        val btnClick = findViewById<Button>(R.id.btn_click)// нашли кнопку
        btnClick.setOnClickListener {
            btnClick.text =
                homeWork.title // при клике на кнопку меняется текст  на "title1" из  homeWork = HomeWork
            text.text = homeWork1.description// меняется текст на "description10" из копии объекта
        }

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottomNavigationView.setOnItemSelectedListener { item: MenuItem ->

            when (item.itemId) {
                R.id.action_info ->
                    Toast.makeText(this, "Info", Toast.LENGTH_LONG).show()

                R.id.action_home ->
                    Toast.makeText(this, "Home", Toast.LENGTH_LONG).show()

            }
            false
        }

    }

}


