package com.example.locationapplication

import android.app.Service
import android.content.Intent
import android.location.LocationManager
import android.os.IBinder
import android.util.Log

class LocationService: Service() {

    private var locationManager: LocationManager? = null

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("TAG", "StartService")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}