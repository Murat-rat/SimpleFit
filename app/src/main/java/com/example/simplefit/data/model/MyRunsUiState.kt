package com.example.simplefit.data.model

data class MyRunsUiState(
    val runs: List<RunItem> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)