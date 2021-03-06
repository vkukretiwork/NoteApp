package com.example.android.noteapp

import androidx.room.Embedded
import androidx.room.Relation

data class TitlesWithSubtitles(
    @Embedded val title : Title,
    @Relation(
        parentColumn = "idTitle",
        entityColumn = "idTitle"
    )
    val subtitles : List<Subtitle>
)