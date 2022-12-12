package com.example.newsfetcherapp.feature.mainscreen.articleInfoFragment.di

import com.example.newsfetcherapp.Base.BaseViewModel
import com.example.newsfetcherapp.Base.Event


class ArticleInfoViewModel : BaseViewModel<ViewState>() {

    override fun InitialViewState(): ViewState = ViewState(
        articleContent = "",
        articleDescription = "",
        articleUrlToImage = "",
        articleLink = "",
        articleTitle = ""
    )

    override fun reduce(event: Event, previousState: ViewState): ViewState? {

        when (event) {
            is DataEvent.ShowArticle -> {
                return previousState.copy(
                    articleTitle = event.title,
                    articleLink = event.url,
                    articleUrlToImage = event.urlToImage,
                    articleDescription = event.description,

                    )
            }
        }
        return null
    }
}

