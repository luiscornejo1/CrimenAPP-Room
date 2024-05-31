package com.csmre.registrocriminal4.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.csmre.registrocriminal4.ui.theme.Crimen
import java.util.UUID

@Dao
interface CrimenDao {

    @Query("SELECT * FROM crimen")
    fun getAllCrimen() : LiveData<List<Crimen>>

    @Insert
    fun addCrimen(crimen: Crimen)

    @Query("Delete FROM crimen where id= :id")
    fun deleteCrimen(id:Int)

}