package com.example.thucodegiaodien

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {

    private lateinit var edtValue: EditText
    private lateinit var btnSend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        edtValue = findViewById(R.id.edtValue)
        btnSend = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {
            val value = edtValue.text.toString().toLongOrNull() ?: 0L
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("key_value", value)
            startActivity(intent)
        }
    }
}
