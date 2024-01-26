package com.example.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
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
        ) {
            HomeScreen(navController)
        }

        composable(
            route = NavScreen.DetailsScreen.route,
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                },
                navArgument("age") {
                    type = NavType.IntType
                    defaultValue = 10
                }
            )
        ) {
            val name = it.arguments?.getString("name", "") ?: ""
            val age = it.arguments?.getInt("age", 0) ?: 0
            DetailsScreen(navController, name, age)
        }

        composable(
            route = NavScreen.LastScreen.route
        ) {
            LastScreen(navController)
        }
    }
}