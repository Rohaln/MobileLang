package com.example.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConnectMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.connect_main)

        val btnPlay = findViewById<Button>(R.id.btnPlayConnnectFour)
        val btnInst = findViewById<Button>(R.id.btnInstConnect4)

        btnPlay.setOnClickListener {
            val play = Intent(this, ConnectFour::class.java)
            startActivity(play)

        }
        btnInst.setOnClickListener {
            val Instructions = Intent(this, InstructionsConnnectFour::class.java)
            startActivity(Instructions)
        }
    }
}