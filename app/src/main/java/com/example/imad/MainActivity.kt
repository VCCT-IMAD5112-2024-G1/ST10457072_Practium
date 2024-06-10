package com.example.imadexam

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.imad.R

//uhhu
class MainActivity : AppCompatActivity() {
    lateinit var MainScreen: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        MainScreen = findViewById<Button>(R.id.mainbtn)

        MainScreen.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)
        }
    }
}