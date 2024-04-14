package com.example.kspdatathon
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.kspdatathon.R

class ChatActivity : AppCompatActivity() {

    private lateinit var userInput: EditText
    private lateinit var sendButton: Button
    private lateinit var chatHistory: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.chatbot)

        val chatBack: ImageButton = findViewById(R.id.chat_back)
        chatBack.setOnClickListener {
            val intent = Intent(this,DashboardActivity::class.java)
            startActivity(intent)
        }

        userInput = findViewById(R.id.user_input)
        sendButton = findViewById(R.id.send_button)
        chatHistory = findViewById(R.id.chat_history)



        sendButton.setOnClickListener {
            val message = userInput.text.toString().trim()
            if (message.isNotEmpty()) {
                displayMessage("You: $message")
                respondToUser(message)
                userInput.text.clear()
            }
        }
    }

    private fun displayMessage(message: String) {
        chatHistory.append("$message\n")
    }

    private fun respondToUser(message: String) {
        val response = when (message.toLowerCase()) {
            "hello", "hi" -> "Hello! How can I assist you?"
            "how are you" -> "I'm just a chatbot, but thanks for asking!"
            "what's your name" -> "I'm a chatbot. You can call me Chatbot."
            "hey dude" -> "Hey Bro!"
            "hey there" -> "Hello There!"
            "good night" -> "Let the stars be with you"
            "tell me a joke" -> "Why don't scientists trust atoms? Because they make up everything!"
            "thank you", "thanks" -> "You're welcome!"
            "bye", "goodbye","see you around","see you later",-> "Goodbye! Have a great day!"
            "are you a bot" -> "Yes, I am a Bot."
            "can you help me","can you assist me" -> "How may i help you?"

            else -> "I'm sorry, I didn't understand that command. Can you please rephrase?"
        }
        displayMessage("Chatbot: $response")
    }}

