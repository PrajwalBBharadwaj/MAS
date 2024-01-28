package com.example.myapplication

import android.media.Image
import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.res.stringResource

class learningText : ComponentActivity() {
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
fun learningImage(title: String,
                  shortDescription: String,
                  longDescription: String,
                  image: Painter,
                  modifier: Modifier = Modifier) {
    // want the image to be only at the top of the screen
    Column(
        modifier = modifier,
    ) {
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text(
            text = shortDescription,
            modifier = Modifier.padding(start=16.dp, end=16.dp),
            textAlign = TextAlign.Justify,
        )
        Text(
            text = longDescription,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ArticleApp() {
    learningImage(
        title = stringResource(R.string.title_article_app),
        shortDescription = stringResource(id = R.string.short_desc),
        longDescription = stringResource(id = R.string.longDesc),
        image = painterResource(id = R.drawable.bg_compose_background),
    )
}

@Preview(showBackground = true)
@Composable
fun mainPreview() {
    MyApplicationTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            ArticleApp();
        }
    }
}
