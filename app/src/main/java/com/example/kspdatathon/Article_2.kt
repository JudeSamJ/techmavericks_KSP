package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Article_2:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.article3)
        val articleButton: ImageButton = findViewById(R.id.back_button)
        articleButton.setOnClickListener {
            val intent = Intent(this, Article_1::class.java)
            startActivity(intent)
        }
}}