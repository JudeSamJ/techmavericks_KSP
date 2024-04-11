package com.example.kspdatathon

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.net.Uri
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.Manifest
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.app.ActivityCompat
import com.example.kspdatathon.databinding.Article1Binding
import java.io.File

class Article : AppCompatActivity() {
    private lateinit var binding: Article1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Article1Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.uploadButton.setOnClickListener { showFileChooser() }

        val articleButton: ImageButton = findViewById(R.id.back_button)
        articleButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }


    }
    private fun showFileChooser(){
        val intent = Intent(Intent.ACTION_GET_CONTENT)
        intent.type="*/*"
        intent.addCategory(Intent.CATEGORY_OPENABLE)
        try {
            startActivityForResult(Intent.createChooser(intent,"Select a file"),
                100)
        } catch (exception:Exception){
            Toast.makeText(this,"Please install a file manager.",Toast.LENGTH_SHORT).show()
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode==100 && resultCode== RESULT_OK && data != null){
            val uri: Uri? = data.data
            val path: String=uri?.path.toString()
            val file = File(path)
            binding.pathText.text = "Path: $path File name: ${file.name}".trimIndent()
    }
        super.onActivityResult(requestCode, resultCode, data)
    }
}