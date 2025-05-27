package com.example.thucodegiaodien

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var tvReceived: TextView
    private lateinit var btnBroadcast: Button
    private var receivedValue: Long = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        tvReceived = findViewById(R.id.tvReceived)
        btnBroadcast = findViewById(R.id.btnBroadcast)

        // Nhận dữ liệu
        receivedValue = intent.getLongExtra("key_value", 0L)
        tvReceived.text = "Received: $receivedValue"

        // Gửi broadcast
        btnBroadcast.setOnClickListener {
            val broadcastIntent = Intent("com.example.CUSTOM_ACTION")
            broadcastIntent.putExtra("broadcast_data", receivedValue)
            sendBroadcast(broadcastIntent)
        }
    }
}
