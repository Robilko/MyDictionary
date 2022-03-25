package com.example.mydictionary.model.datasource

import com.example.mydictionary.model.data.AppState

interface DataSourceLocal<T> : DataSource<T> {
    suspend fun saveToDB(appState: AppState)
}