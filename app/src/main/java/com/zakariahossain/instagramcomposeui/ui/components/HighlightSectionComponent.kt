package com.zakariahossain.instagramcomposeui.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.zakariahossain.instagramcomposeui.models.ImageWithText

@Composable
fun HighlightSectionComponent(
    modifier: Modifier = Modifier,
    highlights: List<ImageWithText>
) {
    LazyRow(modifier = modifier) {
        items(highlights.size) {
            val highlight = highlights[it]

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = if(it == highlights.size -1) Modifier else Modifier.padding(end = 15.dp)
            ) {
                RoundImageComponent(
                    modifier = Modifier.size(70.dp),
                    image = painterResource(id = highlight.drawableId)
                )
                Text(
                    text = highlight.text,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}