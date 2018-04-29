package com.example.johar.newsnailreader

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.book_item_view.view.*

class BookAdapter : BaseAdapter {
    var context: Context? = null
    var transfer = ArrayList<Book>()

    constructor(context: Context, transfer: ArrayList<Book>) {
        this.context = context
        this.transfer = transfer
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var final = transfer[0]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var itemView = inflator.inflate(R.layout.book_item_view, null)
        itemView.imageView.setImageResource(final.pictureBook!!)
        itemView.title.text = final.nameBook!!
        itemView.description.text = final.descriptionBook!!
        return itemView


    }

    override fun getItem(position: Int): Any {
        return transfer[0]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return transfer.size
    }


}