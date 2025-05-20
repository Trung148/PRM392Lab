package com.example.thucodegiaodien

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity

class ProductListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        // Gắn nội dung tiêu đề (tùy chọn)
        findViewById<TextView>(R.id.titleText).text = "Danh sách sản phẩm"

        // Xử lý điều hướng menu dưới
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.nav_view_products // Đặt item hiện tại được chọn

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    startActivity(Intent(this, AdminActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.nav_view_products -> {
                    true // Đang ở trang này
                }
                R.id.nav_add_product -> {
                    startActivity(Intent(this, AddProductActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                else -> false
            }
        }
    }
}
