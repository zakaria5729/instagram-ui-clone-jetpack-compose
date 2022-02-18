package com.zakariahossain.instagramcomposeui.ui

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.zakariahossain.instagramcomposeui.R
import com.zakariahossain.instagramcomposeui.components.ProfileDescription
import com.zakariahossain.instagramcomposeui.components.ProfileSection
import com.zakariahossain.instagramcomposeui.components.TopBar

@Composable
fun ProfileScreen() {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopBar(
                name = "zakaria5729",
                actions = {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_bell),
                        contentDescription = "Bell",
                        tint = Color.Black,
                        modifier = Modifier
                            .size(20.dp)
                            .clickable {
                            Toast.makeText(context, "No back action in bell icon", Toast.LENGTH_SHORT).show()
                        }
                    )
                    Spacer(modifier = Modifier.padding(start = 8.dp))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_dotmenu),
                        contentDescription = "Menu",
                        tint = Color.Black,
                        modifier = Modifier
                            .size(16.dp)
                            .clickable {
                                Toast.makeText(context, "No back action in menu action", Toast.LENGTH_SHORT).show()
                            }
                    )
                    Spacer(modifier = Modifier.padding(start = 12.dp))
                }
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 8.dp)
                    .verticalScroll(rememberScrollState())
            ) {
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
    )
}

