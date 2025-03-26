package com.example.labtest02_it23231078
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class Onboarding1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.onboarding1)

        val onboarding1btn = findViewById<Button>(R.id.button1)
        onboarding1btn.setOnClickListener {
            val intent = Intent(this, Onboarding2Activity::class.java)
            startActivity(intent)
            finish()
        }

        val skip1 = findViewById<TextView>(R.id.skip1)
        skip1.setOnClickListener {
            val intent = Intent(this, GetstartedActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
