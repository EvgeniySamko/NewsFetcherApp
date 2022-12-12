package com.example.newsfetcherapp
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.newsfetcherapp.feature.mainscreen.bookmarks.data.model.BookmarkEntity
import com.example.newsfetcherapp.feature.mainscreen.bookmarks.data.model.BookmarksDao

@Database(entities = [BookmarkEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun bookmarksDao(): BookmarksDao
}