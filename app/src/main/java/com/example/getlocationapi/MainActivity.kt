package com.example.getlocationapi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLocation = findViewById<Button>(R.id.btnLocation)
        btnLocation.setBackgroundColor(Color.parseColor("#3FC0C8"))// Change to any color you want
    }
}