package com.example.newsfetcherapp.feature.mainscreen.bookmarks.ui


import com.example.newsfetcherapp.Base.Event
import com.example.newsfetcher.feature.mainscreen.domain.ArticleModel

data class ViewState(
    val bookmarksArticle: List<ArticleModel>
)

sealed class UiEvent : Event {

    data class OnArticleClicked(val index: Int) : UiEvent()
}

sealed class DataEvent : Event {

    object LoadBookmarks : DataEvent()
    data class OnSuccessBookmarksLoaded(val bookmarksArticle: List<ArticleModel>) : DataEvent()
    data class OnFailedBookmarksLoaded(val throwable: Throwable) : DataEvent()
}
