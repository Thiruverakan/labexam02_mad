package com.example.labtest02_it23231078

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class PaymentmethodActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.paymentmethod)

        // Back arrow navigation
        val paymentarrow = findViewById<ImageView>(R.id.paymentarrow).apply {
            setOnClickListener {
                startActivity(Intent(this@PaymentmethodActivity, HouseActivity::class.java))
                finish()
            }
        }
//
        // Payment method selection
        val select = findViewById<ImageView>(R.id.select).apply {
            setOnClickListener {
                startActivity(Intent(this@PaymentmethodActivity, MakepaymentActivity::class.java))
                finish()
            }
        }
//
    }
}