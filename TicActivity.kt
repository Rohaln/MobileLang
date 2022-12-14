package com.example.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tic_main)

        val btnPlay = findViewById<Button>(R.id.btnPlay)
        val btnInst = findViewById<Button>(R.id.btnInst)

        btnPlay.setOnClickListener {
            val play = Intent(this, Game::class.java)
            startActivity(play)

        }
        btnInst.setOnClickListener {
            val Instructions = Intent(this, Instructions::class.java)
            startActivity(Instructions)
        }
    }
}