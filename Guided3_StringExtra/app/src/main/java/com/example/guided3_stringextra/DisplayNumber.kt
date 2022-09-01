package com.example.guided3_stringextra

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent: Intent = intent
        val message: String? = intent.getStringExtra("inputanAngka")

        val textView = TextView(this)
        textView.setTextSize(40F)
        textView.setText("Angka yang anda inputkan adalah "+message)

        setContentView(textView)
    }
}