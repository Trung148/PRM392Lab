package com.example.thucodegiaodien

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        // Lấy dữ liệu từ Intent
        val value = intent?.getLongExtra("broadcast_data", -10L) ?: -10L
        val result = value + 10

        // Hiển thị Toast
        Toast.makeText(
            context,
            "Broadcast Receiver caught an Intent\nThe value stored in the Intent is: $result",
            Toast.LENGTH_LONG
        ).show()
    }
}
