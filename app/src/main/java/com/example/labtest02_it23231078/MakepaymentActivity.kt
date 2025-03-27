package com.example.labtest02_it23231078

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class MakepaymentActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.makepayment)


        val mparrow = findViewById<ImageView>(R.id.mparrow)
        mparrow.setOnClickListener {
            val intent = Intent(this, PaymentmethodActivity::class.java)
            startActivity(intent)
            finish()
        }


        val addpay = findViewById<Button>(R.id.addpay)
        addpay.setOnClickListener {
            val intent = Intent(this, PaymentsuccessActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
