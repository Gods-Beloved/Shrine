package com.example.shrine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.shrine.ui.theme.ShrineTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShrineTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                }
            }
        }
    }
}
//
//@Preview()
//@Composable
//fun ShrineComponentTest() {
//
//
//
//}

//@Composable
//private fun ShrineButton() {
//    Button(onClick = { /*TODO*/ }) {
//        Icon(imageVector = Icons.Default.Face, contentDescription = "Face")
//        Spacer(modifier = Modifier.width(48.dp))
//        Text(text = "This is shrine button".uppercase())
//    }
//}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    ShrineTheme {

    }
}