package com.example.johar.newsnailreader

class Book{
    var nameBook:String?= null
    var descriptionBook: String? = null
    var pictureBook: Int? = null

  constructor(pictureBook: Int,nameBook: String,descriptionBook: String){
      this.pictureBook= pictureBook
      this.nameBook= nameBook
      this.descriptionBook=descriptionBook
  }


}