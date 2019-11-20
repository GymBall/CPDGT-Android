package org.gymball.cpdgt_android.ui.home

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import org.gymball.cpdgt_android.R
import org.jetbrains.anko.image

class HomeRecyclerViewAdapter (val ctx : Context, val dataList : ArrayList<HomeImageData>) : RecyclerView.Adapter<HomeRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_home_image, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.homeimage.image = dataList[position].homeimage

    }
    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val homeimage : ImageView = itemView.findViewById(R.id.home_image) as ImageView
    }
}