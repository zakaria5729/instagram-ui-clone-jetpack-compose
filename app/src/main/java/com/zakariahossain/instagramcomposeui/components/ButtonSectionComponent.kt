package com.zakariahossain.instagramcomposeui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonSectionComponent(
    modifier: Modifier = Modifier
) {
    val height = 30.dp

    Row(
        modifier = modifier.padding(start = 10.dp, end = 10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ActionButtonComponent(
            text = "Following",
            icon = Icons.Default.KeyboardArrowDown,
            paddingModifier = Modifier.padding(start = 6.dp),
            modifier = Modifier
                .height(height)
                .weight(1.8f)
        )
        ActionButtonComponent(
            text = "Message",
            modifier = Modifier
                .height(height)
                .weight(1.5f)
        )
        ActionButtonComponent(
            text = "Email",
            modifier = Modifier
                .height(height)
                .weight(1.5f)
        )
        ActionButtonComponent(
            icon = Icons.Default.KeyboardArrowDown,
            modifier = Modifier
                .height(height)
                .weight(0.7f)
        )
    }
}