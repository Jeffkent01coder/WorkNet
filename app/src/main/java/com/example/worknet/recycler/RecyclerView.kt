package com.example.worknet.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worknet.databinding.ActivityRecylerViewBinding

class RecyclerView : AppCompatActivity() {
    private lateinit var binding: ActivityRecylerViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRecylerViewBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}