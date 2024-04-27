package com.example.mymap.features.map.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.google.android.gms.maps.model.LatLng
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class MapViewModel @Inject constructor() : ViewModel() {
    private val _currentLocation = MutableStateFlow(LatLng(28.6139, 77.2088))
    val currentLocation : StateFlow<LatLng> = _currentLocation.asStateFlow()

    fun setCurrentLocation(latLang: LatLng){
        _currentLocation.value = latLang
    }
}