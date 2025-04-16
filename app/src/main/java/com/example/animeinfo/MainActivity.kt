package com.example.animeinfo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Launch AnimeDetailActivity
        startActivity(Intent(this, AnimeDetailActivity::class.java))
        finish() // Close MainActivity
    }
}