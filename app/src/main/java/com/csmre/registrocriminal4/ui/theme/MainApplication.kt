package com.csmre.registrocriminal4.ui.theme

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.util.appendPlaceholders
import com.csmre.registrocriminal4.db.CrimenDatabase
import java.util.UUID


class MainApplication : Application() {
    companion object {
        lateinit var crimenDatabase: CrimenDatabase
    }

    override fun onCreate() {
        super.onCreate()
        crimenDatabase = Room.databaseBuilder(
            applicationContext,
            CrimenDatabase::class.java,
            CrimenDatabase.NAME
        ).build()
    }
}
