package com.zakariahossain.instagramcomposeui.components

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zakariahossain.instagramcomposeui.R
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.platform.LocalContext

@Composable
fun TopBar(
    name: String,
    isNavigationIcon: Boolean = true,
    contentColor: Color = Color.Black,
    actions: @Composable RowScope.() -> Unit = {},
    backgroundColor: Color = MaterialTheme.colors.background,
) {
    val context = LocalContext.current

    TopAppBar(
        title = {
            Text(text = name)
        },
        navigationIcon = if(isNavigationIcon) {
            {
                Spacer(modifier = Modifier.padding(start = 12.dp))
                Icon(
                    imageVector = Icons.Filled.ArrowBack,
                    tint = Color.Black,
                    contentDescription = "backIcon",
                    modifier = Modifier.clickable {
                        Toast.makeText(context, "No back action in navigation icon", Toast.LENGTH_SHORT).show()
                    }
                )
            }
        } else null,
        actions = actions,
        backgroundColor = backgroundColor,
        contentColor = contentColor,
    )
}