package org.gymball.cpdgt_android.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.HomeDetailData
import org.gymball.cpdgt_android.ui.lecturedetail.LectureDetailActivity
import org.jetbrains.anko.startActivity

class HomeDetailRecyclerViewAdapter (val ctx : Context, val dataList : ArrayList<HomeDetailData>) : RecyclerView.Adapter<HomeDetailRecyclerViewAdapter.Holder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_home_detail, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        //holder.classImage.image =
        var options: RequestOptions = RequestOptions().transform(CenterCrop(), RoundedCorners(20))

        Glide.with(ctx)
            .load(dataList[position].teacherimage)
            .apply(options)
            .into(holder.t_image)
        holder.className.text = dataList[position].className
        holder.gymTeacher.text = dataList[position].gymTeacher
        holder.gymIndex.text = dataList[position].gymIndex
        holder.time.text = dataList[position].time
        holder.summary.text = dataList[position].summary
        if(position == dataList.size-1) {
            holder.line.visibility = View.INVISIBLE
        }
        holder.whole.setOnClickListener {
            ctx.startActivity<LectureDetailActivity>( "t_image" to dataList[position].teacherimage,
                "c_name" to dataList[position].className, "c_time" to dataList[position].time,
                "t_name" to dataList[position].gymTeacher, "summary" to dataList[position].summary,
                "background" to dataList[position].classimage)
        }

    }

    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val whole : RelativeLayout = itemView.findViewById(R.id.whole) as RelativeLayout
        val t_image:ImageView = itemView.findViewById(R.id.rv_teacher_image) as ImageView
        val className:TextView = itemView.findViewById(R.id.rv_class_name) as TextView
        val gymTeacher:TextView  = itemView.findViewById(R.id.rv_gym_teacher) as TextView
        val gymIndex:TextView  = itemView.findViewById(R.id.rv_gym_index) as TextView
        val time:TextView  = itemView.findViewById(R.id.rv_time) as TextView
        val summary:TextView  = itemView.findViewById(R.id.rv_summary) as TextView
        val line:View = itemView.findViewById(R.id.line) as View
    }
}