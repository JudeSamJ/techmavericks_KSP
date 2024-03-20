package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Article_1:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.article2)
        val articleButton: ImageButton = findViewById(R.id.back_button)
        articleButton.setOnClickListener {
            val intent = Intent(this, Article::class.java)
            startActivity(intent)
        }
        val article_Button: Button = findViewById(R.id.generate_button)
        article_Button.setOnClickListener {
            val intent = Intent(this, Article_2::class.java)
            startActivity(intent)

        }
    }
}