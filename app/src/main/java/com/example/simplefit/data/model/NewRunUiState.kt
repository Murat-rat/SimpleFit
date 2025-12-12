package com.example.simplefit.data.model

data class NewRunUiState(
    val tiempoSegundos: Long = 0,
    val distanciaMetros: Double = 0.0,
    val pasos: Int = 0,
    val isPaused: Boolean = false,
    val isFinished: Boolean = false
)