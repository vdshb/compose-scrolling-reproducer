/*
 * Copyright (c) 2023 Vadim Shabanov.
 */

import androidx.compose.foundation.HorizontalScrollbar
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.LocalTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp

@Composable
fun Snippet(text: String) {
    val horizontalScrollState = rememberScrollState()
    Box(modifier = Modifier.fillMaxSize()) {
        BasicTextField(
            enabled = true,
            value = text,
            onValueChange = {},
            textStyle = LocalTextStyle.current.copy(fontFamily = FontFamily.Monospace),
            modifier = Modifier
                .padding(bottom = 15.dp, top = 5.dp, start = 5.dp, end = 5.dp)
                .fillMaxWidth()
                .horizontalScroll(horizontalScrollState)
        )
        HorizontalScrollbar(
            modifier = Modifier.fillMaxWidth().height(10.dp).align(Alignment.BottomStart),
            adapter = rememberScrollbarAdapter(scrollState = horizontalScrollState)
        )
    }
}