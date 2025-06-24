package com.example.pedestriandistractionapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.wear.compose.material.Text
import com.example.pedestriandistractionapp.R

@Composable
fun WalkingWithScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFC0CB))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "Who are you walking with?",
            fontSize = 22.sp,
            color = Color.Black
        )

        Text(
            text = "Select all that apply",
            fontSize = 16.sp,
            color = Color.Black
        )

        Image(
            painter = painterResource(id = R.drawable.ic_dropdown_triangle),
            contentDescription = "Dropdown",
            modifier = Modifier
                .size(40.dp)
                .clickable {
                    navController.navigate("friends_screen")
                }
        )
    }
}

