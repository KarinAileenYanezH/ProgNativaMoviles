package com.example.ejemplo_14

import androidx.compose.ui.semantics.text


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etNumero1: EditText
    private lateinit var etNumero2: EditText
    private lateinit var btnMultiplicar: Button
    private lateinit var btnDividir: Button
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNumero1 = findViewById(R.id.etNumero1)
        etNumero2 = findViewById(R.id.etNumero2)
        btnMultiplicar = findViewById(R.id.btnMultiplicar)
        btnDividir = findViewById(R.id.btnDividir)
        tvResultado = findViewById(R.id.tvResultado)

        btnMultiplicar.setOnClickListener {
            calcularResultado("*")
        }

        btnDividir.setOnClickListener {
            calcularResultado("/")
        }
    }

    private fun calcularResultado(operacion: String) {
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

        val resultado: Double

        when (operacion) {
            "*" -> resultado = numero1 * numero2
            "/" -> {
                if (numero2 == 0.0) {
                    Toast.makeText(this, "No se puede dividir por cero", Toast.LENGTH_SHORT).show()
                    return
                }
                resultado = numero1 / numero2
            }
            else -> {
                Toast.makeText(this, "Operación no válida", Toast.LENGTH_SHORT).show()
                return
            }
        }

        tvResultado.text = String.format("Resultado: %.2f", resultado)
    }
}