package com.example.multimodulearchitecture

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.core.navigation.NavRoutes
import com.example.feature_a.settingScreen
import com.example.feature_b.profileScreen

@Composable
fun MainScreen(

) {

    val navController = rememberNavController()
    val startDestination: String = NavRoutes.Setting.route
    NavHost(navController = navController, startDestination = startDestination) {
        composable(NavRoutes.Setting.route) {
            settingScreen(navController)
        }
        composable(NavRoutes.Profile.route) {
            profileScreen(navController)
        }

    }
}


