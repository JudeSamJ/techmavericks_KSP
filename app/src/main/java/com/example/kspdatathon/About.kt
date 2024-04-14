package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Process // Import for Process.killProcess
import android.widget.ImageButton

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_about)
        val profileButton: ImageButton = findViewById(R.id.imageButton)
        profileButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
        }
    }

