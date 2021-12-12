package com.septian.nurfaozy.aplikasifilmbeneran.ui.home


import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.septian.nurfaozy.aplikasifilmbeneran.Movie

class MovieAdapter (private val movies:List<Movie>,
private val clickListener: (Movie) ->Unit
):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return movies.size
    }

}