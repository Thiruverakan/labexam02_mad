package com.example.labtest02_it23231078

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge


class Onboarding3Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboarding3)

        val onboarding3btn = findViewById<Button>(R.id.button3)
        onboarding3btn.setOnClickListener {
            val intent = Intent(this, GetstartedActivity::class.java)
            startActivity(intent)
            finish()
        }

        val arrow2 = findViewById<ImageView>(R.id.arrow2)
        arrow2.setOnClickListener {
            val intent = Intent(this, Onboarding2Activity::class.java)
            startActivity(intent)
            finish()
        }

        val skip3 = findViewById<TextView>(R.id.skip3)
        skip3.setOnClickListener {
            val intent = Intent(this, GetstartedActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}