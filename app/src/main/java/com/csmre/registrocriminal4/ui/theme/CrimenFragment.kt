package com.csmre.registrocriminal4.ui.theme


import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.wear.compose.material.Text

@Composable
fun CrimenFragment(navController: NavHostController) {
    var titulo by remember { mutableStateOf("") }
    val context = LocalContext.current

    BackHandler(enabled = titulo.isEmpty()) {
        Toast.makeText(context, "El título no puede estar vacío.", Toast.LENGTH_LONG).show()
    }

    Column {
        Text("Título")
        TextField(
            value = titulo,
            onValueChange = { titulo = it },
            label = { Text("Ingrese un título para el crimen") }
        )
    }
}