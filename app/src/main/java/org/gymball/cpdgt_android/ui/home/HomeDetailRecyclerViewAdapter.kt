package org.gymball.cpdgt_android.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.lecturedetail.LectureDetailActivity
import org.jetbrains.anko.image
import org.jetbrains.anko.startActivity

class HomeDetailRecyclerViewAdapter (val ctx : Context, val dataList : ArrayList<HomeDetailData>) : RecyclerView.Adapter<HomeDetailRecyclerViewAdapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeDetailRecyclerViewAdapter.Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_home_detail, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: HomeDetailRecyclerViewAdapter.Holder, position: Int) {
        holder.classImage.image = dataList[position].classimage
        holder.className.text = dataList[position].className
        holder.gymTeacher.text = dataList[position].gymTeacher
        holder.gymIndex.text = dataList[position].gymIndex
        holder.time.text = dataList[position].time
        holder.summary.text = dataList[position].summary
        if(position == dataList.size-1) {
            holder.line.visibility = View.INVISIBLE
        }
        holder.whole.setOnClickListener {
            ctx.startActivity<LectureDetailActivity>()
        }

    }

    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val whole : RelativeLayout = itemView.findViewById(R.id.whole) as RelativeLayout
        val classImage:ImageView = itemView.findViewById(R.id.rv_class_image) as ImageView
        val className:TextView = itemView.findViewById(R.id.rv_class_name) as TextView
        val gymTeacher:TextView  = itemView.findViewById(R.id.rv_gym_teacher) as TextView
        val gymIndex:TextView  = itemView.findViewById(R.id.rv_gym_index) as TextView
        val time:TextView  = itemView.findViewById(R.id.rv_time) as TextView
        val summary:TextView  = itemView.findViewById(R.id.rv_summary) as TextView
        val line:View = itemView.findViewById(R.id.line) as View
    }
}