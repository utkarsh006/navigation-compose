package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigation.screens.LoginScreen
import com.example.navigation.screens.MainScreen
import com.example.navigation.screens.RegistrationScreen

@Composable
fun NavHostDesign() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "registration") {
        composable(route = "registration") {
            RegistrationScreen {
                navController.navigate("login/${it}")
            }
        }

        composable(
            route = "login/{email}", arguments = listOf(
                navArgument("email") {
                    type = NavType.StringType
                }
            )
        ) {
            val email = it.arguments!!.getString("email")
            LoginScreen(email!!) {
                navController.navigate("main")
            }
        }

        composable(route = "main") {
            MainScreen()
        }
    }
}