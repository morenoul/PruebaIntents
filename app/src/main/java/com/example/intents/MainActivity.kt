package com.example.intents

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.buttonBuscar.setOnClickListener {
            searchWeb("https://duckduckgo.com/")
        }
        setContentView(binding.root)
    }

        private fun searchWeb(query: String) {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(query))
            startActivity(intent)


        }
}