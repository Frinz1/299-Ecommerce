package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

@Suppress("DEPRECATION")
class activity_main_splashcreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_splashscreen)
        Handler().postDelayed({
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}