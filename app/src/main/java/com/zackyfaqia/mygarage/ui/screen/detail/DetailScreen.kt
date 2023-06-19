package com.zackyfaqia.mygarage.ui.screen.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.zackyfaqia.mygarage.R
import com.zackyfaqia.mygarage.data.Car

@Composable
fun DetailScreen(car: Car) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState)
                ) {
                    DetailHeader(car = car, containerHeight = this@BoxWithConstraints.maxHeight)
                    DetailContent(car = car, containerHeight = this@BoxWithConstraints.maxHeight)
                }

            }
        }
    }
}

@Composable
private fun DetailHeader(
    car: Car,
    containerHeight: Dp
) {
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = car.carImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun DetailContent(car: Car, containerHeight: Dp) {
    Column {
        Name(car = car)
        DetailProperty(
            label = stringResource(id = R.string.specification),
            value = car.specification
        )
        DetailProperty(label = stringResource(id = R.string.description), value = car.description)
    }
}

@Composable
private fun Name(car: Car) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = car.name,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun DetailProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(
            text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.caption
        )
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Visible
        )
    }

}