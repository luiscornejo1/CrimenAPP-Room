package com.csmre.registrocriminal4.ui.theme

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class CrimenViewModel : ViewModel() {

    val crimenList = liveData(Dispatchers.IO) {
        emit(listOf("Crimen 1", "Crimen 2", "Crimen 3")) // Ejemplo de datos
    }

    fun addCrimen(titulo: String) {
        // Aggregate lógica para agregar un crimen
    }

    fun deleteCrimen(id: Int) {
        // Agregar lógica para eliminar un crimen
    }
}
