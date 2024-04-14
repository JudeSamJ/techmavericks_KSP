package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class Tasks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tasks)
        val rewardButton: ImageButton = findViewById(R.id.profile_button)
        rewardButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }
        val acceptButton: Button = findViewById(R.id.button7)
        acceptButton.setOnClickListener { view ->
            Snackbar.make(view, "Accept Button clicked!", Snackbar.LENGTH_SHORT)
                .setAction("Undo") {
                }
                .show()
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)


            }
        val rejectButton: Button = findViewById(R.id.button19)
        rejectButton.setOnClickListener { view ->
            Snackbar.make(view, "Reject Button clicked!", Snackbar.LENGTH_SHORT)
                .setAction("Undo") {
                }
                .show()
            val intentt = Intent(this, DashboardActivity::class.java)
            startActivity(intentt)
        }
    }
}