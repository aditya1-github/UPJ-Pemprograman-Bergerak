package com.kotlin.example.myfirstappatupjuniversity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KubusActivity : AppCompatActivity() {
    // declaration object variable
    lateinit var btnPrev: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kubus)

        btnPrev = findViewById(R.id.bPrev)

        btnPrev.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}