package com.example.simplefit.data.model

import com.google.gson.annotations.SerializedName

data class RunItem(
    val id: Int = 0,

    @SerializedName("usuario")
    val usuario: String,

    @SerializedName("tiempo")
    val tiempo: String,

    @SerializedName("distancia")
    val distancia: String,

    @SerializedName("velocidad")
    val velocidad: String,

    @SerializedName("fecha")
    val fecha: String
)