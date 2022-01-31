package com.example.cosplayplanner.models

import androidx.lifecycle.LiveData

class CosplayRepository(private val cosplayDao: CosplayDao) {

    val allCosplays: LiveData<List<Cosplay>> = cosplayDao.getAll()

    suspend fun insert(cosplay: Cosplay) {
        cosplayDao.insert(cosplay)
    }

    suspend fun update(cosplay: Cosplay, newCosplay: Cosplay) {
        cosplayDao.update(cosplay)
    }

    suspend fun delete(cosplay: Cosplay) {
        cosplayDao.delete(cosplay)
    }
}
