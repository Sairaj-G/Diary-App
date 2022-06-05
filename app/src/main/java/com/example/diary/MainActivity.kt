package com.example.diary

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var layoutManager : RecyclerView.LayoutManager
    private lateinit var adapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerview : RecyclerView = findViewById(R.id.recyclerview)
        layoutManager = LinearLayoutManager(this)
        recyclerview.layoutManager= layoutManager
        adapter = RecyclerAdapter()
        recyclerview.adapter = adapter


        val button : Button = findViewById(R.id.button2)
        button.setOnClickListener{jump()}

        val button2 : Button = findViewById(R.id.button3)
        button2.setOnClickListener{jump3()}
    }

    private fun jump3() {
        val k = Intent(this, PersonalDetails::class.java)
        startActivity(k)
    }

    private fun jump() {
        val intent = Intent(this, Entry_Activity::class.java)
        startActivity(intent)
    }
}
