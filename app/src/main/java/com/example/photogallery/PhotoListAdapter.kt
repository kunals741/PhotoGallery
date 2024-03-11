package com.example.photogallery

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.photogallery.databinding.ListItemGalleryBinding
import com.example.photogallery.model.GalleryItem


class PhotoListViewHolder(private val binding: ListItemGalleryBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(galleryItem: GalleryItem) {
        binding.itemImageView.load(galleryItem.url)
    }
}

class PhotoListAdapter(private val galleryItems: List<GalleryItem>) :
    RecyclerView.Adapter<PhotoListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemGalleryBinding.inflate(inflater, parent, false)
        return PhotoListViewHolder(binding)
    }

    override fun getItemCount() = galleryItems.size

    override fun onBindViewHolder(holder: PhotoListViewHolder, position: Int) {
        holder.bind(galleryItems[position])
    }

}