package com.example.photogallery

import android.app.Application

class PhotoGalleryApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        PreferenceRepository.initialize(this)
    }
}