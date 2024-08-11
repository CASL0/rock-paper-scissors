package io.github.casl0.rockpaperscissors.ui.common

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.github.casl0.rockpaperscissors.R

@Composable
private fun RpsButton(
    @DrawableRes drawableResource: Int,
    name: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier.background(MaterialTheme.colorScheme.tertiary)
    ) {
        Column(
            modifier = Modifier.wrapContentHeight(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(drawableResource),
                contentDescription = name,
                colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.onTertiary)
            )
            Text(
                text = name,
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.onTertiary
            )
        }
    }
}

@Preview
@Composable
private fun RpsButtonPreview() {
    MaterialTheme {
        RpsButton(R.drawable.rock, "ROCK", {})
    }
}

@Composable
internal fun RpsButtons(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        RpsButton(
            drawableResource = R.drawable.rock,
            name = stringResource(R.string.rock),
            onClick = { /* TODO: implement */ },
            modifier = Modifier.width(80.dp)
        )
        RpsButton(
            drawableResource = R.drawable.paper,
            name = stringResource(R.string.paper),
            onClick = { /* TODO: implement */ },
            modifier = Modifier.width(80.dp)

        )
        RpsButton(
            drawableResource = R.drawable.scissors,
            name = stringResource(R.string.scissors),
            onClick = { /* TODO: implement */ },
            modifier = Modifier.width(80.dp)
        )
    }
}

@Preview
@Composable
private fun RpsButtonsPreview() {
    MaterialTheme {
        RpsButtons(modifier = Modifier.fillMaxWidth())
    }
}
