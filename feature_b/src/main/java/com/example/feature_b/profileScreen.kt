package com.example.feature_b

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.core.navigation.NavRoutes


@Composable
fun profileScreen(navHostController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Hello profile!")
        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            navHostController.navigate(NavRoutes.Setting.route){
                navHostController.popBackStack()

            }

        }) {
            Text(text = "Back to feature_a")
        }
    }
}