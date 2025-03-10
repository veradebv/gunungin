package com.example.gunungin

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gunungin.navigation.Destination.Dashboard
import com.example.gunungin.navigation.Destination.Login

@Composable
fun Gunungin() {
    val navController = rememberNavController()
    val actions = remember(navController) { }

    MaterialTheme {
        NavHost(navController = navController, startDestination = Login) {
            composable(Login) {
                LoginScreen()
            }
            composable(Dashboard) {
            }
        }

    }
}
