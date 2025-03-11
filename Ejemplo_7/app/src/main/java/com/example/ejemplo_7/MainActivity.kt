package com.example.ejemplo_7

import android.graphics.Paint
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.compose.ui.semantics.text

class MainActivity : AppCompatActivity() {

    private lateinit var etTexto: EditText
    private lateinit var btnNegrita: Button
    private lateinit var btnCursiva: Button
    private lateinit var btnSubrayado: Button
    private lateinit var tvTexto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etTexto = findViewById(R.id.etTexto)
        btnNegrita = findViewById(R.id.btnNegrita)
        btnCursiva = findViewById(R.id.btnCursiva)
        btnSubrayado = findViewById(R.id.btnSubrayado)
        tvTexto = findViewById(R.id.tvTexto)

        btnNegrita.setOnClickListener {
            aplicarEstilo(Typeface.BOLD)
        }

        btnCursiva.setOnClickListener {
            aplicarEstilo(Typeface.ITALIC)
        }

        btnSubrayado.setOnClickListener {
            aplicarSubrayado()
        }
    }

    private fun aplicarEstilo(style: Int) {
        val texto = etTexto.text.toString()
        tvTexto.text = texto
        tvTexto.setTypeface(null, style)
        tvTexto.paintFlags = tvTexto.paintFlags and Paint.UNDERLINE_TEXT_FLAG.inv()
    }

    private fun aplicarSubrayado() {
        val texto = etTexto.text.toString()
        tvTexto.text = texto
        tvTexto.paintFlags = tvTexto.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        tvTexto.setTypeface(null, Typeface.NORMAL)
    }
}