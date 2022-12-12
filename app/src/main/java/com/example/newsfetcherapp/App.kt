package com.example.newsfetcherapp

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import com.example.newsfetcherapp.di.networkModule
import com.example.newsfetcherapp.di.databaseModule
import com.example.newsfetcherapp.feature.mainscreen.articleInfoFragment.di.articleInfoModule
import com.example.newsfetcherapp.feature.mainscreen.bookmarks.di.bookmarksModule
import com.example.newsfetcherapp.feature.mainscreen.di.mainScreenModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(networkModule,
                mainScreenModule, bookmarksModule, databaseModule, articleInfoModule)

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)
        }
    }
}



