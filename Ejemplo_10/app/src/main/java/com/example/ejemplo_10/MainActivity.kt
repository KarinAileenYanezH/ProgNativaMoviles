package com.example.ejemplo_10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.compose.ui.semantics.text

class MainActivity : AppCompatActivity() {

    private lateinit var etTexto: EditText
    private lateinit var btnVerificar: Button
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTexto = findViewById(R.id.etTexto)
        btnVerificar = findViewById(R.id.btnVerificar)
        tvResultado = findViewById(R.id.tvResultado)

        btnVerificar.setOnClickListener {
            verificarPalindromo()
        }
    }

    private fun verificarPalindromo() {
        val texto = etTexto.text.toString()

        if (texto.isEmpty()) {
            Toast.makeText(this, "Por favor, ingresa un texto", Toast.LENGTH_SHORT).show()
            return
        }

        val textoSinEspacios = texto.replace("\\s".toRegex(), "").lowercase()
        val textoInvertido = textoSinEspacios.reversed()

        if (textoSinEspacios == textoInvertido) {
            tvResultado.text = "Resultado: Es un palíndromo"
        } else {
            tvResultado.text = "Resultado: No es un palíndromo"
        }
    }
}