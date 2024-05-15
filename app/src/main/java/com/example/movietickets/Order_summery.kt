package com.example.movietickets

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Order_summery : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order_summery)

        var btnOrderConfirm = findViewById<Button>(R.id.button)

        btnOrderConfirm.setOnClickListener{
            val intent = Intent(this, Thankyou::class.java)
            startActivity(intent)
        }
    }
}