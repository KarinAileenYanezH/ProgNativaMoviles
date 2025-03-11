package com.example.ejemplo_5


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.compose.ui.layout.layout
import androidx.compose.ui.semantics.text
import java.util.Locale
import kotlin.text.format

class MainActivity : AppCompatActivity() {

    private lateinit var tvTimer: TextView
    private lateinit var btnStart: Button
    private lateinit var btnPause: Button
    private lateinit var btnReset: Button

    private var timer: CountDownTimer? = null
    private var timeLeftInMillis: Long = 0
    private var timerRunning: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTimer = findViewById(R.id.tvTimer)
        btnStart = findViewById(R.id.btnStart)
        btnPause = findViewById(R.id.btnPause)
        btnReset = findViewById(R.id.btnReset)

        timeLeftInMillis = 0 // Inicializar el tiempo a 0

        btnStart.setOnClickListener {
            if (!timerRunning) {
                startTimer()
            }
        }

        btnPause.setOnClickListener {
            if (timerRunning) {
                pauseTimer()
            }
        }

        btnReset.setOnClickListener {
            resetTimer()
        }

        updateCountDownText()
    }

    private fun startTimer() {
        timerRunning = true
        btnStart.text = "Reanudar"
        btnPause.text = "Pausar"

        timer = object : CountDownTimer(Long.MAX_VALUE, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeLeftInMillis += 1000
                updateCountDownText()
            }

            override fun onFinish() {
                timerRunning = false
                btnStart.text = "Iniciar"
                btnPause.text = "Pausar"
            }
        }.start()
    }

    private fun pauseTimer() {
        timer?.cancel()
        timerRunning = false
        btnStart.text = "Reanudar"
        btnPause.text = "Pausar"
    }

    private fun resetTimer() {
        timer?.cancel()
        timeLeftInMillis = 0
        timerRunning = false
        btnStart.text = "Iniciar"
        btnPause.text = "Pausar"
        updateCountDownText()
    }

    private fun updateCountDownText() {
        val hours = (timeLeftInMillis / 1000) / 3600
        val minutes = ((timeLeftInMillis / 1000) % 3600) / 60
        val seconds = (timeLeftInMillis / 1000) % 60

        val timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d:%02d", hours, minutes, seconds)
        tvTimer.text = timeLeftFormatted
    }
}