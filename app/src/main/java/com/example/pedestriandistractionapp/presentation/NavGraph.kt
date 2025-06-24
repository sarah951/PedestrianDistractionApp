//package com.example.pedestriandistractionapp.presentation
//
//
//import androidx.compose.runtime.Composable
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.NavHost
//import androidx.navigation.compose.composable
//import com.example.pedestriandistractionapp.presentation.ScreenOne
//import com.example.pedestriandistractionapp.presentation.WalkingWithScreen
//import com.example.pedestriandistractionapp.ui.theme.ClassmatesScreen
//import com.example.pedestriandistractionapp.presentation.FriendsScreen
//
//import com.example.pedestriandistractionapp.ui.theme.TeammatesScreen
//import com.example.pedestriandistractionapp.ui.theme.CoworkersScreen
//import com.example.pedestriandistractionapp.presentation.ReasonSelectionScreen
//import androidx.wear.compose.material.Text
//import com.example.pedestriandistractionapp.R
//
//
//
//@Composable
//fun AppNavGraph(navController: NavHostController) {
//    NavHost(navController = navController, startDestination = "screen_one") {
//        composable("screen_one") { ScreenOne(navController) }
//        composable("walking_with") { WalkingWithScreen(navController) }
//        composable("friends_screen") { FriendsScreen(navController) }
//        composable("classmates_screen") { ClassmatesScreen() }
//        composable("teammates_screen") { TeammatesScreen() }
//        composable("coworkers_screen") { CoworkersScreen() }
//        composable("reason_selection") { ReasonSelectionScreen(navController) }
//        composable("going_to_class") { GoingToClassScreen(navController) }
//        composable("running_errand") { RunningErrandScreen(navController) }
//        composable("socializing")    { SocializingScreen(navController) }
//        composable("exercising")     { ExercisingScreen(navController) }
//        composable("start_walk") { StartWalkScreen(navController) }
//        composable("look_up") { LookUpScreen(navController) }
//        composable("check_signals") { CheckSignalsScreen(navController) }
//        composable("check_cars") { CheckCarsScreen(navController) }
//
//
//
//    }
//}

package com.example.pedestriandistractionapp.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "screen_one") {
        composable("screen_one") { ScreenOne(navController) }
        composable("friends_screen") { FriendsScreen(navController) }
        composable("classmates_screen") { ClassmatesScreen(navController) }
        composable("teammates_screen") { TeammatesScreen(navController) }
        composable("coworkers_screen") { CoworkersScreen(navController) }
        composable("reason_selection") { ReasonSelectionScreen(navController) }
        composable("are_you_ready") { ReasonSelectionScreen(navController) }
        composable("check_signals") { CheckSignalsScreen(navController) }
        composable("check_cars") { CheckCarsScreen(navController) }
        composable("look_up") { LookUpScreen(navController) }
    }
}

