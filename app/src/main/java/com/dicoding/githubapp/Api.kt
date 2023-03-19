package com.dicoding.githubapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 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")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<GithubResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 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")
    fun getDetailUser(@Path("username") username: String): Call<DetailUserResponse>

    @GET("users/{username}/following")
    @Headers("Authorization: token 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")
    fun getFollowing(@Path("username") username: String): Call<ArrayList<ItemsItem>>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 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")
    fun getFollowers(@Path("username") username: String): Call<ArrayList<ItemsItem>>
}