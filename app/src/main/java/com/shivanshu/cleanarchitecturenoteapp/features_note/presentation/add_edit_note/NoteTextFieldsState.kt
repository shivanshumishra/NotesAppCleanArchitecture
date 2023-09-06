package com.shivanshu.cleanarchitecturenoteapp.features_note.presentation.add_edit_note

data class NoteTextFieldsState(
    val text : String = "",
    val hint : String = "",
    val isHintVisible : Boolean = true
)