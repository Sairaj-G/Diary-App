package com.example.diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Entry_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)
        val button : Button = findViewById(R.id.button)
        button.setOnClickListener{jump2()}

    }

    private fun jump2() {
        Toast.makeText(this, "Entry Made", Toast.LENGTH_SHORT).show()
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}