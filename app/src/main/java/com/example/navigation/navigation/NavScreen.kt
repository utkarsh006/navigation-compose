package com.example.navigation.navigation

sealed class NavScreen(val route: String) {
    object HomeScreen : NavScreen("home_screen")
    object DetailsScreen : NavScreen("details_screen")
    object LastScreen : NavScreen("last_screen")
}