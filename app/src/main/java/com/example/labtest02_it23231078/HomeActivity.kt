package com.example.labtest02_it23231078

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.home)

        val houses = findViewById<ImageView>(R.id.house1)
        houses.setOnClickListener {
            val intent = Intent(this, HouseActivity::class.java)
            startActivity(intent)
            finish()
        }

        val rooms = findViewById<ImageView>(R.id.rooms)
        rooms.setOnClickListener {
            val intent = Intent(this, HouseActivity::class.java)
            startActivity(intent)
            finish()
        }

        val home1 = findViewById<ImageView>(R.id.home1)
        home1.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        val location1 = findViewById<ImageView>(R.id.location1)
        location1.setOnClickListener {
            val intent = Intent(this, LocationActivity::class.java)
            startActivity(intent)
            finish()
        }

        val settings1 = findViewById<ImageView>(R.id.settings1)
        settings1.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
            finish()
        }

        val account1 = findViewById<ImageView>(R.id.account1)
        account1.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
            finish()
        }



    }


}
