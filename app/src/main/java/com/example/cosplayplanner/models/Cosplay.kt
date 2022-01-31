package com.example.cosplayplanner.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "cosplay")
data class Cosplay (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "character") val name: String,
    @ColumnInfo(name = "series") val series: String,
    @ColumnInfo(name = "date") val date: GregorianCalendar,
    @ColumnInfo(name = "due_date") val dueDate: GregorianCalendar?,
    @ColumnInfo(name = "budget") val budget: Int?,
    )