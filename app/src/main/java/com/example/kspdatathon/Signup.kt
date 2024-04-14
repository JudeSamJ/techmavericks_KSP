package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {
    private val dummyEmail = "example@gmail.com"
    private val dummyPassword = "password123"
    private val dummyUser = "bajantri"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
        val emailEditText: EditText = findViewById(R.id.signup_email)
        val passwordEditText: EditText = findViewById(R.id.signup_password)
        val signupusername: EditText = findViewById(R.id.signup_username)
        val signup_confirm_password: EditText = findViewById(R.id.signup_confirm_password)

        val signupLogin: Button = findViewById(R.id.signup_button)
        signupLogin.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
            val username = signupusername.text.toString().trim()
            val confirm_password = signup_confirm_password.text.toString().trim()

            if (email == dummyEmail && password == dummyPassword && username == dummyUser && password == confirm_password) {
                // Credentials matched, navigate to Dashboard
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent)
                finish() // Optionally finish this activity
            } else {
                // Credentials did not match, show error message
                Toast.makeText(this, "Signup with the example credentials", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        val signup: Button = findViewById(R.id.login_button)
        signup.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
