package com.zakariahossain.instagramcomposeui.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.zakariahossain.instagramcomposeui.utils.Constants.gridCount

@ExperimentalFoundationApi
@Composable
fun PostSectionComponent(
    postWidth: Dp,
    postImages : List<Int>,
    modifier: Modifier = Modifier
) {
    val postsChunks: List<List<Int>> = postImages.chunked(gridCount)

    Column(
        modifier = modifier.scale(1.01f)
    ) {
        for (postsChunk in postsChunks) {
            Row {
                for (post in postsChunk) {
                    Image(
                        painter = painterResource(post),
                        contentScale = ContentScale.Crop,
                        contentDescription = null,
                        modifier = Modifier
                            .size(postWidth)
                            .border(
                                width = 1.dp,
                                color = Color.White
                            )
                    )
                }
            }
        }
    }
}