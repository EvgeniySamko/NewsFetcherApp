package com.example.newsfetcherapp.feature.mainscreen.data.model

import com.example.newsfetcher.feature.mainscreen.domain.ArticleModel
import com.example.newsfetcherapp.feature.mainscreen.data.model.ArticleRemoteModel

fun ArticleRemoteModel.toDomain() = ArticleModel(

    author = author ?:"",
    title = title ?:"",
    description = description ?:"",
    url = url ?:"",
    urlToImage = urlToImage?: "",
    publishedAt = publishedAt ?:"",
    content = content ?:""
)