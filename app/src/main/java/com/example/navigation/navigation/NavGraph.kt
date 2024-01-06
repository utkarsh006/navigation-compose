package com.example.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigation.screens.DetailsScreen
import com.example.navigation.screens.HomeScreen
import com.example.navigation.screens.LastScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = NavScreen.HomeScreen.route
    ) {
        composable(
            route = NavScreen.HomeScreen.route
        ){
            HomeScreen(navController)
        }
        composable(
            route = NavScreen.DetailsScreen.route
        ){
            DetailsScreen(navController)
        }
        composable(
            route = NavScreen.LastScreen.route
        ){
            LastScreen(navController)
        }
    }
}