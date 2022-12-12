package com.example.newsfetcherapp.feature.mainscreen
import com.example.newsfetcherapp.di.API_KEY
import com.example.newsfetcherapp.feature.mainscreen.data.model.ArticlesRemoteModel
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getArticles(
        @Query("apiKey") apiKey:String = API_KEY,
        @Query("country") country:String ="ru",
        ): ArticlesRemoteModel
}
