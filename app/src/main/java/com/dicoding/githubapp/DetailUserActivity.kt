package com.dicoding.githubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dicoding.githubapp.databinding.ActivityDetailUserBinding
import com.dicoding.githubapp.databinding.ItemUserBinding

class DetailUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}