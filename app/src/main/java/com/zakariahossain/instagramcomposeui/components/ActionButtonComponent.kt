package com.zakariahossain.instagramcomposeui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActionButtonComponent(
    modifier: Modifier = Modifier,
    text: String? = null,
    icon: ImageVector? = null,
    paddingModifier: Modifier = Modifier
) {

    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .padding(start = 4.dp, end = 4.dp)
            .border(
                width = 1.dp,
                color = Color.LightGray,
                shape = RoundedCornerShape(5.dp)
            )
    ) {
        text?.let {
            Text(
                text = it,
                fontWeight = FontWeight.SemiBold,
                fontSize = 14.sp,
                modifier = paddingModifier
            )
        }

        icon?.let {
            Icon(
                imageVector = it,
                tint = Color.Black,
                contentDescription = "Action button",
            )
        }
    }
}