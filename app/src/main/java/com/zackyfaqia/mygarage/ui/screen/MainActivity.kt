package com.zackyfaqia.mygarage.ui.screen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import com.zackyfaqia.mygarage.CustomAppBar
import com.zackyfaqia.mygarage.GarageHomeContent
import com.zackyfaqia.mygarage.data.Car
import com.zackyfaqia.mygarage.ui.screen.detail.DetailActivity
import com.zackyfaqia.mygarage.ui.theme.MyGarageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGarageTheme {
                MyApp {
                    startActivity(DetailActivity.newIntent(this, it))
                }
                CustomAppBar()
            }
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyApp(navigateToDetail: (Car) -> Unit) {
    Scaffold(
        content = {
            GarageHomeContent(navigateToDetail = navigateToDetail)
        }
    )
}
