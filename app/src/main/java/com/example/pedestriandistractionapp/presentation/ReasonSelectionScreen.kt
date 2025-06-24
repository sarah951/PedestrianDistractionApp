//package com.example.pedestriandistractionapp.presentation.ui.theme
//
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.material.Icon
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.filled.ArrowDropDown
//import androidx.compose.material.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//
//
//
//@Composable
//fun ReasonSelectionScreen(navController: NavHostController) {
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black),
//        contentAlignment = Alignment.Center
//    ) {
//        Column(
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center,
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Text(
//                text = "WHAT IS YOUR\nMAIN REASON FOR\nTHIS WALK?",
//                fontSize = 18.sp,
//                color = Color.White,
//                modifier = Modifier.padding(bottom = 16.dp)
//            )
//
//            Text(
//                text = "Select all\nthat apply",
//                fontSize = 16.sp,
//                color = Color.White,
//                modifier = Modifier.padding(bottom = 24.dp)
//            )
//
//            Icon(
//                imageVector = Icons.Filled.ArrowDropDown,
//                contentDescription = "Null",
//                tint = Color.White,
//                modifier = Modifier
//                    .size(40.dp)
//                    .clickable {
//                        navController.navigate("class_screen")
//                    }
//            )
//        }
//    }
//}

//package com.example.pedestriandistractionapp.presentation
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
//import androidx.navigation.NavHostController
//import androidx.wear.compose.material.Text
//import com.example.pedestriandistractionapp.R
//
//@Composable
//fun ReasonSelectionScreen(navController: NavHostController) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black)
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Text(
//            text = "WHAT IS YOUR MAIN REASON FOR THIS WALK?",
//            color = Color.White,
//            fontSize = 16.sp
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text(
//            text = "Select all that apply",
//            color = Color.White,
//            fontSize = 14.sp
//        )
//
//        Spacer(modifier = Modifier.height(24.dp))
//
//        Image(
//            painter = painterResource(id = R.drawable.ic_dropdown_triangle),
//            contentDescription = "Dropdown Icon",
//            modifier = Modifier.size(40.dp)
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Text
import com.example.pedestriandistractionapp.R

@Composable
fun ReasonSelectionScreen(navController: NavHostController) {
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
            Text(
                text = "WHAT IS YOUR MAIN REASON FOR WALKING?",
                color = Color.White,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "SELECT TO APPLY",
                color = Color.White,
                fontSize = 14.sp
            )
        }

        // Triangle Icon for Next Page
        Image(
            painter = painterResource(id = R.drawable.ic_dropdown_triangle),
            contentDescription = "Next",
            modifier = Modifier
                .size(36.dp)
                .align(Alignment.CenterEnd)
                .clickable {
                    navController.navigate("check_signals")
                }
        )
    }
}

