package com.example.kspdatathon
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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

            "tell me a joke" -> "Why don't scientists trust atoms? Because they make up everything!"
            "thank you", "thanks" -> "You're welcome!"
            "bye", "goodbye" -> "Goodbye! Have a great day!"
            else -> "I'm sorry, I didn't understand that command. Can you please rephrase?"
        }
        displayMessage("Chatbot: $response")
    }}

