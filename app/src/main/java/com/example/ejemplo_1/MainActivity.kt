package com.example.ejemplo_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btnAumentar: Button
    private lateinit var btnDisminuir: Button
    private lateinit var miTexto: TextView
    private var tamañoActual: Float = 16f // Tamaño inicial en sp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAumentar = findViewById(R.id.btnAumentar)
        btnDisminuir = findViewById(R.id.btnDisminuir)
        miTexto = findViewById(R.id.miTexto)

        btnAumentar.setOnClickListener {
            tamañoActual += 2f // Aumenta el tamaño en 2 sp
            miTexto.textSize = tamañoActual
        }

        btnDisminuir.setOnClickListener {
            tamañoActual -= 2f // Disminuye el tamaño en 2 sp
            miTexto.textSize = tamañoActual
        }
    }
}