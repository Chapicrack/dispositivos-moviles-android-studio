package com.example.p3e3

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val repro = findViewById<Button>(R.id.reproducir)
        val stop = findViewById<Button>(R.id.pause)
        val det = findViewById<Button>(R.id.detener)
        val reproductor=MediaPlayer.create(this,R.raw.micdrop)
        repro.setOnClickListener{
            if(reproductor.isPlaying){
                reproductor.pause()
            }
            else{
                reproductor.start()
            }
        }
    }
}