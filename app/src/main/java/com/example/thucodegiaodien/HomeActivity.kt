package com.example.thucodegiaodien

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var tvWelcome: TextView
    private lateinit var btnClose: Button
    private lateinit var titleText: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityhome)

        tvWelcome = findViewById(R.id.tvWelcome)
        btnClose = findViewById(R.id.btnClose)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        val name = intent.getStringExtra("username")
        tvWelcome.text = "Welcome, $name"
        val btnSendAndReceiver = findViewById<Button>(R.id.btnSendAndReceiver)
        btnSendAndReceiver.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }
        val btnCall = findViewById<Button>(R.id.btnCall)
        btnCall.setOnClickListener {
            val intent = Intent(this, CallActivity::class.java)
            startActivity(intent)
        }
        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    titleText.text = "Trang quản trị"
                    true
                }
                R.id.nav_view_products -> {
                    startActivity(Intent(this, ProductListActivity::class.java))
                    true
                }
                R.id.nav_add_product -> {
                    startActivity(Intent(this, AddProductActivity::class.java))
                    true
                }
                else -> false
            }
        }
        btnClose.setOnClickListener {
            finishAffinity()
        }
    }



}