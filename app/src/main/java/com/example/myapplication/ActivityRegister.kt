package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.reflect.KProperty
import com.example.myapplication.databinding.ActivityRegisterBinding

class ActivityRegister : AppCompatActivity() {
    private val binding:ActivityRegisterBinding by lazy {
        ActivityRegisterBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.alreadyhavebutton.setOnClickListener {
            val intent = Intent (this,ActivityLogin::class.java)
            Activity_main_Splash_screen(intent)
        }
    }
}
