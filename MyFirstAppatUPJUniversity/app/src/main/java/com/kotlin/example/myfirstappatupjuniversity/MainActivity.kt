package com.kotlin.example.myfirstappatupjuniversity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    // declaration object variable
    lateinit var btnKubus: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contoh_layout_linear)
//        setContentView(R.layout.activity_main)

//        btnKubus = findViewById(R.id.bKubus)
//
//        btnKubus.setOnClickListener{
//            startActivity(Intent(this, KubusActivity::class.java))
//        }

    }
}