package com.example.thucodegiaodien



import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class AdminActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var titleText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityadmin)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        titleText = findViewById(R.id.titleText)

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
    }
}
