package com.septian.nurfaozy.aplikasifilmbeneran.Networking


import com.septian.nurfaozy.aplikasifilmbeneran.Movie
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieAPI {

    @GET("?apikey=880dbbba")
    fun getMovieTitle(
        @Query("t") title : String
    ): Call<Movie>
}