package com.example.mymap.features.map.data.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mymap.features.map.data.model.MapAddress

@Dao
interface MapDao {
    @Query("Select * from map_address")
    fun getAllSavedAddress(): LiveData<List<MapAddress>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun savePinAddress(address: MapAddress)

    @Query("Select * from map_address Where id = :id")
    fun getAddressById(id:Int): LiveData<MapAddress?>

    @Query("Delete from map_address where id = :id")
    fun deleteAddressById(id: Int)
}