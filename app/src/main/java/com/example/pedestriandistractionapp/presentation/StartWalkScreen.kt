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
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Text
import com.example.pedestriandistractionapp.R

@Composable
fun StartWalkScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .clickable { navController.navigate("look_up") },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_walk_logo),
            contentDescription = "Start Walk Icon",
            modifier = Modifier.size(140.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "PLEASE BEGIN\nYOUR WALK\n\nCHECK IN WHEN YOU\nARE ABOUT TO CROSS",
            color = Color.White,
            fontSize = 18.sp
        )
    }
}
