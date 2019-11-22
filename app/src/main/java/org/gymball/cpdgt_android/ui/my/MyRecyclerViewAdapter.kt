package org.gymball.cpdgt_android.ui.my

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.HomeDetailData
import org.gymball.cpdgt_android.model.LectureAbsData
import org.gymball.cpdgt_android.ui.lecturedetail.LectureDetailActivity
import org.jetbrains.anko.startActivity

class MyRecyclerViewAdapter (val ctx: Context, var dataList: ArrayList<HomeDetailData>, var total: Int) : RecyclerView.Adapter<MyRecyclerViewAdapter.Holder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyRecyclerViewAdapter.Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_my_recent, parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int = total

    override fun onBindViewHolder(holder: MyRecyclerViewAdapter.Holder, position: Int) {
        holder.whole.setOnClickListener{
            ctx.startActivity<LectureDetailActivity>( "t_image" to dataList[position].teacherimage,
                "c_name" to dataList[position].className, "c_time" to dataList[position].time,
                "t_name" to dataList[position].gymTeacher, "summary" to dataList[position].summary,
                "background" to dataList[position].classimage)
        }
        holder.c_name.text = dataList[position].className
        holder.c_time.text = dataList[position].time
        var options: RequestOptions = RequestOptions().transform(CenterCrop(), RoundedCorners(20))
        Glide.with(ctx)
            .load(dataList[position].teacherimage)
            .apply(options)
            .into(holder.t_img)
        holder.t_name.text = dataList[position].className
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val whole: CardView = itemView.findViewById(R.id.cv_rv_item_frag_my_recent_whole) as CardView
        val c_name: TextView = itemView.findViewById(R.id.iv_rv_item_frag_my_class_name) as TextView
        val c_time: TextView = itemView.findViewById(R.id.iv_rv_item_frag_my_class_time) as TextView
        val t_img: ImageView = itemView.findViewById(R.id.iv_rv_item_frag_my_teacher_image) as ImageView
        val t_name: TextView = itemView.findViewById(R.id.tv_rv_item_frag_my_teacher_name) as TextView
    }
}