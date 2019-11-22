package org.gymball.cpdgt_android.ui.search

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
import org.gymball.cpdgt_android.model.SearchResultData
import org.gymball.cpdgt_android.ui.lecturedetail.LectureDetailActivity
import org.jetbrains.anko.startActivity

class SearchResultRecyclerViewAdapter (val ctx : Context, val dataList : ArrayList<SearchResultData>) : RecyclerView.Adapter<SearchResultRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchResultRecyclerViewAdapter.Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_search_result, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = dataList.size

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.whole.setOnClickListener {
            ctx.startActivity<LectureDetailActivity>( "t_image" to dataList[position].teacherimage,
                "c_name" to dataList[position].className, "c_time" to dataList[position].time,
                "t_name" to dataList[position].gymTeacher, "summary" to dataList[position].summary,
                "background" to dataList[position].classimage)
        }

        var options: RequestOptions = RequestOptions().transform(CenterCrop(), RoundedCorners(170))
        Glide.with(ctx)
            .load(dataList[position].teacherimage)
            .apply(options)
            .into(holder.teacherImage)

        holder.className.text = dataList[position].className
        holder.gymTeacher.text = dataList[position].gymTeacher+" 짐선"
        holder.gymIndex.text = dataList[position].gymIndex
        holder.time.text = dataList[position].time
        if(position==dataList.size-1) {
            holder.line.visibility = View.INVISIBLE
        }

    }


    inner class Holder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val whole: RelativeLayout = itemView.findViewById(R.id.whole) as RelativeLayout
        val teacherImage = itemView.findViewById(R.id.rv_teacher_image) as ImageView
        val className = itemView.findViewById(R.id.rv_class_name) as TextView
        val gymTeacher = itemView.findViewById(R.id.rv_gym_teacher) as TextView
        val gymIndex = itemView.findViewById(R.id.rv_gym_index) as TextView
        val time = itemView.findViewById(R.id.rv_time) as TextView
        val line: View = itemView.findViewById(R.id.line) as View
    }
}
