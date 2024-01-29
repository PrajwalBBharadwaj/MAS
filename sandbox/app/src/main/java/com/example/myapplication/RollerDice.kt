package com.example.myapplication

import android.os.Bundle
import android.os.Message
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.stringResource
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.Spacer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.Image
import androidx.compose.ui.layout.ContentScale
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import com.example.myapplication.ui.theme.MyApplicationTheme


class DiceRollerApp : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    DiceButtonWithImages(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center))
                }
            }
        }
    }
}


@Composable
fun DiceButtonWithImages(
    modifier: Modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)){
    var result by remember { mutableStateOf(1) }
    val imageResource = when (result) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    Column (
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.dice_1),
            contentDescription = imageResource.toString(),
            contentScale = androidx.compose.ui.layout.ContentScale.Crop,
            alpha = 0.5f,
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { result = (1..6).random()}) {
            Text(stringResource(id = R.string.roll), fontSize = 24.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun appInit() {
    DiceButtonWithImages(modifier = Modifier.fillMaxSize().wrapContentSize(Alignment.Center))
}