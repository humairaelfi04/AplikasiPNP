package com.humaira.latihan23september

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tekom : AppCompatActivity() {
    private lateinit var  btnBackTekom : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tekom)
        btnBackTekom = findViewById(R.id.btnBackTK)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnBackTekom.setOnClickListener(){
            val intentPassingData = Intent(this@Tekom,MainActivity::class.java)
            startActivity(intentPassingData)
        }

    }
}