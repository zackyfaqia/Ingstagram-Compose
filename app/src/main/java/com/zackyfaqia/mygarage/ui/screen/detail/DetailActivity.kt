package com.zackyfaqia.mygarage.ui.screen.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.zackyfaqia.mygarage.data.Car
import com.zackyfaqia.mygarage.ui.theme.MyGarageTheme

class DetailActivity : ComponentActivity() {

    private val car: Car by lazy {
        intent?.getSerializableExtra(CAR_ID) as Car
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyGarageTheme {
                DetailScreen(car = car)
            }
        }
    }

    companion object {
        private const val CAR_ID = "car_id"
        fun newIntent(context: Context, car: Car) =
            Intent(context, DetailActivity::class.java).apply {
                putExtra(CAR_ID, car)
            }
    }
}