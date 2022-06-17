package com.example.simulador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.widget.TextView
import com.example.simulador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //val Hello = findViewById<TextView>(R.id.tvHello)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvHello.text = "teste"
    }
}