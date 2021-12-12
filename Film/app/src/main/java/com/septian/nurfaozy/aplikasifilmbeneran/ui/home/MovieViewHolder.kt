package com.septian.nurfaozy.aplikasifilmbeneran.ui.home

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.septian.nurfaozy.aplikasifilmbeneran.Movie
import com.septian.nurfaozy.aplikasifilmbeneran.databinding.MovieItemBinding

class MovieViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {

    private val binding = MovieItemBinding.bind(itemView)
    fun bindView(context:Context,movie: Movie,clickListener:(Movie)->Unit){
        Glide.with(context)
            .load(movie.poster)
            .into(binding.ivPoster)

        binding.tvTitle.text=movie.title
        binding.tvDescription.text=movie.plot

        itemView.setOnClickListener{
            clickListener(movie)
        }
    }
}