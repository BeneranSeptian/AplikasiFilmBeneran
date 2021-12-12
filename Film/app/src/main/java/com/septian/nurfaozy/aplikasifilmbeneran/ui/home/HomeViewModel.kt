package com.septian.nurfaozy.aplikasifilmbeneran.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.septian.nurfaozy.aplikasifilmbeneran.Movie
import com.septian.nurfaozy.aplikasifilmbeneran.Networking.MovieRepository
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val movieRepository = MovieRepository();

    var movie = MutableLiveData<Movie>()
    fun Movie(): LiveData<Movie> = movie

    fun getMovieTitle(title:String){
        viewModelScope.launch {
            val movieResponse = movieRepository.movieTitle((title))
            movie.value= movieResponse!!
        }
    }
}