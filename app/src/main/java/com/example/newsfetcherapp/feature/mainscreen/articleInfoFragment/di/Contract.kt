package com.example.newsfetcherapp.feature.mainscreen.articleInfoFragment.di

import com.example.newsfetcherapp.Base.Event

data class ViewState(
    val articleTitle: String?,
    val articleDescription: String?,
    val articleContent: String?,
    val articleUrlToImage: String?,
    val articleLink: String?
)

sealed class UiEvent() : Event {

}

sealed class DataEvent() : Event {
    data class ShowArticle(
        val title:String,
        val description:String,
        val url:String,
        val urlToImage:String) : DataEvent()
}