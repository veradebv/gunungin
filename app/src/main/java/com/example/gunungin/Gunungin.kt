package com.example.gunungin

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.rememberNavController

@Composable
fun Gunungin() {
    val navController = rememberNavController()
    val actions = remember(navController) { }

    MaterialTheme {
        // Nav host

    }
}
