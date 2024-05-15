package com.example.movietickets

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class main_home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_home)

        var btnLionKing=findViewById<Button>(R.id.button3)

        btnLionKing.setOnClickListener{
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
        }


    }
}