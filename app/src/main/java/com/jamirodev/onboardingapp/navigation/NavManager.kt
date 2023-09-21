package com.jamirodev.onboardingapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jamirodev.onboardingapp.onBoardViews.MainOnBoarding
import com.jamirodev.onboardingapp.views.HomeView


@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = "OnBoarding") {
        composable("OnBoarding") {
            MainOnBoarding()
        }
        composable("Home") {
            HomeView()
        }
    }

}