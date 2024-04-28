package com.example.mymap.di.module

import android.content.Context
import androidx.room.Room
import com.example.mymap.features.map.data.dao.MapDao
import com.example.mymap.features.map.data.database.MapDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): MapDatabase {
        return Room.databaseBuilder(
            context,
            MapDatabase::class.java,
            "m_app_database"
        ).build()
    }

    @Provides
    fun provideUserDao(database: MapDatabase): MapDao {
        return database.mapDao()
    }
}