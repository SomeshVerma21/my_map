package com.example.mymap.features.map.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mymap.features.map.data.dao.MapDao
import com.example.mymap.features.map.data.model.MapAddress
import com.example.mymap.features.map.data.repository.MapAddressRepo
import com.google.android.gms.maps.model.LatLng
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor(
    private val mapAddressRepo: MapAddressRepo
) : ViewModel() {
    private val _currentLocation = MutableStateFlow(LatLng(28.6139, 77.2088))
    val currentLocation : StateFlow<LatLng> = _currentLocation.asStateFlow()

    fun setCurrentLocation(latLang: LatLng){
        _currentLocation.value = latLang
    }

    fun getAllSavedAddress(){
        viewModelScope.launch {
            val results = mapAddressRepo.getAllSavedAddress()
        }
    }

    fun getAddressById(id: Int){
        viewModelScope.launch {
            val result = mapAddressRepo.getAddressById(id)
        }
    }

    fun savePinedAddress(address: MapAddress){
        viewModelScope.launch {
            val result = mapAddressRepo.savePinAddress(address)
        }
    }

    fun deleteAddressById(id: Int){
        viewModelScope.launch {
            val result = mapAddressRepo.deleteAddressByid(id)
        }
    }

}