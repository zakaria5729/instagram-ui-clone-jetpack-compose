package com.zakariahossain.instagramcomposeui.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun StatSectionComponent(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = modifier
    ) {
        ProfileStatComponent(numberText = "601", text = "Posts")
        ProfileStatComponent(numberText = "100", text = "Followers")
        ProfileStatComponent(numberText = "72", text = "Following")
    }
}