package com.septian.nurfaozy.aplikasifilmbeneran.Networking

import com.septian.nurfaozy.aplikasifilmbeneran.Movie
import retrofit2.Call

class MovieService : MovieAPI {

    private val movieAPI : MovieAPI = MovieRequest.retrofitInstance!!.create(MovieAPI::class.java)
    override fun getMovieTitle(title: String): Call<Movie> {

        return movieAPI.getMovieTitle(title)
    }

}