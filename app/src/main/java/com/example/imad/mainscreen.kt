package com.example.imad

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

    class mainscreen : AppCompatActivity() {
    lateinit var report: Button

    val min = arrayOf<String>("6", "10", "12", "5", "7", "21", "20")

    val max = arrayOf<String>("8", "14", "18", "10", "9", "19", "15")

    val condition = arrayOf<String>("cloudy", "cold", "sunny", "rain",
        "rain", "hot", "sunny")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mainscreen)

        // declaring the minimum weather
        val min1TextView = findViewById<TextView>(R.id.min1)
        val min2TextView = findViewById<TextView>(R.id.min2)
        val min3TextView = findViewById<TextView>(R.id.min3)
        val min4TextView = findViewById<TextView>(R.id.min4)
        val min5TextView = findViewById<TextView>(R.id.min5)
        val min6TextView = findViewById<TextView>(R.id.min6)
        val min7TextView = findViewById<TextView>(R.id.min7)

        // declaring the maximum weather
        val max1TextView = findViewById<TextView>(R.id.max1)
        val max2TextView = findViewById<TextView>(R.id.max2)
        val max3TextView = findViewById<TextView>(R.id.max3)
        val max4TextView = findViewById<TextView>(R.id.max4)
        val max5TextView = findViewById<TextView>(R.id.max5)
        val max6TextView = findViewById<TextView>(R.id.max6)
        val max7TextView = findViewById<TextView>(R.id.max7)

        // declaring the condition of the weather
        val condition1TextView = findViewById<TextView>(R.id.condition1)
        val condition2TextView = findViewById<TextView>(R.id.condition2)
        val condition3TextView = findViewById<TextView>(R.id.condition3)
        val condition4TextView = findViewById<TextView>(R.id.condition4)
        val condition5TextView = findViewById<TextView>(R.id.condition5)
        val condition6TextView = findViewById<TextView>(R.id.condition6)
        val condition7TextView = findViewById<TextView>(R.id.condition7)

        // setting minimum weather into the textview
        min1TextView.text = min[0]
        min2TextView.text = min[1]
        min3TextView.text = min[2]
        min4TextView.text = min[3]
        min5TextView.text = min[4]
        min6TextView.text = min[5]
        min7TextView.text = min[6]

        // setting maximum weather into the textview
        max1TextView.text = max[0]
        max2TextView.text = max[1]
        max3TextView.text = max[2]
        max4TextView.text = max[3]
        max5TextView.text = max[4]
        max6TextView.text = max[5]
        max7TextView.text = max[6]

        // setting the weather conditions into the textview
        condition1TextView.text = condition[0]
        condition2TextView.text = condition[1]
        condition3TextView.text = condition[2]
        condition4TextView.text = condition[3]
        condition5TextView.text = condition[4]
        condition6TextView.text = condition[5]
        condition7TextView.text = condition[6]

        val ReportActivityButton = findViewById<Button>(R.id.detailbtn)

        ReportActivityButton.setOnClickListener {
            val intent = Intent(this, report::class.java)
            startActivity(intent)
        }
    }
}