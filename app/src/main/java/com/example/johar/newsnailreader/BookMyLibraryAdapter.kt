package com.example.papyrus.gridlayout

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.johar.newsnailreader.R
import kotlinx.android.synthetic.main.item_book_library.view.*

class BookMyLibraryAdapter : BaseAdapter {
    var context: Context? = null
    var infoBook = ArrayList<BookMyLibrary>()

    constructor(context: Context?, transferAdapter: ArrayList<BookMyLibrary>) {
        this.context = context
        this.infoBook = transferAdapter
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var infoFinal = infoBook[position]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var itemView = inflator.inflate(R.layout.item_book_library, null)
        itemView.imageView.setImageResource(infoFinal.imageBook!!)
        itemView.title.text = infoFinal.titleBook!!
        itemView.description.text = infoFinal.descriptionBook!!
        return itemView

    }

    override fun getItem(position: Int): Any {

        return ""
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return infoBook.size
    }
}