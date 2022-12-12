package com.example.newsfetcherapp.feature.mainscreen.bookmarks.data.model

import com.example.newsfetcherapp.feature.mainscreen.bookmarks.data.model.BookmarkEntity
import com.example.newsfetcherapp.feature.mainscreen.bookmarks.data.model.BookmarksDao

class BookmarksLocalSource(private val bookmarksDao: BookmarksDao) {

    suspend fun create(entity: BookmarkEntity) {
        bookmarksDao.create(entity)
    }

    suspend fun read(): List<BookmarkEntity> {
        return bookmarksDao.read()
    }

    suspend fun update(entity: BookmarkEntity) {
        bookmarksDao.update(entity)
    }

    suspend fun delete(entity: BookmarkEntity) {
        bookmarksDao.delete(entity)
    }
}
