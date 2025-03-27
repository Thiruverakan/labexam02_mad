package com.example.labtest02_it23231078
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class Onboarding2Activity : ComponentActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboarding2)

        val onboarding2btn = findViewById<Button>(R.id.loginbtn)
        onboarding2btn.setOnClickListener {
            val intent = Intent(this, Onboarding3Activity::class.java)
            startActivity(intent)
            finish()
        }

        val arrow1 = findViewById<ImageView>(R.id.arrow1)
        arrow1.setOnClickListener {
            val intent = Intent(this, Onboarding1Activity::class.java)
            startActivity(intent)
            finish()
        }

        val skip2 = findViewById<TextView>(R.id.skip2)
        skip2.setOnClickListener {
            val intent = Intent(this, GetstartedActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}