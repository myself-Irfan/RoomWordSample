package com.irfan.roomwordsample

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class WordRepository(private val wordDao: WordDao) {
    // executes al queries on a separate thread

    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    // By default room runs suspend queries off main thread
    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}