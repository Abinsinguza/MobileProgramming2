 package com.example.perfect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.perfect.ui.theme.PerfectTheme

 class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PerfectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("EFFIE")

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
   Surface (color = Color.LightGray) {
       Text(
           text = "Hi, my name is $name!",
           modifier = modifier
       )

   }

}

 @Composable
 fun Greeting2(name: String, modifier: Modifier = Modifier) {
     Surface (color = Color.LightGray) {
         Text(
             text = "Hi, my name is $name!",
             modifier = modifier
         )

     }

 }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PerfectTheme {
        Greeting("Lasse")

    }
}