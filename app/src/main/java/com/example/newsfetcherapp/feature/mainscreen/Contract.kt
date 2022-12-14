package com.example.newsfetcherapp.feature.mainscreen


import com.example.newsfetcherapp.Base.Event
import com.example.newsfetcher.feature.mainscreen.domain.ArticleModel

data class ViewState(
    val isSearchEnabled: Boolean,
    val articlesShown:List<ArticleModel>,
    val articleList: List<ArticleModel>,
    val editText :String,
    val favoriteArticlesChoice:Boolean
)
sealed class UiEvent: Event {

    data class OnArticleClicked(val index: Int): UiEvent()
    data class OnArticleClickedForInfo(val index: Int) : UiEvent()
    object OnSearchButtonClicked: UiEvent()
    data class OnSearchEdit(val text: String): UiEvent()
}

sealed class DataEvent: Event {

    object LoadArticles: DataEvent()
    data class OnLoadArticlesSucceed(val articles: List<ArticleModel>): DataEvent()

    //data class OnLoadArticlesError( val errorText: String): DataEvent()
}