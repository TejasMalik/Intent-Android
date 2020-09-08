package com.example.intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

const val KEY_1 = "Name"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener(View.OnClickListener {
            val i = Intent(this, Main2Activity::class.java)
            i.putExtra(KEY_1, "Tejas")
            startActivity(i)
        })

        mailBtn.setOnClickListener(View.OnClickListener {
            val email = editText.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_SENDTO
            i.data = Uri.parse("mailto:$email")
            i.putExtra(Intent.EXTRA_SUBJECT, "Implicit Intent")
            startActivity(i)
        })

        browseBtn.setOnClickListener(View.OnClickListener {
            val address = editText.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("http://$address")
            i.putExtra(Intent.EXTRA_SUBJECT, "Implicit Intent")
            startActivity(i)
        })

        dialBtn.setOnClickListener(View.OnClickListener {
            val mobile = editText.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:$mobile")
            i.putExtra(Intent.EXTRA_SUBJECT, "Implicit Intent")
            startActivity(i)
        })
    }
}
