package com.example.thucodegiaodien

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity

class AddProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)

        // Gắn tiêu đề trang
        findViewById<TextView>(R.id.titleText).text = "Thêm sản phẩm mới"

        // Xử lý điều hướng menu dưới
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.nav_add_product

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, AdminActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.nav_view_products -> {
                    startActivity(Intent(this, ProductListActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.nav_add_product -> {
                    true // đang ở trang này
                }
                else -> false
            }
        }
    }
}
