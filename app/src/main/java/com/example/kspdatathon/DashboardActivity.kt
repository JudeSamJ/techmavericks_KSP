package com.example.kspdatathon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

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
        val chatButton: Button = findViewById(R.id.button6)
        chatButton.setOnClickListener {
            val intent = Intent(this, ChatActivity::class.java)
            startActivity(intent)

        }
        val profileButton: ImageButton = findViewById(R.id.person_menu)
        profileButton.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
    }
}
