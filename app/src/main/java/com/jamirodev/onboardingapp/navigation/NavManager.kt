package com.jamirodev.onboardingapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jamirodev.onboardingapp.dataStore.StoreBoarding
import com.jamirodev.onboardingapp.onBoardViews.MainOnBoarding
import com.jamirodev.onboardingapp.views.HomeView
import com.jamirodev.onboardingapp.views.SplashScreen


@Composable
fun NavManager() {

    val context = LocalContext.current
    val dataStore = StoreBoarding(context)
    val store = dataStore.getBoarding.collectAsState(initial = false)

    val navController = rememberNavController()
    NavHost(navController, startDestination = if (store.value) "Home" else "Splash") {
        composable("OnBoarding") {
            MainOnBoarding(navController, dataStore)
        }
        composable("Home") {
            HomeView(navController)
        }
        composable("Splash") {
            SplashScreen(navController, store.value)
        }
    }

}