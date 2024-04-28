package com.example.mymap.features.map.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "map_address")
data class MapAddress(
    @PrimaryKey
    val id: Int,

    val name: String,

    val age: Int,

    val address: String,

    val relation: String,

    val latLong: String

)
