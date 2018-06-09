package com.example.johar.newsnailreader

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class BookCategorisAdapter(var itemBook: ArrayList<BookCategoris>) : RecyclerView.Adapter<BookCategorisAdapter.ViewHolder>() {


    override fun getItemCount(): Int {
        return itemBook.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var infoFinal = itemBook[position]
        holder.titText.text = infoFinal.titleBook!!
        holder.desText.text = infoFinal.descriptionBook!!
        holder.ImgView.setImageResource(infoFinal.imageBook!!)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var bookItemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_book_categoris, parent, false)
        return BookCategorisAdapter.ViewHolder(bookItemView)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titText: TextView = itemView.findViewById(R.id.title)
        var desText: TextView = itemView.findViewById(R.id.description)
        var ImgView: ImageView = itemView.findViewById(R.id.imageView)

    }

}