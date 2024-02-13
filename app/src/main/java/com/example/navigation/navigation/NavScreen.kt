package com.example.navigation.navigation

const val HomeScreenPath = "home_screen"
const val DetailsScreenPath = "details_screen"
const val LastScreenPath = "last_screen"

sealed class NavScreen(val route: String) {
    object HomeScreen : NavScreen(HomeScreenPath)

    object DetailsScreen : NavScreen(DetailsScreenPath)

    object LastScreen : NavScreen(LastScreenPath)
}