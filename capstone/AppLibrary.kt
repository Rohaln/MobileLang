package com.example.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.connectfour.ConnectFour

class AppLibrary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_library)

        val btnComp = findViewById<Button>(R.id.btnComp)
        val btnMusic = findViewById<Button>(R.id.btnMusic)
        val btnWeather = findViewById<Button>(R.id.btnWeather)
        val btnNote = findViewById<Button>(R.id.btnNote)
        val btnBattle = findViewById<Button>(R.id.btnBattle)
        val btnTic = findViewById<Button>(R.id.btnTic)
        val btnConnect = findViewById<Button>(R.id.btnConnectFour)
        val btnHangman = findViewById<Button>(R.id.btnHangman)
        val btnChecker = findViewById<Button>(R.id.btnCheckers)

        btnComp.setOnClickListener {
            val intentStraightLine = Intent(this, compass::class.java)
            startActivity(intentStraightLine)
        }
        btnMusic.setOnClickListener {
            val intentStraightLine = Intent(this, Music::class.java)
            startActivity(intentStraightLine)
        }
        btnWeather.setOnClickListener {
            val intentStraightLine = Intent(this, Weather::class.java)
            startActivity(intentStraightLine)
        }
        btnNote.setOnClickListener {
            val intentStraightLine = Intent(this, Note::class.java)
            startActivity(intentStraightLine)
        }
        btnBattle.setOnClickListener {
            val intentStraightLine = Intent(this, BattleShip::class.java)
            startActivity(intentStraightLine)
        }
        btnBattle.setOnClickListener {
            val intentStraightLine = Intent(this, ConnectFour::class.java)
            startActivity(intentStraightLine)
        }
        btnHangman.setOnClickListener {
            val intentStraightLine = Intent(this, Hangman::class.java)
            startActivity(intentStraightLine)
        }
        btnChecker.setOnClickListener {
            val intentStraightLine = Intent(this, Checker::class.java)
            startActivity(intentStraightLine)
        }


    }
}
