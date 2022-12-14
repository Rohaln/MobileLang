package com.example.capstone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Note : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note)

        val btn1 = findViewById<Button>(R.id.btnNote1)
        val btn2 = findViewById<Button>(R.id.btnNote2)
        val btn3 = findViewById<Button>(R.id.btnNote3)
        val btn4 = findViewById<Button>(R.id.btnNote4)
        val btn5 = findViewById<Button>(R.id.btnNote5)
        val btn6 = findViewById<Button>(R.id.btnNote6)
        val btn7 = findViewById<Button>(R.id.btnNote7)
        val btn8 = findViewById<Button>(R.id.btnNote8)
        val btn9 = findViewById<Button>(R.id.btnNote9)
        val title1 = findViewById<EditText>(R.id.titleNote1)
        val title2 = findViewById<EditText>(R.id.titleNote2)
        val title3 = findViewById<EditText>(R.id.titleNote3)
        val title4 = findViewById<EditText>(R.id.titleNote4)
        val title5 = findViewById<EditText>(R.id.titleNote5)
        val title6 = findViewById<EditText>(R.id.titleNote6)
        val title7 = findViewById<EditText>(R.id.titleNote7)
        val title8 = findViewById<EditText>(R.id.titleNote8)
        val title9 = findViewById<EditText>(R.id.titleNote9)
        btn1.setOnClickListener {
            val Note1 = Intent(this, Note1::class.java)
            Note1.putExtra("Title",title1.text.toString())
            startActivity(Note1)

        }
        btn2.setOnClickListener {
            val Note2 = Intent(this, Note2::class.java)
            Note2.putExtra("Title",title2.text.toString())
            startActivity(Note2)
        }
        btn3.setOnClickListener {
            val Note3 = Intent(this, Note3::class.java)
            Note3.putExtra("Title",title3.text.toString())
            startActivity(Note3)
        }
        btn4.setOnClickListener {
            val Note4 = Intent(this, Note4::class.java)
            Note4.putExtra("Title",title4.text.toString())
            startActivity(Note4)
        }
        btn5.setOnClickListener {
            val Note5 = Intent(this, Note5::class.java)
            Note5.putExtra("Title",title5.text.toString())
            startActivity(Note5)
        }
        btn6.setOnClickListener {
            val Note6 = Intent(this, Note6::class.java)
            Note6.putExtra("Title",title6.text.toString())
            startActivity(Note6)
        }
        btn7.setOnClickListener {
            val Note7 = Intent(this, Note7::class.java)
            Note7.putExtra("Title",title7.text.toString())
            startActivity(Note7)
        }
        btn8.setOnClickListener {
            val Note8 = Intent(this, Note8::class.java)
            Note8.putExtra("Title",title8.text.toString())
            startActivity(Note8)
        }
        btn9.setOnClickListener {
            val Note9 = Intent(this, Note9::class.java)
            Note9.putExtra("Title",title9.text.toString())
            startActivity(Note9)
        }
    }
}