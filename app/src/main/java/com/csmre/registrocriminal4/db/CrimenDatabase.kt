package com.csmre.registrocriminal4.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.csmre.registrocriminal4.ui.theme.Crimen

@Database(entities = [Crimen::class], version = 1)
@TypeConverters (Converters::class)

abstract class CrimenDatabase:RoomDatabase() {
    companion object{
        const val NAME= "Todo_DB"
    }

    abstract fun getCrimenDao() : CrimenDao

}