package com.example.thucodegiaodien

import android.app.Activity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class CallActivity : Activity() {

    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var button4: Button
    private lateinit var button5: Button
    private lateinit var button6: Button
    private lateinit var button7: Button
    private lateinit var button8: Button
    private lateinit var button9: Button
    private lateinit var button0: Button
    private lateinit var buttonStar: Button
    private lateinit var buttonClear: Button
    private lateinit var numberView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        numberView = findViewById(R.id.number_display)
        button1 = findViewById(R.id.button1)
        button2 = findViewById(R.id.button2)
        button3 = findViewById(R.id.button3)
        button4 = findViewById(R.id.button4)
        button5 = findViewById(R.id.button5)
        button6 = findViewById(R.id.button6)
        button7 = findViewById(R.id.button7)
        button8 = findViewById(R.id.button8)
        button9 = findViewById(R.id.button9)
        button0 = findViewById(R.id.button0)
        buttonStar = findViewById(R.id.button_star)
        buttonClear = findViewById(R.id.button_clear)

        button1.setOnClickListener { appendString("1") }
        button2.setOnClickListener { appendString("2") }
        button3.setOnClickListener { appendString("3") }
        button4.setOnClickListener { appendString("4") }
        button5.setOnClickListener { appendString("5") }
        button6.setOnClickListener { appendString("6") }
        button7.setOnClickListener { appendString("7") }
        button8.setOnClickListener { appendString("8") }
        button9.setOnClickListener { appendString("9") }
        button0.setOnClickListener { appendString("0") }
        buttonStar.setOnClickListener { appendString("*") }

        buttonClear.setOnClickListener {
            numberView.text = ""
        }
    }

    private fun appendString(str: String) {
        numberView.append(str)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.add(0, Menu.FIRST, 0, "Exit")?.setIcon(android.R.drawable.ic_delete)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            Menu.FIRST -> {
                finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
