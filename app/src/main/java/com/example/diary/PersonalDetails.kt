package com.example.diary

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class PersonalDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personal_details)

        val button : Button = findViewById(R.id.button4)
        button.setOnClickListener{jump4()}

    }

    private fun jump4() {
        Toast.makeText(this, "You are now a registered user of our app", Toast.LENGTH_SHORT).show()
        val j = Intent(this, MainActivity::class.java)
        startActivity(j)

    }
}