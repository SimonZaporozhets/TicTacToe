package com.szaporozhets.tictactoe

import androidx.compose.ui.geometry.Rect


data class Cell(
    val id: Int = 0,
    val rect: Rect = Rect.Zero,
    var isClicked: Boolean = false
)
