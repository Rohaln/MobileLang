package com.example.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Hangman : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hangman)

        val btnHome = findViewById<Button>(R.id.btnPlay)

        btnHome.setOnClickListener {
            val intentStraightLine = Intent(this, HangGame::class.java)
            startActivity(intentStraightLine)


        }
    }
}
