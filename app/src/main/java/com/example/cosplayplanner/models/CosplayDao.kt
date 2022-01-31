package com.example.cosplayplanner.models

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CosplayDao {
    @Query("SELECT * FROM cosplay")
    fun getAll(): LiveData<List<Cosplay>>

    @Query("SELECT * FROM cosplay WHERE id=:id")
    fun loadSingleById(id: Int): LiveData<Cosplay>

    @Insert
    suspend fun insert(cosplay: Cosplay)

    @Update
    suspend fun update(cosplay: Cosplay)

    @Delete
    suspend fun delete(cosplay: Cosplay)
}