package com.zackyfaqia.mygarage.ui.screen.profile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.zackyfaqia.mygarage.ui.theme.MyGarageTheme

class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGarageTheme {
                ProfileScreen()
            }
        }
    }
}