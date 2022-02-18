package com.zakariahossain.instagramcomposeui.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.ExperimentalPagerApi
import com.zakariahossain.instagramcomposeui.data_source.DataSource
import com.zakariahossain.instagramcomposeui.ui.components.*
import com.zakariahossain.instagramcomposeui.utils.Constants.gridCount

@ExperimentalPagerApi
@ExperimentalFoundationApi
@Composable
fun ProfileScreen() {
    val postWidth = LocalConfiguration.current.screenWidthDp.dp / gridCount

    Scaffold(
        topBar = {
            TopAppBarComponent(name = "zakaria5729")
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 8.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                ProfileSectionComponent(
                    modifier = Modifier.padding(top = 5.dp)
                )
                Spacer(
                    modifier = Modifier.height(18.dp)
                )
                ButtonSectionComponent(
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(
                    modifier = Modifier.height(18.dp)
                )
                HighlightSectionComponent(
                    highlights = DataSource.getStoryHighlights(),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                )
                Spacer(
                    modifier = Modifier.height(18.dp)
                )
                TabViewComponent(
                    postWidth = postWidth,
                    tabValues = DataSource.getTabValues()
                )
            }
        }
    )
}

