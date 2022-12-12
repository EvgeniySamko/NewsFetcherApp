package com.example.newsfetcherapp.feature.mainscreen.articleInfoFragment.di

import com.example.newsfetcherapp.feature.mainscreen.articleInfoFragment.di.ArticleInfoViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val articleInfoModule =module {


    viewModel {
        ArticleInfoViewModel()
    }
}