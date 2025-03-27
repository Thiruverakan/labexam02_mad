package com.example.labtest02_it23231078

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class HouseActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.house)

        // Back arrow navigation
        val housearrow = findViewById<ImageView>(R.id.housearrow)
        housearrow.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        // First register button
        val reg1 = findViewById<Button>(R.id.reg1)
        reg1.setOnClickListener {
            val intent = Intent(this, PaymentmethodActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Second register button (reg2)
        val reg2 = findViewById<Button>(R.id.reg2)
        reg2.setOnClickListener {
            val intent = Intent(this, PaymentmethodActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Third button (button4)
        val button4 = findViewById<Button>(R.id.reg3)
        button4.setOnClickListener {
            val intent = Intent(this, PaymentmethodActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Fourth button (button5)
        val button5 = findViewById<Button>(R.id.reg4)
        button5.setOnClickListener {
            val intent = Intent(this, PaymentmethodActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}