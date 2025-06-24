//package com.example.pedestriandistractionapp.ui.theme
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.wear.compose.material.Text
//import com.example.pedestriandistractionapp.R
//
//@Composable
//fun TeammatesScreen() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black)
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.ic_teammates),
//            contentDescription = "Teammates Icon",
//            modifier = Modifier.size(100.dp)
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text(
//            text = "TEAMMATES",
//            fontSize = 22.sp,
//            color = Color.White
//        )
//    }
//}

package com.example.pedestriandistractionapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Text
import com.example.pedestriandistractionapp.R

@Composable
fun TeammatesScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_teammates),
                contentDescription = "Teammates Icon",
                modifier = Modifier.size(100.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "TEAMMATES",
                fontSize = 22.sp,
                color = Color.White
            )
        }

        Image(
            painter = painterResource(id = R.drawable.ic_dropdown_triangle),
            contentDescription = "Back",
            modifier = Modifier
                .size(36.dp)
                .align(Alignment.CenterStart)
                .clickable {
                    navController.navigate("classmates_screen")
                }
                .rotate(180f)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_dropdown_triangle),
            contentDescription = "Next",
            modifier = Modifier
                .size(36.dp)
                .align(Alignment.CenterEnd)
                .clickable {
                    navController.navigate("coworkers_screen")
                }
        )
    }
}



