package io.github.casl0.rockpaperscissors.ui.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Composable
private fun Nameplate(
    name: String,
    codeName: String,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(
            text = name,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Text(
            text = "($codeName)",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
    }
}

@Preview
@Composable
private fun NameplatePreview() {
    MaterialTheme {
        Nameplate(name = "You", codeName = "Orange Cupcake")
    }
}

@Composable
internal fun Nameplates(modifier: Modifier = Modifier) {
    // TODO: implement name and codename
    Row(modifier = modifier) {
        Nameplate(
            name = "You",
            codeName = "Orange Cupcake",
            modifier = Modifier.weight(1f)
        )
        Nameplate(
            name = "opponent",
            codeName = "none yet",
            modifier = Modifier.weight(1f)
        )
    }
}

@Preview
@Composable
private fun NameplatesPreview() {
    MaterialTheme {
        Nameplates(modifier = Modifier.fillMaxWidth())
    }
}
