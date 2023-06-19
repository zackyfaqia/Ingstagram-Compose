package com.zackyfaqia.mygarage

import android.content.Intent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.zackyfaqia.mygarage.ui.screen.profile.ProfileActivity

@Composable
fun CustomAppBar() {
    Box(
        modifier = Modifier
            .height(80.dp)
            .fillMaxWidth()
    ) {
        TopAppBar(
            elevation = 0.dp,
            title = {
                Text(
                    text = "My Garage",
                    color = Color.White
                )
            },
            actions = {
                AppBarActions()
            }
        )
    }
}

@Composable
fun AppBarActions() {
    ProfileAction()
}

@Composable
fun ProfileAction() {
    val context = LocalContext.current
    IconButton(
        onClick = {
            context.startActivity(Intent(context, ProfileActivity::class.java))
        }
    ) {
        Icon(
            imageVector = Icons.Outlined.Person,
            contentDescription = "profile_icon",
        )
    }
}

@Composable
fun CustomAppBarPreview() {
    CustomAppBar()
}