package com.example.ejemplo_8

import androidx.compose.ui.semantics.text


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var etTemperatura: EditText
    private lateinit var rgTipoConversion: RadioGroup
    private lateinit var rbCelsiusAFahrenheit: RadioButton
    private lateinit var rbFahrenheitACelsius: RadioButton
    private lateinit var btnConvertir: Button
    private lateinit var tvResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTemperatura = findViewById(R.id.etTemperatura)
        rgTipoConversion = findViewById(R.id.rgTipoConversion)
        rbCelsiusAFahrenheit = findViewById(R.id.rbCelsiusAFahrenheit)
        rbFahrenheitACelsius = findViewById(R.id.rbFahrenheitACelsius)
        btnConvertir = findViewById(R.id.btnConvertir)
        tvResultado = findViewById(R.id.tvResultado)

        btnConvertir.setOnClickListener {
            convertirTemperatura()
        }
    }

    private fun convertirTemperatura() {
        val temperaturaStr = etTemperatura.text.toString()

        if (temperaturaStr.isEmpty()) {
            Toast.makeText(this, "Por favor, ingresa una temperatura", Toast.LENGTH_SHORT).show()
            return
        }

        val temperatura = temperaturaStr.toDoubleOrNull()

        if (temperatura == null) {
            Toast.makeText(this, "Por favor, ingresa una temperatura válida", Toast.LENGTH_SHORT).show()
            return
        }

        val resultado: Double
        val tipoConversion: String

        if (rbCelsiusAFahrenheit.isChecked) {
            resultado = (temperatura * 9 / 5) + 32
            tipoConversion = "Fahrenheit"
        } else {
            resultado = (temperatura - 32) * 5 / 9
            tipoConversion = "Celsius"
        }

        tvResultado.text = String.format("Resultado: %.2f %s", resultado, tipoConversion)
    }
}