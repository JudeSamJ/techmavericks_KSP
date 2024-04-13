package com.example.kspdatathon

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageButton
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.BufferedReader
import java.io.InputStreamReader

class Evidence : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.evidencelog)

        val evidenceButton: ImageButton = findViewById(R.id.evidenceback)
        evidenceButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
        val logButton: Button = findViewById(R.id.createlogButton)
        logButton.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        val weapon_spinner = findViewById<Spinner>(R.id.weapon)
        val weapon_items = resources.getStringArray(R.array.weapon)
        val weapon_adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, weapon_items.toList())
        weapon_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        weapon_spinner.adapter = weapon_adapter

        val bio_spinner = findViewById<Spinner>(R.id.bio)
        val bio_items = resources.getStringArray(R.array.bio)
        val bio_adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, bio_items.toList())
        bio_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        bio_spinner.adapter = bio_adapter

        val trace_spinner = findViewById<Spinner>(R.id.trace)
        val trace_items = resources.getStringArray(R.array.trace)
        val trace_adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, trace_items.toList())
        trace_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        trace_spinner.adapter = trace_adapter

        val digital_spinner = findViewById<Spinner>(R.id.digital)
        val digital_items = resources.getStringArray(R.array.digital)
        val digital_adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, digital_items.toList())
        digital_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        digital_spinner.adapter = digital_adapter

        val firearm_spinner = findViewById<Spinner>(R.id.firearm)
        val firearm_items = resources.getStringArray(R.array.firearm)
        val firearm_adapter =
            ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, firearm_items.toList())
        firearm_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        firearm_spinner.adapter = firearm_adapter

        val createlog: Button = findViewById(R.id.createlogButton)

        createlog.setOnClickListener {

            val weaponSelection = weapon_spinner.selectedItem.toString()
            val bioSelection = bio_spinner.selectedItem.toString()
            val traceSelection = trace_spinner.selectedItem.toString()
            val digitalSelection = digital_spinner.selectedItem.toString()
            val firearmSelection = firearm_spinner.selectedItem.toString()

            val textContent = StringBuilder()
            textContent.appendLine("Weapon Used: $weaponSelection")
            textContent.appendLine("Biological Evidence: $bioSelection")
            textContent.appendLine("Trace Evidence: $traceSelection")
            textContent.appendLine("Digital Evidence: $digitalSelection")
            textContent.appendLine("Firearm Evidence: $firearmSelection")
// ... (similarly for other selections)

            try {
                val outputStream = openFileOutput("user_selections.txt", Context.MODE_PRIVATE)
                outputStream.write(textContent.toString().toByteArray())
                outputStream.close()
                Toast.makeText(this, "File created successfully!", Toast.LENGTH_SHORT).show()
                // Show a toast or notification to the user indicating successful file creation (optional)
            } catch (e: Exception) {
                // Handle potential exceptions like permission issues or file writing errors
                Log.e("FileWritingError", "Error writing to file:", e)
            }

            fun openTextFile() {
                try {
                    val inputStream = openFileInput("user_selections.txt")
                    val reader = BufferedReader(InputStreamReader(inputStream))
                    val textContent = StringBuilder()
                    var line: String? = null
                    while (reader.readLine().also { line = it } != null) {
                        textContent.appendLine(line)
                    }
                    reader.close()
                } catch (e: Exception) {
                    Log.e("FileOpeningError", "Error opening file:", e)
                }
            }

            openTextFile()
        }
    }
}
