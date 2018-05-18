package com.example.papyrus.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.johar.newsnailreader.R

class BanerFeaturesAdapter(var itemBanerFeatures: ArrayList<BanerFeatures>) : RecyclerView.Adapter<BanerFeaturesAdapter.ViewHolderBaner>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderBaner {
        var banerItemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item_baner_features, parent, false)
        return ViewHolderBaner(banerItemView)

    }

    override fun getItemCount(): Int {
        return itemBanerFeatures.size
    }

    override fun onBindViewHolder(holder: ViewHolderBaner, position: Int) {
        var infoFinal = itemBanerFeatures[position]
        holder.imgbaner.setImageResource(infoFinal.imageBaner!!)

    }


    class ViewHolderBaner(itemview: View) : RecyclerView.ViewHolder(itemview) {
        var imgbaner: ImageView = itemview.findViewById(R.id.banerImageView)

    }

}
