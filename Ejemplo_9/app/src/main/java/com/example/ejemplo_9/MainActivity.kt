package com.example.ejemplo_9

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var btnCambiarColor: Button
    private lateinit var mainLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCambiarColor = findViewById(R.id.btnCambiarColor)
        mainLayout = findViewById(R.id.mainLayout)

        btnCambiarColor.setOnClickListener {
            cambiarColorDeFondo()
        }
    }

    private fun cambiarColorDeFondo() {
        val random = Random()
        val color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
        mainLayout.setBackgroundColor(color)
    }
}