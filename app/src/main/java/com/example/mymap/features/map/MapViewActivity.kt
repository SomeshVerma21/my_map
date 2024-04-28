package com.example.mymap.features.map

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mymap.features.common.theme.MyMapTheme
import com.example.mymap.features.map.presentation.ui.MapView
import com.example.mymap.features.map.presentation.viewmodels.MapViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MapViewActivity : ComponentActivity() {
    private val mapViewModel: MapViewModel by viewModels()
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyMapTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        content = {
                            MapView(mapViewModel)
                        },
//                        floatingActionButton = {
//                            FloatingActionButton(onClick = { }) {
//                                Icon(Icons.Default.LocationOn, contentDescription = "gps icon")
//                            }
//                        }
                    )
                }
            }
        }
    }

    fun onRequestCurrentLocation(){

    }
}