package com.example.newsfetcherapp.feature.mainscreen.data.model

import com.example.newsfetcherapp.feature.mainscreen.NewsApi
import com.example.newsfetcherapp.feature.mainscreen.data.model.ArticlesRemoteModel

class ArticlesRemoteSource(private val api: NewsApi) {

suspend fun getArticles(): ArticlesRemoteModel {
    return api.getArticles()
}

}