package com.example.mydictionary.model.repositiry

import com.example.mydictionary.model.data.AppState

interface RepositoryLocal<T> : Repository<T> {
    suspend fun saveToDB(appState: AppState)
}