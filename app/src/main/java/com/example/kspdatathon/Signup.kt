package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val signupLogin: Button = findViewById(R.id.signup_login)
        signupLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        val signup: Button = findViewById(R.id.login_button)
        signup.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)

        }


    }
}