package com.example.ejemplo_13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.compose.ui.semantics.text

class MainActivity : AppCompatActivity() {

    private lateinit var btnClick: Button
    private lateinit var tvContador: TextView
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnClick = findViewById(R.id.btnClick)
        tvContador = findViewById(R.id.tvContador)

        btnClick.setOnClickListener {
            contador++
            actualizarContador()
        }
    }

    private fun actualizarContador() {
        tvContador.text = "Clicks: $contador"
    }
}