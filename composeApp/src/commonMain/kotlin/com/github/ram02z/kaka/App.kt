package com.github.ram02z.kaka

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(viewModel: KakaViewModel = KakaViewModel()) {
    val count by viewModel.count.collectAsState()
    MaterialTheme {
        Counter(count, viewModel::increment, modifier = Modifier.fillMaxWidth())
    }
}
