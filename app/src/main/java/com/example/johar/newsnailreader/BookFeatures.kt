package com.example.papyrus.recyclerview

class BookFeatures {
    var imageBook: Int? = null
    var titleBook: String? = null
    var descriptionBook: String? = null

    constructor(imageBook: Int, titleBook: String, descriptionBook: String) {
        this.imageBook = imageBook
        this.titleBook = titleBook
        this.descriptionBook = descriptionBook
    }
}