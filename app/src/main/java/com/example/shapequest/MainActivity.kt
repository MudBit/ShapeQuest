package com.example.shapequest

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToNextActivity(view: View?) {
        val intent = Intent(this, NextActivity::class.java)
        startActivity(intent)
    }
}