package com.example.capstone

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class Note5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note5)
        val btnR = findViewById<Button>(R.id.btnReturn)
        var title = findViewById<TextView>(R.id.title)
        val etNote = findViewById<EditText>(R.id.etNote)
        val text = intent.getStringExtra("Title")
        var save: String? = ""

        val shared_pref = getSharedPreferences("Note", Context.MODE_PRIVATE)
        val shared_pref_editor = shared_pref.edit()

        save = shared_pref.getString("CONTENT5", "")

        etNote.setText(save)
        title.setText(text)

        btnR.setOnClickListener {
            save = etNote.text.toString()
            shared_pref_editor.putString("CONTENT5", save)
            shared_pref_editor.apply()
            finish()
        }
    }
}