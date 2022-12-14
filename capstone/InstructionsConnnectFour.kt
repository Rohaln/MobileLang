package com.example.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InstructionsConnnectFour : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instructions_connnect_four)

        val buttonPlay = findViewById<Button>(R.id.buttonPlayConnectFour)

        buttonPlay.setOnClickListener {
            val play = Intent(this, ConnectFour::class.java)
            startActivity(play)
        }
    }
}