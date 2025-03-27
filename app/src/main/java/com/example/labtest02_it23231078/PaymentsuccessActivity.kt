package com.example.labtest02_it23231078

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class PaymentsuccessActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.paymentsuccess)

        // Wait for 3 seconds before navigating to the Onboarding screen
        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000)

    }
}
