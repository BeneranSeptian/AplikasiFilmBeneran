package com.septian.nurfaozy.aplikasifilmbeneran.Networking

import com.septian.nurfaozy.aplikasifilmbeneran.Movie
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MovieRepository {
    private val movieService = MovieService()

    suspend fun movieTitle(title:String) : Movie= withContext(Dispatchers.IO){

        //check if there's internet connection

        val execute = movieService.getMovieTitle(title).execute()
        if(execute.isSuccessful){
            return@withContext execute.body() ?: Movie()
        }else{
            return@withContext Movie()
        }
    }
}