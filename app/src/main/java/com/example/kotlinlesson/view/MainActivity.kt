package com.example.kotlinlesson.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinlesson.R
import com.example.kotlinlesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

      if(savedInstanceState == null){
          supportFragmentManager
              .beginTransaction()
              .replace(R.id.container,MainFragment.newInstance())
              .commit()
      }

    }

}


