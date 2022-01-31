package com.example.cosplayplanner.models

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlin.math.cos

class MainViewModel(application: Application): AndroidViewModel(application) {
    private val repository: CosplayRepository

    val allCosplays: LiveData<List<Cosplay>>

    init {
        val cosplayDao = CosplayDatabase.getDatabase(application).cosplaysDao()
        repository = CosplayRepository(cosplayDao)
        allCosplays = repository.allCosplays
    }

    fun insert(cosplay: Cosplay) = viewModelScope.launch {
        repository.insert(cosplay)
    }
}