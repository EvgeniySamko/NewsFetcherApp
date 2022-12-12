package com.example.newsfetcherapp.feature.mainscreen.bookmarks.data.model

import androidx.room.*
import com.example.newsfetcherapp.feature.mainscreen.bookmarks.data.model.BookmarkEntity
import com.example.newsfetcherapp.feature.mainscreen.bookmarks.di.BOOKMARKS_TABLE

@Dao
 interface BookmarksDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun create (entity: BookmarkEntity)

    @Query ("SELECT * FROM $BOOKMARKS_TABLE")
    suspend fun read(): List<BookmarkEntity>

    @Update
    suspend fun update (entity: BookmarkEntity)

    @Delete
    suspend fun delete (entity: BookmarkEntity)
}