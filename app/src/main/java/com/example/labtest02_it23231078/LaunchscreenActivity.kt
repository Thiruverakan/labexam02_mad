package com.example.labtest02_it23231078

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

@SuppressLint("CustomSplashScreen")
class LaunchscreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.launchscreen)

        // Wait for 3 seconds before navigating to the Onboarding screen
        Handler(Looper.getMainLooper()).postDelayed({

            val intent = Intent(this, Onboarding1Activity::class.java)
            startActivity(intent)
            finish()
        }, 4000)
    }
}
