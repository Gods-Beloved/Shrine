package com.example.shrine.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable




@Composable
fun ShrineTheme( content: @Composable () -> Unit) {


    MaterialTheme(
        colors = ShrineLightColorPalatte,
        typography = ShrineTypography,
        shapes = ShrineShapes,
        content = content
    )
}