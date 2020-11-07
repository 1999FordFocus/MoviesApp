package com.mustafa.movieguideapp.api

import com.mustafa.movieguideapp.models.network.MoviePersonResponse
import com.mustafa.movieguideapp.models.network.PeopleResponse
import com.mustafa.movieguideapp.models.network.PersonDetail
import com.mustafa.movieguideapp.models.network.TvPersonResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PeopleService {

    @GET("/3/person/popular?language=en")
    suspend fun fetchPopularPeople(@Query("page") page: Int): ApiResponse<PeopleResponse>

    @GET("/3/person/{person_id}")
    suspend fun fetchPersonDetail(@Path("person_id") id: Int): ApiResponse<PersonDetail>


    @GET("/3/search/person")
    suspend fun searchPeople(
        @Query("query") query: String,
        @Query("page") page: Int
    ): ApiResponse<PeopleResponse>

    @GET("/3/person/{person_id}/movie_credits")
    suspend fun fetchPersonMovies(@Path("person_id") id: Int): ApiResponse<MoviePersonResponse>

    @GET("/3/person/{person_id}/tv_credits")
    suspend fun fetchPersonTvs(@Path("person_id") id: Int): ApiResponse<TvPersonResponse>

}