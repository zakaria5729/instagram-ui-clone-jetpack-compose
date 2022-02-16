package com.zakariahossain.instagramcomposeui.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.zakariahossain.instagramcomposeui.components.ProfileDescription
import com.zakariahossain.instagramcomposeui.components.ProfileSection
import com.zakariahossain.instagramcomposeui.components.TopBar

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 8.dp)
            .verticalScroll(rememberScrollState())
    ) {
        TopBar(
            name = "zakaria5729",
            modifier = Modifier.padding(vertical = 8.dp)
        )
        ProfileSection()
        Spacer(modifier = Modifier.height(4.dp))
        ProfileDescription(
            otherCount = 17,
            displayName = "Zakaria Hossain",
            followedBy = listOf("Coding in flow", "Reso coder"),
            url = "https://www.youtube.com/watch?v=Kw4_i4l5y4sf",
            description = "Lorem Ipsum is simply dummy text of the printing and " +
                    "typesetting industry.\nLorem Ipsum has been the industry's " +
                    "standard dummy text ever since the 1500s, when an unknown printer took"
        )
    }
}









