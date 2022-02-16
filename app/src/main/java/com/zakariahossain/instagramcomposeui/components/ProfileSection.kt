package com.zakariahossain.instagramcomposeui.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.zakariahossain.instagramcomposeui.R

@Composable
fun ProfileSection(
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
    ) {
        RoundImage(
            image = painterResource(id = R.drawable.zakaria),
            modifier = modifier
                .size(90.dp)
                .weight(3f)
        )
        Spacer(modifier = modifier.width(16.dp))
        StatSection(modifier = modifier.weight(7f))
    }
}