package com.zackyfaqia.mygarage

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.zackyfaqia.mygarage.data.Car
import com.zackyfaqia.mygarage.data.DataProvider

@Composable
fun GarageHomeContent(navigateToDetail: (Car) -> Unit) {
    val cars = remember { DataProvider.carList }

    LazyColumn(
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, bottom = 8.dp, top = 64.dp)
    ) {
        items(
            items = cars,
            itemContent = {
                CarListItem(car = it, navigateToDetail)
            }
        )
    }
}