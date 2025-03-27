package com.example.labtest02_it23231078

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class PaymentmethodActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.paymentmethod)

        val paymentarrow = findViewById<ImageView>(R.id.paymentarrow)
        paymentarrow.setOnClickListener {
            val intent = Intent(this, HouseActivity::class.java)
            startActivity(intent)
            finish()
        }

        val select = findViewById<ImageView>(R.id.select)
        select.setOnClickListener {
            val intent = Intent(this, MakepaymentActivity::class.java)
            startActivity(intent)
            finish()
        }

        val cnfpay = findViewById<ImageView>(R.id.cnfpay)
        cnfpay.setOnClickListener {
            val intent = Intent(this, MakepaymentActivity::class.java)
            startActivity(intent)
            finish()
        }




    }
}
