package com.example.pedestriandistractionapp.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import com.example.pedestriandistractionapp.R

@Composable
fun ScreenOne(navController: NavController) {
    var selected by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_walk_logo),
            contentDescription = "Walk Icon",
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape),
            tint = Color.Unspecified
        )

        Text(
            text = "Are you beginning your walk now?",
            fontSize = 18.sp,
            color = Color.Black
        )

        Row(
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable {
                    selected = "yes"
                    navController.navigate("walking_with")
                }
            ) {
                Icon(
                    painter = painterResource(
                        id = if (selected == "yes") R.drawable.ic_checkbox_checked else R.drawable.ic_checkbox_unchecked
                    ),
                    contentDescription = "Yes",
                    modifier = Modifier.size(24.dp),
                    tint = Color.Black
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "yes", color = Color.Black)
            }

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable {
                    selected = "no"
                }
            ) {
                Icon(
                    painter = painterResource(
                        id = if (selected == "no") R.drawable.ic_checkbox_checked else R.drawable.ic_checkbox_unchecked
                    ),
                    contentDescription = "No",
                    modifier = Modifier.size(24.dp),
                    tint = Color.Black
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "no", color = Color.Black)
            }
        }
    }
}

