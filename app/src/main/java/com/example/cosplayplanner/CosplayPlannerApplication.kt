package com.example.cosplayplanner

import android.app.Application
import com.google.android.material.color.DynamicColors
import io.realm.Realm

class CosplayPlannerApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}