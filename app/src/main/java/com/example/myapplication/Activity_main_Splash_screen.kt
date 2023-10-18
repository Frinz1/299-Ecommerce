package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


class Activity_main_Splash_screen(intent: Intent) : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_splashscreen)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this,ActivityLogin::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}