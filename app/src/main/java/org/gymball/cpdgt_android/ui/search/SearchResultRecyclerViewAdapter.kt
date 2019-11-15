package org.gymball.cpdgt_android.ui.search

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.rv_search_result.view.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.home.HomeImageData
import org.gymball.cpdgt_android.ui.home.HomeRecyclerViewAdapter
import org.jetbrains.anko.image

class SearchResultRecyclerViewAdapter (val ctx : Context, val dataList : ArrayList<SearchResultData>) : RecyclerView.Adapter<SearchResultRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultRecyclerViewAdapter.Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_search_result, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: SearchResultRecyclerViewAdapter.Holder, position: Int) {
        holder.classImage.image = dataList[position].classimage
        holder.className.text = dataList[position].className
        holder.gymTeacher.text = dataList[position].gymTeacher
        holder.gymIndex.text = dataList[position].gymIndex
        holder.time.text = dataList[position].time

    }


    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val classImage = itemView.findViewById(R.id.rv_class_image) as ImageView
        val className = itemView.findViewById(R.id.rv_class_name) as TextView
        val gymTeacher = itemView.findViewById(R.id.rv_gym_teacher) as TextView
        val gymIndex = itemView.findViewById(R.id.rv_gym_index) as TextView
        val time = itemView.findViewById(R.id.rv_time) as TextView
    }
}
