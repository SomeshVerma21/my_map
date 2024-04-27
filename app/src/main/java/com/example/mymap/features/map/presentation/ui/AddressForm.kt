package com.example.mymap.features.map.presentation.ui

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun AddressForm(){
    var name by remember {
        mutableStateOf("")
    }
    var age by remember {
        mutableStateOf("")
    }
    var relation by remember {
        mutableStateOf("")
    }
    var latLong by remember {
        mutableStateOf("")
    }
    var address by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp)
            .background(color = Color.Cyan)
            .padding(16.dp)
    ) {
        Text(
            text = "Enter Address Detail",
            fontSize = TextUnit(20f, TextUnitType.Sp)
        )
       BasicTextField(
           value = "asdfsdf",
           onValueChange = {},
           modifier = Modifier
               .fillMaxWidth()
               .padding(top = 12.dp)
               .border(1.dp, color = Color.Gray, shape = RoundedCornerShape(12))
               .padding(vertical = 8.dp, horizontal = 4.dp),
       )
    }
}
