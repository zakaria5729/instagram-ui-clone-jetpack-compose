package com.zakariahossain.instagramcomposeui.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zakariahossain.instagramcomposeui.models.ProfileDescription

@Composable
fun ProfileDescriptionComponent(
    profileDescription: ProfileDescription
) {
    val lineHeight = 18.sp
    val letterSpacing = 0.4.sp

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
    ) {
        Text(
            text = profileDescription.displayName,
            fontWeight = FontWeight.Bold,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
            fontSize = 18.sp
        )
        Text(
            text = profileDescription.description,
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
        )
        Text(
            text = profileDescription.url,
            color = Color(0xFF3D3D91),
            letterSpacing = letterSpacing,
            lineHeight = lineHeight,
            modifier = Modifier.padding(top = 3.dp)
        )

        if(profileDescription.followedBy.isNotEmpty()) {
            Text(
                text = buildAnnotatedString {
                    val boldStyle = SpanStyle(
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                    append("Followed by ")
                    profileDescription.followedBy.forEachIndexed { index, name ->
                        pushStyle(boldStyle)
                        append(name)
                        pop()

                        if(index < profileDescription.followedBy.size - 1) {
                            append(", ")
                        }
                    }

                    if(profileDescription.otherCount > 2) {
                        append(" and ")
                        pushStyle(boldStyle)
                        append("${profileDescription.otherCount} others")
                    }
                },
                letterSpacing = letterSpacing,
                lineHeight = lineHeight,
                modifier = Modifier.padding(top = 3.dp)
            )
        }
    }
}