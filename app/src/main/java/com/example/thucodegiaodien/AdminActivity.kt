package com.example.thucodegiaodien



import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class AdminActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var titleText: TextView
    private lateinit var edtName: EditText
    private lateinit var btnLogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityadmin)
        edtName = findViewById(R.id.edtName)
        btnLogin = findViewById(R.id.btnLogin)
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        titleText = findViewById(R.id.titleText)

        btnLogin.setOnClickListener {
            val name = edtName.text.toString()
            if (name.isNotEmpty()) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("username", name)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
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
    }

    override fun onResume() {
        super.onResume()
        // Clear name field when return or reopen app
        edtName.text.clear()
    }
}
