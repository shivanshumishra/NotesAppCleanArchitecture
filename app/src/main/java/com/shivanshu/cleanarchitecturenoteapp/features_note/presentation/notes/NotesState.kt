package com.shivanshu.cleanarchitecturenoteapp.features_note.presentation.notes

import com.shivanshu.cleanarchitecturenoteapp.features_note.domain.model.Note
import com.shivanshu.cleanarchitecturenoteapp.features_note.domain.util.NoteOrder
import com.shivanshu.cleanarchitecturenoteapp.features_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
