package com.csmre.registrocriminal4.ui.theme

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.activity.compose.BackHandler as BackHandler1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "listaCrimenesFragment") {
                        composable("listaCrimenesFragment") {
                            ListaCrimenesFragment(navController)
                        }
                        composable("crimenFragment") {
                            CrimenFragment(navController)
                        }
                    }
                }
            }
        }
    }




}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialTheme {
        Surface {
            content()
        }
    }
}

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "ListaCrimenesFragment") {
        composable("listaCrimenesFragment") {
            ListaCrimenesFragment(navController = navController)
        }
        composable("crimenFragment") {
            CrimenFragment(navController = navController)
            // Aquí puedes agregar más destinos composable para otras pantallas
        }
    }

    @Composable
    fun CrimenFragment(navController: NavHostController) {
        var titulo by remember { mutableStateOf("") }
        val context = LocalContext.current

        BackHandler1(enabled = titulo.isNotEmpty()) {
            if (titulo.isEmpty()) {
                Toast.makeText(context, "El título no puede estar vacío.", Toast.LENGTH_LONG).show()
            } else {
                navController.popBackStack()
            }
        }

        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Título")
            TextField(
                value = titulo,
                onValueChange = { titulo = it },
                label = { Text("Escriba el título del crimen") }
            )
        }
    }
}



