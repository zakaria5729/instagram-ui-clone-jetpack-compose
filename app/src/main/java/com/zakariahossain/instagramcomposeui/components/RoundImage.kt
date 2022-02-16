package com.zakariahossain.instagramcomposeui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun RoundImage(
    image: Painter,
    modifier: Modifier = Modifier
) {
    Image(
        painter = image,
        contentDescription = "image",
        modifier = modifier
            .padding(3.dp)
            .clip(CircleShape)
            .aspectRatio(
                1f,
                matchHeightConstraintsFirst = true
            )
            .border(
                width = 2.dp,
                color = Color.LightGray,
                shape = CircleShape
            )
    )
}