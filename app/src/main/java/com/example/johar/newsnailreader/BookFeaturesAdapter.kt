package com.example.papyrus.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.johar.newsnailreader.R

// چجور کانستراکتور جدا برای بوک اداپتر بسازیم؟
class BookFeaturesAdapter(var itemBook: ArrayList<BookFeatures>) : RecyclerView.Adapter<BookFeaturesAdapter.ViewHolder>() {


    override fun getItemCount(): Int {
        // تعداد ایتم هایی که قرار است نمایش داده شود
        return itemBook.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //مقدار دهی به ایتم ها
        var infoFinal = itemBook[position]
        holder.titT.text = infoFinal.titleBook!!
        holder.desText.text = infoFinal.descriptionBook!!
        holder.ImgV.setImageResource(infoFinal.imageBook!!)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var bookItemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_book_features, parent, false)
        return ViewHolder(bookItemView)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // ایتم هایی که ساختیم اینجا نگهداری میشن
        // این کلاس رو خودمون میسازیم با هر اسمی
        var titT: TextView = itemView.findViewById(R.id.title)
        var desText: TextView = itemView.findViewById(R.id.description)
        var ImgV: ImageView = itemView.findViewById(R.id.imageView)

    }
}