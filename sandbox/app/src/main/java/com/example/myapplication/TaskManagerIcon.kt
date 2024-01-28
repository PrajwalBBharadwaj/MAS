package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.ui.res.stringResource

@Composable
private fun __TaskManagerIcon(
    image : Painter,
    taskStatus : String,
    complement : String,
    modifier : Modifier = Modifier) {
    Column (
        modifier = Modifier.fillMaxWidth().fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = image,
            contentDescription = "Task Manager",
        )
        Text (
            text = taskStatus,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp)
        )
        Text (
            text = complement,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
        )
    }
}

@Composable
fun TaskManagerIcon() {
    __TaskManagerIcon(
        image = painterResource(id = R.drawable.ic_task_completed),
        taskStatus = stringResource(id = R.string.taskStatus),
        complement = stringResource(id = R.string.Complement),
        modifier = Modifier
    )
}

@Composable
@Preview(showBackground = true)
fun TaskManagerIconPreview() {
    TaskManagerIcon()
}