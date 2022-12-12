package com.example.newsfetcherapp.feature.mainscreen.data.model

import com.example.newsfetcherapp.feature.mainscreen.data.model.ArticleRemoteModel
import com.google.gson.annotations.SerializedName

data class ArticlesRemoteModel (
    @SerializedName("articles")
    val articleList: List<ArticleRemoteModel>
    )
