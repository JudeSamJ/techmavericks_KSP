package com.example.kspdatathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.dashboard)

        val myButton: Button = findViewById(R.id.button2)
        myButton.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)


        }
        val recordButton: Button = findViewById(R.id.button4)
        recordButton.setOnClickListener {
            val intentt = Intent(this, criminal_record::class.java)
            startActivity(intentt)


        }

        val rewardButton: Button = findViewById(R.id.button3)
        rewardButton.setOnClickListener {
            val intent = Intent(this, RewardActivity::class.java)
            startActivity(intent)

        }
    }
}
