package com.example.photogallery.api

import com.example.photogallery.model.FlickrResponse
import com.example.photogallery.model.PhotoResponse
import retrofit2.http.GET
import retrofit2.http.Query

private const val API_KEY = "040582902b0f564efd85f509533a4872"

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("services/rest?method=flickr.photos.search")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
}