package com.example.registration

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        var receiver_msg: TextView = findViewById(R.id.received_value_id)
            // create the get Intent object
            val intent = intent
            // receive the value by getStringExtra() method and
            // key must be same which is send by first activity
            val str = intent.getStringExtra("message_key")
            // display the string into textView
            receiver_msg.text = str

//        binding = ActivitySecondBinding.inflate(layoutInflater)
//
//        setContentView(binding.root)
//
//        val intent=getIntent()
//
//        binding.secondInfoTv.text = intent.getStringExtra("key").toString()
        }
}