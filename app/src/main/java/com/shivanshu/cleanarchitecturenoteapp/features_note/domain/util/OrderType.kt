package com.shivanshu.cleanarchitecturenoteapp.features_note.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
