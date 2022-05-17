package com.example.kotlinlesson.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.kotlinlesson.reservation.HomeWork
import com.example.kotlinlesson.R
import com.example.kotlinlesson.databinding.ActivityMainBinding
import com.example.kotlinlesson.reservation.Repository
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnClick.text = "Ghbdtn"


    }

}


