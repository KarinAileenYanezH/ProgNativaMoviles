package com.example.ejemplo_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btnMostrar: Button
    private lateinit var btnOcultar: Button
    private lateinit var miTexto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMostrar = findViewById(R.id.btnMostrar)
        btnOcultar = findViewById(R.id.btnOcultar)
        miTexto = findViewById(R.id.miTexto)

        btnMostrar.setOnClickListener {
            miTexto.visibility = View.VISIBLE
        }

        btnOcultar.setOnClickListener {
            miTexto.visibility = View.GONE
        }
    }
}