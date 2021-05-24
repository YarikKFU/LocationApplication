package com.example.locationapplication

import android.app.Service
import android.content.Intent
import android.location.LocationManager
import android.os.Build
import android.os.IBinder
import android.util.Log
import androidx.annotation.RequiresApi

class LocationService: Service() {

    private var locationManager: LocationManager? = null

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.d("TAG", "StartService")

        when(intent?.getStringExtra("command")) {
            "true" -> LocationHelper.getInstance().startLocationListening()
            "false" -> {
                stopService(intent)
                LocationHelper.getInstance().stopLocating()
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}