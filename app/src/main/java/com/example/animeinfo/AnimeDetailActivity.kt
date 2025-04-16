package com.example.animeinfo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.animeinfo.databinding.ActivityAnimeDetailBinding

class AnimeDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnimeDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.btnRent.setOnClickListener {
            Toast.makeText(this, "Rent button clicked", Toast.LENGTH_SHORT).show()
        }

        binding.btnBuy.setOnClickListener {
            Toast.makeText(this, "Buy button clicked", Toast.LENGTH_SHORT).show()
        }
    }
} 