package com.example.worknet.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worknet.databinding.ActivityChoiceBinding

class Choice : AppCompatActivity() {
    private lateinit var binding: ActivityChoiceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityChoiceBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.jobOffer.setOnClickListener {
            startActivity(Intent(this, SignIn::class.java))
        }

        binding.jobSeeker.setOnClickListener {
            startActivity(Intent(this, SignIn::class.java))
        }
    }
}