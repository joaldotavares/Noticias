package br.com.joaldo.news.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imgUrl")
fun imgUrl(imageView: ImageView, url: String?){
    url?.let {
        Glide.with(imageView.context).load(it).into(imageView)
    }
}