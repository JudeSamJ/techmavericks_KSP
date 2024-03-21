package com.example.kspdatathon

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        val myButton: Button = findViewById(R.id.login_button)
        myButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
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
