package com.example.shrine.ui.theme

import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

//val Purple200 = Color(0xFFBB86FC)
//val Purple500 = Color(0xFF6200EE)
//val Purple700 = Color(0xFF3700B3)
//val Teal200 = Color(0xFF03DAC5)

val shrinePink10 = Color(0xFFfffbfa)
val shrinePink50 = Color(0xFFfeeae6)
val shrinePink100 = Color(0xFFfedbd0)
val shrinePink300 = Color(0xFFfff0ea)
val shrinePink500 = Color(0xFFfbb8ac)
val shrinePink900 = Color(0xFF342c2e)


internal val ShrineLightColorPalatte = lightColors(
    primary = shrinePink100,
    onPrimary = shrinePink900 ,
    primaryVariant = shrinePink500,
    secondary = shrinePink50,
    background =  shrinePink100,
    surface = shrinePink10,
    error = Color(0xFFc5032b),
    onSecondary = shrinePink900,
    onBackground = shrinePink900,
    onSurface = shrinePink900,
    onError = shrinePink10


)