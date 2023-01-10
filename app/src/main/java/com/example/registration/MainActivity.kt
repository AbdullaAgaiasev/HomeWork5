package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

//import androidx.appcompat.resources.Compatibility.Api21Impl.inflate
//import androidx.core.content.res.ColorStateListInflaterCompat.inflate
//import androidx.core.content.res.ComplexColorCompat.inflate
//import androidx.core.graphics.drawable.DrawableCompat.inflate

class MainActivity : AppCompatActivity() {

    lateinit var send_button: Button
    lateinit var send_text: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        send_button = findViewById(R.id.btn_button)
        send_text = findViewById(R.id.et_editText)
//        send_text = findViewById(R.id.et_edit_text2)

        // add the OnClickListener in sender button after clicked this button following Instruction will run
        send_button.setOnClickListener {
            // get the value which input by user in EditText and convert it to string
            val str = send_text.text.toString()
            // Create the Intent object of this class Context() to Second_activity class
            val intent = Intent(applicationContext, SecondActivity::class.java)
            // now by putExtra method put the value in key, value pair key is
            // message_key by this key we will receive the value, and put the string
            intent.putExtra("message_key", str)
            // start the Intent
            startActivity(intent)

        }
    }
}