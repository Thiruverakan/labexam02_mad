package com.example.labtest02_it23231078

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)

    }

    @Suppress("UNUSED_VARIABLE")
    val logbtn1 = findViewById<Button>(R.id.loginbtn)
    logbtn1.setOnClickListener {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }




}
