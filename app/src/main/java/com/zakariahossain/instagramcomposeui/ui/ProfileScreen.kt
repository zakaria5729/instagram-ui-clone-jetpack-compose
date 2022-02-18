package com.zakariahossain.instagramcomposeui.ui

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.zakariahossain.instagramcomposeui.R
import com.zakariahossain.instagramcomposeui.components.ButtonSectionComponent
import com.zakariahossain.instagramcomposeui.components.ProfileDescriptionComponent
import com.zakariahossain.instagramcomposeui.components.ProfileSectionComponent
import com.zakariahossain.instagramcomposeui.components.TopAppBarComponent

@Composable
fun ProfileScreen() {
    val context = LocalContext.current

    Scaffold(
        topBar = {
            TopAppBarComponent(
                name = "zakaria5729",
            )
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 8.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                ProfileSectionComponent(modifier = Modifier.padding(top = 5.dp))
                Spacer(modifier = Modifier.height(20.dp))
                ButtonSectionComponent(modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(25.dp))
            }
        }
    )
}

