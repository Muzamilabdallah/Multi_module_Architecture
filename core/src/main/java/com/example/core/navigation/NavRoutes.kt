package com.example.core.navigation

sealed class NavRoutes(val route: String) {
    object Home : NavRoutes("home")
    object Setting : NavRoutes("setting")
    object Profile : NavRoutes("profile")
}