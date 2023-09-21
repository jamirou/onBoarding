package com.jamirodev.onboardingapp.onBoardViews

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.rememberPagerState
import com.jamirodev.onboardingapp.R
import com.jamirodev.onboardingapp.data.PageData

@OptIn(ExperimentalPagerApi::class)
@Composable
fun MainOnBoarding(navController: NavController) {
    val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.welcomeanim,
            "Welcome",
            "In these three boards I'll show you different layouts using lottie files and data store."
        )
    )
    items.add(
        PageData(
            R.raw.caranima,
            "The car",
            "Development of the automobile started in 1672 with the invention of the first steam-powered vehicle,[1] which led to the creation of the first steam-powered automobile capable of human transportation, built by Nicolas-Joseph Cugnot in 1769."
        )
    )
    items.add(
        PageData(
            R.raw.finishanima,
            "bye",
            "The word “bye” has an interesting etymology. According to the Online Etymology Dictionary, the word “bye” was originally used in sports, specifically cricket, to refer to “a run scored on a ball that is missed by the wicket-keeper”."
        )
    )
    val pagerState = rememberPagerState(
        pageCount = items.size,
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )

    OnBoardingPager(
        item = items, pagerState = pagerState, modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        navController
    )
}





