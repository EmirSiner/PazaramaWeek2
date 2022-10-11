package com.example.pazaramaweek2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val logIn=findViewById<Button>(R.id.btnLogin)
        val signUp= findViewById<Button>(R.id.btnSignup)
        val eMail=findViewById<EditText>(R.id.etEmail)
        val mainPassword=findViewById<EditText>(R.id.etpassword)
        signUp.setOnClickListener{
            val signIntent=Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(signIntent)

        }
        logIn.setOnClickListener{
            val logIntent=Intent(this@MainActivity, LoginActivity::class.java)
            logIntent.putExtra("email",eMail.text.toString())
            logIntent.putExtra("password",mainPassword.text.toString())
            startActivity(logIntent)
        }


    }



}
