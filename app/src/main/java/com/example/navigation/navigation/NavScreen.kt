package com.example.navigation.navigation

const val HomeScreenPath = "home_screen"
const val DetailsScreenPath = "details_screen"
const val LastScreenPath = "last_screen"

sealed class NavScreen(val route: String) {
    object HomeScreen : NavScreen(HomeScreenPath)

    /* Passing all arguments
    object DetailsScreen : NavScreen("$DetailsScreenPath/{name}/{age}") */

    // Passing only name argument
    object DetailsScreen : NavScreen("$DetailsScreenPath/{name}?age={age}")

    object LastScreen : NavScreen(LastScreenPath)
}