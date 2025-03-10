package com.example.ejemplo_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.compose.ui.semantics.text

class MainActivity : AppCompatActivity() {

    private lateinit var editTextIngreso: EditText
    private lateinit var btnConcatenar: Button
    private lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextIngreso = findViewById(R.id.editTextIngreso)
        btnConcatenar = findViewById(R.id.btnConcatenar)
        textViewResultado = findViewById(R.id.textViewResultado)

        btnConcatenar.setOnClickListener {
            val textoIngresado = editTextIngreso.text.toString()
            if (textoIngresado.isNotEmpty()) {
                val textoConcatenado = "Texto Concatenado: $textoIngresado"
                textViewResultado.text = textoConcatenado
            } else {
                textViewResultado.text = "Ingresa texto primero"
            }
        }
    }
}