package com.example.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Instructions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructions)

        val buttonPlay = findViewById<Button>(R.id.buttonPlay)

        buttonPlay.setOnClickListener {
            val play = Intent(this, Game::class.java)
            startActivity(play)
        }
    }
}