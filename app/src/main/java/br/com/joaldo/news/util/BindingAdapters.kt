package br.com.joaldo.news.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import br.com.joaldo.news.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@BindingAdapter("imgUrl")
fun imgUrl(imageView: ImageView, url: String?){
    url?.let {
        Glide.with(imageView.context)
            .load(it)
            .apply(RequestOptions().placeholder(R.drawable.loading_animation).error(R.drawable.ic_broken_image))
            .into(imageView)
    }
}