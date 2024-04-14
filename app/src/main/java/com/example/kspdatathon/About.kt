package com.example.kspdatathon

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.os.Process // Import for Process.killProcess

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_about)

        val quitButton = findViewById<Button>(R.id.sosbutton)
        quitButton.setOnClickListener {
            Process.killProcess(Process.myPid())
        }
    }
}
