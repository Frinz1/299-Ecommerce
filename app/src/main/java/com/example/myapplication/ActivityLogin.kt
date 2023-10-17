package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityLoginBinding

class ActivityLogin : AppCompatActivity() {
    private val binding:ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val intent=Intent(this,ActivityRegister::class.java)
            startActivity(intent)

        }
        binding.donthavebutton.setOnClickListener {
            val intent=Intent(this,ActivityRegister::class.java)
            startActivity(intent)

        }
    }
}