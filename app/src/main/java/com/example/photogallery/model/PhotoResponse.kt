package com.example.photogallery.model

import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("photo") val galleryItem: List<GalleryItem>
)
