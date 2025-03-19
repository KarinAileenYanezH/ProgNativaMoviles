package com.example.ejemplo_6

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var etNumero1: EditText
    private lateinit var etNumero2: EditText
    private lateinit var btnSumar: Button
    private lateinit var btnRestar: Button
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumero1 = findViewById(R.id.etNumero1)
        etNumero2 = findViewById(R.id.etNumero2)
        btnSumar = findViewById(R.id.btnSumar)
        btnRestar = findViewById(R.id.btnRestar)
        tvResultado = findViewById(R.id.tvResultado)

        btnSumar.setOnClickListener {
            realizarOperacion("sumar")
        }

        btnRestar.setOnClickListener {
            realizarOperacion("restar")
        }
    }

    private fun realizarOperacion(operacion: String) {
        val numero1Str = etNumero1.text.toString()
        val numero2Str = etNumero2.text.toString()

        if (numero1Str.isEmpty() || numero2Str.isEmpty()) {
            Toast.makeText(this, "Por favor, ingresa ambos números", Toast.LENGTH_SHORT).show()
            return
        }

        val numero1 = numero1Str.toDoubleOrNull()
        val numero2 = numero2Str.toDoubleOrNull()

        if (numero1 == null || numero2 == null) {
            Toast.makeText(this, "Por favor, ingresa números válidos", Toast.LENGTH_SHORT).show()
            return
        }

        val resultado = when (operacion) {
            "sumar" -> numero1 + numero2
            "restar" -> numero1 - numero2
            else -> 0.0
        }

        tvResultado.text = "Resultado: $resultado"
    }
}
