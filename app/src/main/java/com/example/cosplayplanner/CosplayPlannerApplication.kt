package com.example.cosplayplanner

import android.app.Application
import com.google.android.material.color.DynamicColors

class CosplayPlannerApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        DynamicColors.applyToActivitiesIfAvailable(this)
    }
}