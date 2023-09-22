package com.jamirodev.onboardingapp.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.jamirodev.onboardingapp.R

@Composable
fun HomeView(navController: NavController) {
    val compositionClouds by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(R.raw.clouds)
    )
    val compositionHome by rememberLottieComposition(
        spec = LottieCompositionSpec.RawRes(R.raw.home)
    )

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        compositionClouds?.let {
            LottieAnimation(
                composition = it,
                modifier = Modifier
                    .height(200.dp),
                iterations = LottieConstants.IterateForever
            )
        }
        compositionHome?.let {
            LottieAnimation(
                composition = it,
                modifier = Modifier
                    .height(350.dp),
                iterations = LottieConstants.IterateForever
            )
        }
        Text(
            text = "Now once you enter the app again, the onboard will no longer appear, but instead the splash will be shown first and then home.",
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center
        )
    }
}
