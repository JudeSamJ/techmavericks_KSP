package com.example.kspdatathon

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    // Dummy user credentials
    private val dummyEmail = "example@gmail.com"
    private val dummyPassword = "password123"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val emailEditText: EditText = findViewById(R.id.email_edit_text)
        val passwordEditText: EditText = findViewById(R.id.password_edit_text)
        val loginButton: Button = findViewById(R.id.login_button)

        loginButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (email == dummyEmail && password == dummyPassword) {
                // Credentials matched, navigate to Dashboard
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                finish() // Optionally finish this activity
            } else {
                // Credentials did not match, show error message
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }

        val policeButton: ImageButton = findViewById(R.id.policeit_button)
        policeButton.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://ksp.karnataka.gov.in/new-page/POLICE%20IT/en")
            )
            startActivity(intent)

        }
        val googleButton: ImageButton = findViewById(R.id.google_button)
        googleButton.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://hack2skill.com/login")
            )
            startActivity(intent)

        }
        val xButton: ImageButton = findViewById(R.id.x_button)
        xButton.setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://twitter.com/kspfactcheck")
            )
            startActivity(intent)

        }
    }
}
