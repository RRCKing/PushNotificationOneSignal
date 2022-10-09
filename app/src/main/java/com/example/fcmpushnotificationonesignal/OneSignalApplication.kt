package com.example.fcmpushnotificationonesignal

import android.app.Application;
import com.onesignal.OneSignal

class OneSignalApplication: Application() {
    private val ONESIGNAL_APP_ID = "46210d8b-e980-4c37-911c-5051ecc81a77"

    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        //OneSignal.setLogLevel(OneSignal.LOG_LEVEL.DEBUG, OneSignal.LOG_LEVEL.DEBUG);

        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)

    }
}