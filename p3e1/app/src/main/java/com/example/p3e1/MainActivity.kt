package com.example.p3e1

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val imagen=findViewById<ImageView>(R.id.imageView)
        imagen.setOnClickListener{
            Toast.makeText(this,"Duende Real",Toast.LENGTH_LONG).show()
        }
    }
}