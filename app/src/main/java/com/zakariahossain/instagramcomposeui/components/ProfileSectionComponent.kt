package com.zakariahossain.instagramcomposeui.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.zakariahossain.instagramcomposeui.R

@Composable
fun ProfileSectionComponent(
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            RoundImageComponent(
                image = painterResource(id = R.drawable.zakaria),
                modifier = modifier
                    .size(90.dp)
                    .weight(3f)
            )
            Spacer(modifier = modifier.width(16.dp))
            StatSectionComponent(modifier = modifier.weight(7f))
    }
        Spacer(modifier = Modifier.height(5.dp))
        ProfileDescriptionComponent(
            otherCount = 17,
            displayName = "Zakaria Hossain",
            followedBy = listOf("Coding in flow", "Reso coder"),
            url = "https://www.youtube.com/watch?v=Kw4_i4l5y4sf",
            description = "Lorem Ipsum is simply dummy text of the printing and " +
                    "typesetting industry.\nLorem Ipsum has been the industry's"
        )
    }
}