package com.example.ejemplo_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import androidx.compose.ui.semantics.text

class MainActivity : AppCompatActivity() {

    private lateinit var editTextIngreso: EditText
    private lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextIngreso = findViewById(R.id.editTextIngreso)
        textViewResultado = findViewById(R.id.textViewResultado)

        editTextIngreso.setOnEditorActionListener { _, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE ||
                (event != null && event.action == KeyEvent.ACTION_DOWN && event.keyCode == KeyEvent.KEYCODE_ENTER)
            ) {
                val textoIngresado = editTextIngreso.text.toString()
                if (textoIngresado.isNotEmpty()) {
                    val textoInvertido = textoIngresado.reversed()
                    textViewResultado.text = textoInvertido
                } else {
                    textViewResultado.text = "Ingresa texto primero"
                }
                return@setOnEditorActionListener true
            }
            return@setOnEditorActionListener false
        }
    }
}