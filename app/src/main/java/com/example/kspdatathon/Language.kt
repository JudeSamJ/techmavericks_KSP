package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Language:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lang)

        val langButton: ImageButton =findViewById(R.id.lang_button)
        langButton.setOnClickListener {
            val intent = Intent(this,Settings::class.java)
            startActivity(intent)
        }
    }
}