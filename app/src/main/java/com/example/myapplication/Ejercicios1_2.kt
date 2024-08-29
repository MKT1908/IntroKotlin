package com.example.myapplication

fun main() {
    numerodemensajesleidos()
    println()
    fotoseliminadas()
}

fun numerodemensajesleidos() {
    val count: Int = 10
    println("You have $count unread messages.")
}

fun fotoseliminadas() {
    val numberOfPhotos = 100
    val photosDeleted = 10
    println("$numberOfPhotos photos")
    println("$photosDeleted photos deleted")
    println("${numberOfPhotos - photosDeleted} photos left")
}
