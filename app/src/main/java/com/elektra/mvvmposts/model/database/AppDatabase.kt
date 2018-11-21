package com.elektra.mvvmposts.model.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.elektra.mvvmposts.model.Post
import com.elektra.mvvmposts.model.PostDao


@Database(entities = [Post::class],version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract  fun postDao():PostDao
}