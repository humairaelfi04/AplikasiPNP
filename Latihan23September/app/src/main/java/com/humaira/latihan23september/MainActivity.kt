package com.humaira.latihan23september

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnMI: Button
    private lateinit var btnTekom: Button
    private lateinit var  btnGaleri: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnMI = findViewById(R.id.btnMI)
        btnTekom = findViewById(R.id.btnTK)
        btnGaleri = findViewById(R.id.btnPhoto)

        btnMI.setOnClickListener{
            val intent = Intent(this@MainActivity, MI::class.java)
            startActivity(intent)
        }

        btnTekom.setOnClickListener{
            val intent = Intent(this@MainActivity, Tekom::class.java)
            startActivity(intent)
        }

        btnGaleri.setOnClickListener{
            val intent = Intent(this@MainActivity, Galeri::class.java)
            startActivity(intent)
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}