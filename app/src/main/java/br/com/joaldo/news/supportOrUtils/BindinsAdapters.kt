package br.com.joaldo.news.supportOrUtils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imgUrl")
fun imgUrl(imgView: ImageView, url: String?){
    url?.let {
        Glide.with(imgView.context).load(it).into(imgView)
    }
}