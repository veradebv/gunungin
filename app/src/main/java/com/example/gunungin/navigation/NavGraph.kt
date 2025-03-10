package com.example.gunungin.navigation

import androidx.navigation.NavHostController
import com.example.gunungin.navigation.Destination.Dashboard

object Destination {
    const val Splash = "Splash"
    const val Login = "Login"
    const val Dashboard = "Dashboard"
}

class Actions(navController: NavHostController) {
    val openDashboard: () -> Unit = {
        navController.navigate(Dashboard)
    }

    val addTask: () -> Unit = {
        navController.navigate(Dashboard)
    }
}