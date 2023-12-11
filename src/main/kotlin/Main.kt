/*
 * Copyright (c) 2023 Vadim Shabanov.
 */

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

private val stringChunk = " abcdefghyjklmnopqrstuvwxyzABCDEFGHYJKLMNOPQRSTUVWXYZ0123456789"
private val longString = stringChunk + stringChunk + stringChunk + stringChunk
private val text = (1..30).toList()
    .map { it.toString().padStart(2, '0') }
    .joinToString("\n") { "$it.$longString" }


@Composable
@Preview
fun App() {
    MaterialTheme {
        Box(modifier = Modifier.padding(100.dp).border(1.dp, Color.LightGray)) {
            Snippet(text)
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
