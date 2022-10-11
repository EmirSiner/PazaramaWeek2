package com.example.pazaramaweek2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val logBackBtn=findViewById<ImageButton>(R.id.logBack)
        val logEmail=findViewById<TextView>(R.id.logEmail)
        val logPassword=findViewById<TextView>(R.id.logPassword)
        val emailIntent=intent.getStringExtra("email")
        val passwordIntent=intent.getStringExtra("password")


        logEmail.text=emailIntent
        logPassword.text=passwordIntent
        logBackBtn.setOnClickListener {
            onBackPressed()
        }



    }

}