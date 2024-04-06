package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Backup:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.backup)

        val backupButton: ImageButton = findViewById(R.id.backup_button)
        backupButton.setOnClickListener {
            val intent = Intent(this,Settings::class.java)
            startActivity(intent)
        }
    }
}
