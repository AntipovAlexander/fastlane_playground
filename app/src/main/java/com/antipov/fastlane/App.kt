package com.antipov.fastlane

import android.app.Application
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric


    override fun onCreate() {
        super.onCreate()
        Fabric.with(this, Crashlytics())
    }
}