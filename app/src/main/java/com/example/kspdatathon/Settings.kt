package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)

        val settingsButton: ImageButton = findViewById(R.id.settings_button)
        settingsButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        val evidenceButton: Button = findViewById(R.id.evidencelogButton)
        evidenceButton.setOnClickListener {
            val intent = Intent(this, Evidence::class.java)
            startActivity(intent)
        }
        val langButton: Button = findViewById(R.id.langButton)
        langButton.setOnClickListener {
            val intent = Intent(this, Language::class.java)
            startActivity(intent)
        }
        val aboutButton: Button = findViewById(R.id.aboutButton)
        aboutButton.setOnClickListener {
            val intent = Intent(this, About::class.java)
            startActivity(intent)
    }
}}