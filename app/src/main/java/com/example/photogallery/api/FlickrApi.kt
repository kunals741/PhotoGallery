package com.example.photogallery.api

import com.example.photogallery.model.FlickrResponse
import com.example.photogallery.model.PhotoResponse
import retrofit2.http.GET

private const val API_KEY = "040582902b0f564efd85f509533a4872"
interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" +
    "&api_key=$API_KEY" +
    "&format=json" +
    "&nojsoncallback=1" +
    "&extras=url_s")
    suspend fun fetchPhotos() : FlickrResponse
}