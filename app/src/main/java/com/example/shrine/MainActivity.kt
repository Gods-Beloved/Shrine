package com.example.shrine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", style = MaterialTheme.typography.h1)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    ShrineTheme {
         Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxSize()){
             Text(text = "h3 - Rubik", style = MaterialTheme.typography.h3)
             Text(text = "h4 - Rubik", style = MaterialTheme.typography.h4)
             Text(text = "h5 - Rubik", style = MaterialTheme.typography.h5)
             Text(text = "body1 - Rubik", style = MaterialTheme.typography.body1)
             Text(text = "body2 - Rubik", style = MaterialTheme.typography.body2)
             Text(text = "body2 - Rubik", style = MaterialTheme.typography.body2)
             Text(text = "button - Rubik", style = MaterialTheme.typography.button)
             Text(text = "caption - Rubik", style = MaterialTheme.typography.caption)

         }
    }
}