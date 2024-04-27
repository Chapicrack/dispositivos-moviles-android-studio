package com.example.p3e2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val a = findViewById<EditText>(R.id.numero1).text.toString().toDouble()
    val b = findViewById<EditText>(R.id.numero2).text.toString().toDouble()
    var r = 0.0
    val c = findViewById<TextView>(R.id.respuesta)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val d = findViewById<Button>(R.id.suma)
        val e = findViewById<Button>(R.id.resta)
        val f = findViewById<Button>(R.id.multiplicacion)
        val g = findViewById<Button>(R.id.division)

        d.setOnClickListener{suma()}
        e.setOnClickListener{resta()}
        f.setOnClickListener{multiplicacion()}
        g.setOnClickListener{division()}

    }

    fun suma() {
        r = (a + b)
        c.text=r.toString()
    }

    fun resta() {
        r = (a - b)
        c.text=r.toString()
    }

    fun multiplicacion() {
        r = (a * b)
        c.text=r.toString()
    }

    fun division() {
        r = (a / b)
        c.text=r.toString()
    }
}