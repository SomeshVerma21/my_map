package com.example.mymap.features.map.data.repository

import androidx.lifecycle.LiveData
import com.example.mymap.features.map.data.dao.MapDao
import com.example.mymap.features.map.data.model.MapAddress
import javax.inject.Inject

class MapAddressRepo @Inject constructor(private val mapAddressDao: MapDao){
    fun getAllSavedAddress(): LiveData<List<MapAddress>> {
        return mapAddressDao.getAllSavedAddress()
    }

    fun savePinAddress(address: MapAddress): MapAddress {
        return address
    }

    fun getAddressById(id: Int): LiveData<MapAddress?> {
        return  mapAddressDao.getAddressById(id)
    }

    fun deleteAddressByid(id: Int): Int{
        return id
    }
}