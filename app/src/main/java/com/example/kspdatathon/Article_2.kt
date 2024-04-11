package com.example.kspdatathon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Article_2:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.article3)

        val shareButton : Button = findViewById(R.id.reportShare)
        shareButton.setOnClickListener {
            val intent = Intent()
            intent.setAction(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,
                "Police in Mysore are investigating a data breach reported earlier this week. Banga Raju Pillai," +
                        " a resident of Alanahalli, filed a First Information Report (FIR) on August 15th, alleging that confidential data was stolen through hacking on August 14th." +
                        "The FIR mentions The Information Technology Act in connection with the hacking and data theft.  However, the specific nature of the stolen data and the potential impact remain unclear." +
                        "The police report also includes sections from the Indian Motor Vehicle Act and the Indian Evidence Act, though their relevance to this specific case is not immediately apparent." +
                        "Authorities have not identified any suspects at this time.  WHC Bajantri of the Alanahalli Police Station is assigned to lead the investigation."
            )
            intent.setType("text/plain")

            if (intent.resolveActivity(packageManager)!=null){
                startActivity(intent)
            }
        }
        val articleButton: ImageButton = findViewById(R.id.back_button)
        articleButton.setOnClickListener {
            val intent = Intent(this, Article_1::class.java)
            startActivity(intent)
        }
}}