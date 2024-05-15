package com.example.movietickets

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        var btnBookNow = findViewById<Button>(R.id.btnLogin)

        btnBookNow.setOnClickListener{
            val intent = Intent(this, Order_summery::class.java)
            startActivity(intent)
        }
    }
}