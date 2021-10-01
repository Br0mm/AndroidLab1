package com.example.androidlab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_1_14)
        findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.rick_astley)
    }
}