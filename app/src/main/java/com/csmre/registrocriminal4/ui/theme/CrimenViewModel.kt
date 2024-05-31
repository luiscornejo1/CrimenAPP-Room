package com.csmre.registrocriminal4.ui.theme
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.findViewTreeLifecycleOwner
import androidx.lifecycle.viewModelScope
import com.csmre.registrocriminal4.db.CrimenDatabase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.time.Instant
import java.util.Date
import java.util.UUID

class CrimenViewModel : ViewModel() {
    val crimenDao = MainApplication.crimenDatabase.getCrimenDao()


    val crimenList : LiveData<List<Crimen>> = crimenDao.getAllCrimen()


    fun addCrimen(titulo : String){
        viewModelScope.launch(Dispatchers.IO) {
            crimenDao.addCrimen(Crimen(titulo = titulo, createdAt = Date.from(Instant.now())))

        }


    }
    fun deleteCrimen(id : Int){
        viewModelScope.launch(Dispatchers.IO) {
            crimenDao.deleteCrimen(id)
        }

    }
}




