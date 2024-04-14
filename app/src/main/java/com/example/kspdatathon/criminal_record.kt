package com.example.kspdatathon

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.allcodingtutorials.sqliteapplication.DBHelper

class criminal_record : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var contact: EditText
    lateinit var dob: EditText
    lateinit var insert: Button
    lateinit var update: Button
    lateinit var delete: Button
    lateinit var view: Button
    lateinit var db: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.criminal_record)


        name = findViewById(R.id.name)
        contact = findViewById(R.id.contact)
        dob = findViewById(R.id.dob)
        insert = findViewById(R.id.btnInsert)
        update = findViewById(R.id.btnUpdate)
        delete = findViewById(R.id.btnDelete)
        view = findViewById(R.id.btnView)

        db = DBHelper(this)

        // Enable buttons only if all fields have text
        val textWatcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                val enable = name.text.toString().isNotEmpty() &&
                        contact.text.toString().isNotEmpty() &&
                        dob.text.toString().isNotEmpty()
                insert.isEnabled = enable
                update.isEnabled = enable
                delete.isEnabled = name.text.toString().isNotEmpty()
            }

            override fun beforeTextChanged(
                s: CharSequence?,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        }

        name.addTextChangedListener(textWatcher)
        contact.addTextChangedListener(textWatcher)
        dob.addTextChangedListener(textWatcher)

        insert.setOnClickListener {
            val nameText = name.text.toString()
            val contactText = contact.text.toString()
            val dobText = dob.text.toString()

            if (db.insertuserdata(nameText, contactText, dobText)) {
                Toast.makeText(this, "New Entry Inserted", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show()
            }
        }

        update.setOnClickListener {
            val nameText = name.text.toString()
            val contactText = contact.text.toString()
            val dobText = dob.text.toString()

            if (db.updateuserdata(nameText, contactText, dobText)) {
                Toast.makeText(this, "Entry Updated", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Entry Not Updated", Toast.LENGTH_SHORT).show()
            }
        }

        delete.setOnClickListener {
            val nameText = name.text.toString()
            if (db.deletedata(nameText)) {
                Toast.makeText(this, "Entry Deleted", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Entry Not Deleted", Toast.LENGTH_SHORT).show()
            }
        }

        view.setOnClickListener {
            val cursor = db.getdata()
            if (cursor.count == 0) {
                Toast.makeText(this, "No Entry Exists", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val buffer = StringBuffer()
            while (cursor.moveToNext()) {
                buffer.append("Name :" + cursor.getString(0) + "\n")
                buffer.append("Contact :" + cursor.getString(1) + "\n")
                buffer.append("Date of Birth :" + cursor.getString(2) + "\n\n")
            }

            val builder = AlertDialog.Builder(this)
            builder.setCancelable(true)
            builder.setTitle("User Entries")
            builder.setMessage(buffer.toString())
            builder.show()
        }
    }
}