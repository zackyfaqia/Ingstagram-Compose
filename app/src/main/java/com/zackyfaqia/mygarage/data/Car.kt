package com.zackyfaqia.mygarage.data

import java.io.Serializable

data class Car(
    val id: Int,
    val name: String,
    val specification: String,
    val description: String,
    val carImageId: Int = 0
) : Serializable
