package com.example.kspdatathon

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.dashboard)

        val myButton: Button = findViewById(R.id.button2)
        myButton.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
            val fadeAnim = ObjectAnimator.ofFloat(myButton,"alpha",1.0f,0.0f)
            fadeAnim.setDuration(500)
            fadeAnim.start()

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
        val settingsButton: ImageButton = findViewById(R.id.btn_menu)
        settingsButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)

        }
        val articleButton: Button = findViewById(R.id.button5)
        articleButton.setOnClickListener {
            val intent = Intent(this, Article::class.java)
            startActivity(intent)
        }
        val taskButton: Button = findViewById(R.id.button1)
        taskButton.setOnClickListener {
            val intent = Intent(this, Tasks::class.java)
            startActivity(intent)
        }
    }
}