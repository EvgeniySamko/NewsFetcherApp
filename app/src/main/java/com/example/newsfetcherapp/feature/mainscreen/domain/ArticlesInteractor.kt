package com.example.newsfetcher.feature.mainscreen.domain

import com.example.newsfetcherapp.Base.attempt
import com.example.newsfetcherapp.feature.mainscreen.data.model.ArticlesRepository

class ArticlesInteractor(private val repository: ArticlesRepository) {

suspend fun getArticles() = attempt { repository.getArticles() }
}