package com.csmre.registrocriminal4.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Text


@Composable
fun ListaCrimenesFragment(navController: NavHostController) {
    val crimenes = listOf("Crimen 1", "Crimen 2", "Crimen 3") // Ejemplo de lista de crímenes
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(crimenes) { crimen ->
            Text(
                text = crimen,
                color = Color.Black, // Cambia el color del texto a negro
                modifier = Modifier
                    .clickable { navController.navigate("crimenFragment") }
                    .padding(8.dp)
            )
        }
    }
}