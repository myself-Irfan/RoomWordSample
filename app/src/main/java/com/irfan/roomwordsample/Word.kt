package com.irfan.roomwordsample

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

// an entity class represents a table
@Entity(tableName = "word_table")
data class Word(
    // defines column and val
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "word") val word: String,
    @ColumnInfo(name = "created_at") val createdAt: Long = System.currentTimeMillis()
)