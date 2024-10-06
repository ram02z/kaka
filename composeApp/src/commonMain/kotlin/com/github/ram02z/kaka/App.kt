package com.github.ram02z.kaka

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.kodein.emoji.Emoji
import org.kodein.emoji.smileys_emotion.face_costume.Poop

@Composable
@Preview
fun App() {
    MaterialTheme {
        var count: Int by rememberSaveable { mutableStateOf(0) }

        Column(
            Modifier.fillMaxWidth().padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                "You pooped $count times today",
                style = TextStyle(fontSize = 20.sp),
                textAlign = TextAlign.Center,
            )
            Button(
                modifier = Modifier.padding(top = 10.dp),
                onClick = { count += 1 },
            ) {
                Text("${Emoji.Poop}")
            }
        }
    }
}
