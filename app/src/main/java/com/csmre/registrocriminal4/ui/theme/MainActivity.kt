package com.csmre.registrocriminal4.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val CrimenViewModel = ViewModelProvider(this    )[CrimenViewModel::class.java]
        setContent{
            MaterialTheme{
                CrimenInfo()
            }
        }
     } 
    @Composable
    fun CrimenInfo(){
        Column{
            Text(text = "impresora dañada")
            Text(text = getCurretDateTime())
        }
    }
    private fun getCurretDateTime(): String{
        val dateFormat = SimpleDateFormat("EEEE,dd'de' MMM 'del' yyyy HH:mm:ss", Locale("es","ES"))
        return dateFormat.format(Date())
    }
    @Preview
    @Composable
    fun PreviewCrimenTitle(){
        CrimenInfo()

    }
}
