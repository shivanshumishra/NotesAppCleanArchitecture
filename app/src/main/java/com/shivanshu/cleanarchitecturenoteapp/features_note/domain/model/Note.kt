package com.shivanshu.cleanarchitecturenoteapp.features_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.shivanshu.cleanarchitecturenoteapp.ui.theme.BabyBlue
import com.shivanshu.cleanarchitecturenoteapp.ui.theme.LightGreen
import com.shivanshu.cleanarchitecturenoteapp.ui.theme.RedOrange
import com.shivanshu.cleanarchitecturenoteapp.ui.theme.RedPink
import com.shivanshu.cleanarchitecturenoteapp.ui.theme.Violet

@Entity
data class Note(
    val title : String,
    val content : String,
    val timestamp: Long,
    val color : Int,
    @PrimaryKey val id : Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}
