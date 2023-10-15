package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.myapplication.databinding.ActivityStartBinding

class ActivityStart : AppCompatActivity() {
    private val binding: ActivityStartBinding by lazy {
        ActivityStartBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.buttonQ.setOnClickListener {
            val intent = Intent(this, ActivityLogin::class.java)
            startActivity(intent)

        }
    }
}