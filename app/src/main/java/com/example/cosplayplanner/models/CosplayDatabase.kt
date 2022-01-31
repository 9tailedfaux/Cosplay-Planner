package com.example.cosplayplanner.models

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Cosplay::class], version = 1, exportSchema = false)
abstract class CosplayDatabase : RoomDatabase() {

    abstract fun cosplaysDao(): CosplayDao

    companion object {

        @Volatile
        private var INSTANCE: CosplayDatabase? = null

        fun getDatabase(context: Context): CosplayDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) return tempInstance

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CosplayDatabase::class.java,
                    "cosplay"
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }

}