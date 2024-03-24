package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val emailEditText: EditText = findViewById(R.id.editTextTextEmailAddress)
        val passwordEditText: EditText = findViewById(R.id.password_edit_text)
        val signupButton: Button = findViewById(R.id.login_button)

        signupButton.setOnClickListener {
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
            } else {
                // Save user info
                saveUserInfo(email, password)

                // Navigate to login page
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish() // Optionally finish this activity
            }
        }
    }

    private fun saveUserInfo(email: String, password: String) {
        // Implement your logic to save user info here
        // For example, you can use SharedPreferences or a database
    }
}
