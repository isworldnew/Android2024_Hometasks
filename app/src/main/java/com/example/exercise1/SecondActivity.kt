package com.example.exercise1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.exercise1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = intent.extras?.getString("item").orEmpty()

        binding.btNotification.setOnClickListener {
            Toast.makeText(this, item, Toast.LENGTH_LONG).show()
        }
    }
}