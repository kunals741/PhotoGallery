package com.example.photogallery

import com.example.photogallery.api.FlickrApi
import com.example.photogallery.model.GalleryItem
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class PhotoRepository {

    private val flickrApi: FlickrApi

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.flickr.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        flickrApi = retrofit.create()
    }

    suspend fun fetchPhotos(): List<GalleryItem> = flickrApi.fetchPhotos().photos.galleryItem
}