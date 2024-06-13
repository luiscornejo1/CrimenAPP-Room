package com.csmre.registrocriminal4.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Text


@Composable
fun ListaCrimenesFragment(navController: NavHostController) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Crimen 1",
            color = Color.Black,
            modifier = Modifier
                .padding(vertical = 8.dp)
                .clickable {
                    navController.navigate("crimenFragment")
                }
        )
        Text(
            text = "Crimen 2",
            color = Color.Black,
            modifier = Modifier
                .padding(vertical = 8.dp)
                .clickable {
                    navController.navigate("crimenFragment")
                }
        )
        Text(
            text = "Crimen 3",
            color = Color.Black,
            modifier = Modifier
                .padding(vertical = 8.dp)
                .clickable {
                    navController.navigate("crimenFragment")
                }
        )
    }
}