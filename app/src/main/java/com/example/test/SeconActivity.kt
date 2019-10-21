package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SeconActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btn.setOnClickListener {
            Toast.makeText(this,"sign up", Toast.LENGTH_SHORT).show()

            val  intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

    }
}