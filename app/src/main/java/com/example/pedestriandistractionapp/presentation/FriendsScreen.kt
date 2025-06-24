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
//import androidx.wear.compose.material.MaterialTheme
//import androidx.wear.compose.material.Text
//import com.example.pedestriandistractionapp.R
//
//@Composable
//fun FriendsScreen() {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFFFC0CB)) // Light pink
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.ic_friends),
//            contentDescription = "Friends Icon",
//            modifier = Modifier.size(100.dp)
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text(
//            text = "Friends",
//            fontSize = 22.sp,
//            color = Color.Black,
//            style = MaterialTheme.typography.body1
//        )
//    }
//}

//package com.example.pedestriandistractionapp.presentation
//
//import androidx.compose.foundation.Image
//import androidx.compose.foundation.background
//import androidx.compose.foundation.clickable
//import androidx.compose.foundation.layout.*
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.navigation.NavHostController
//import androidx.wear.compose.material.MaterialTheme
//import androidx.wear.compose.material.Text
//import com.example.pedestriandistractionapp.R
//
//@Composable
//fun FriendsScreen(navController: NavHostController) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Black)
//            .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.ic_friends),
//            contentDescription = "Friends Icon",
//            modifier = Modifier.size(100.dp)
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Text(
//            text = "FRIENDS/FAMILY",
//            fontSize = 20.sp,
//            color = Color.White,
//            style = MaterialTheme.typography.body1
//        )
//
//        Spacer(modifier = Modifier.height(32.dp))
//
//        Row(
//            horizontalArrangement = Arrangement.SpaceBetween,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(
//                text = "◀",
//                fontSize = 28.sp,
//                color = Color.White,
//                modifier = Modifier.clickable {
//                    navController.navigate("walking_with") // previous
//                }
//            )
//            Text(
//                text = "▶",
//                fontSize = 28.sp,
//                color = Color.White,
//                modifier = Modifier.clickable {
//                    navController.navigate("classmates_screen") // next
//                }
//            )
//        }
//    }
//}

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
//
//@Composable
//fun FriendsScreen() {
//    Column(
//        modifier = Modifier.fillMaxSize().background(Color.Black).padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//        Image(
//            painter = painterResource(R.drawable.ic_friends),
//            contentDescription = "Friends",
//            modifier = Modifier.size(100.dp)
//        )
//        Spacer(Modifier.height(16.dp))
//        Text("FRIENDS", color = Color.White, fontSize = 22.sp)
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
fun FriendsScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(R.drawable.ic_friends),
            contentDescription = "Friends Icon",
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "FRIENDS",
            fontSize = 22.sp,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(32.dp))

        Image(
            painter = painterResource(id = R.drawable.ic_dropdown_triangle),
            contentDescription = "Next Icon",
            modifier = Modifier
                .size(40.dp)
                .clickable {
                    navController.navigate("classmates_screen")
                }
        )
    }
}




