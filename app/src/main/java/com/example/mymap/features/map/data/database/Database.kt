package com.example.mymap.features.map.data.database

import androidx.room.RoomDatabase
import com.example.mymap.features.map.data.dao.MapDao

abstract class MapDatabase: RoomDatabase(){
    abstract fun mapDao(): MapDao
}