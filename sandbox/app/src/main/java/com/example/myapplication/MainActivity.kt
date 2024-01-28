package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Row

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Greeting("Shreyas", from = "Main Activity")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, from: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan, modifier = modifier, shape = MaterialTheme.shapes.medium
    ) {
        Text(
            text = "Hello, my name is $name!",
            fontSize = 100.sp,
            // full size
            lineHeight = 116.sp,
            modifier = modifier.padding(50.dp)
        )
    }
    Row {
        Text(
            text = "I am from $from!",
            fontSize = 36.sp,
            modifier = modifier.padding(24.dp)
        )
    }
}

@Preview(showBackground = true, name = "Light Mode", showSystemUi = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_NO)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting(name = "Shreyas", from = "Preview")
    }
}