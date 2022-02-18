package com.zakariahossain.instagramcomposeui.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.*
import com.zakariahossain.instagramcomposeui.data_source.DataSource
import com.zakariahossain.instagramcomposeui.models.ImageWithText
import kotlinx.coroutines.launch

@ExperimentalFoundationApi
@ExperimentalPagerApi
@Composable
fun TabViewComponent(
    postWidth: Dp,
    tabValues : List<ImageWithText>,
) {
    val scope = rememberCoroutineScope()
    val inActiveColor = Color(0xFF777777)

    val pagerState = rememberPagerState(initialPage = 0)
    var selectedTabIndex by remember { mutableStateOf(0) }

    ScrollableTabRow(
        edgePadding = 0.dp,
        selectedTabIndex = selectedTabIndex,
        contentColor = Color.Black,
        backgroundColor = Color.Transparent,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(
                    pagerState,
                    tabPositions
                )
            )
        }) {
        tabValues.forEachIndexed { index, value ->
            Tab(
                selected = selectedTabIndex == index,
                selectedContentColor = Color.Black,
                unselectedContentColor = inActiveColor,
                onClick = {
                    selectedTabIndex = index
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }
            ) {
                Icon(
                    contentDescription = value.text,
                    painter = painterResource(id = value.drawableId),
                    tint = if(selectedTabIndex == index) Color.Black else inActiveColor,
                    modifier = Modifier
                        .padding(10.dp)
                        .size(20.dp)
                )
            }
        }
    }

    HorizontalPager(
        count = tabValues.size,
        state = pagerState,
    ) { tabIndex ->
        when(tabIndex) {
            0 -> PostSectionComponent(
                postWidth = postWidth,
                modifier = Modifier.fillMaxWidth(),
                postImages = DataSource.getPostImages()
            )
            else -> {
                Column(
                    modifier = Modifier.size(250.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "No post found")
                }
            }
        }
    }
}