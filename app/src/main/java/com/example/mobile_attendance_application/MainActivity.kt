package com.example.mobile_attendance_application

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var emailNameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        emailNameEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.btnSubmit)

        loginButton.setOnClickListener {
            val email = emailNameEditText.text.toString().trim()
            val password = passwordEditText.text.toString()

            if (email.isBlank() || password.isBlank()) {
                Toast.makeText(this, "An empty field has been detected, fill in all fields", Toast.LENGTH_SHORT).show()
            } else if (!isValidEmail(email)) {
                // Basic email format check
                Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_SHORT).show()
            } else {
                // Login successful (In a real app, this would check against a database)
                val intent = Intent(this, GridView::class.java) // Change to your desired main screen
                intent.putExtra("EXTRA_EMAIL", email)
                startActivity(intent)
                finish() // Prevents the user from pressing back to the login screen
            }
        }
    }

    private fun isValidEmail(target: CharSequence): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches()
    }
}