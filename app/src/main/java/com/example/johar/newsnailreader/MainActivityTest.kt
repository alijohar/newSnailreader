package com.example.johar.newsnailreader

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.book_list_view.*

class MainActivityTest : AppCompatActivity() {
    var itemList= ArrayList<Book>()
    var transfer : BookAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.book_list_view)
        infoBook()
        transfer = BookAdapter(this, itemList)
        bookListView.adapter = transfer
    }



    fun infoBook(){
        itemList.add(Book(R.drawable.cover_book_test2, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.drawable.cover_book_test, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.drawable.cover_book_test2, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.drawable.cover_book_test, "Learning Adobe XD","Learning Adobe XD"))
        itemList.add(Book(R.drawable.cover_book_test2, "Learning Adobe XD","Learning Adobe XD"))
    }

}
