package com.example.ejemplo_11

import androidx.compose.ui.semantics.text


import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var etFechaNacimiento: EditText
    private lateinit var tvEdad: TextView
    private val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etFechaNacimiento = findViewById(R.id.etFechaNacimiento)
        tvEdad = findViewById(R.id.tvEdad)

        etFechaNacimiento.setOnClickListener {
            mostrarDatePickerDialog()
        }
    }

    private fun mostrarDatePickerDialog() {
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            { _, yearSelected, monthOfYear, dayOfMonth ->
                calendar.set(yearSelected, monthOfYear, dayOfMonth)
                actualizarFechaEnEditText()
                calcularEdad()
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }

    private fun actualizarFechaEnEditText() {
        val formatoFecha = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        etFechaNacimiento.setText(formatoFecha.format(calendar.time))
    }

    private fun calcularEdad() {
        val fechaNacimiento = calendar.time
        val fechaActual = Calendar.getInstance().time

        val diferencia = fechaActual.time - fechaNacimiento.time
        val edadEnAños = (diferencia / (1000L * 60 * 60 * 24 * 365)).toInt()

        tvEdad.text = "Tu edad es: $edadEnAños años"
    }
}