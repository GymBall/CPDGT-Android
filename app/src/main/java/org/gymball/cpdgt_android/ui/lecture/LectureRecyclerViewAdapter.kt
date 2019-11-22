package org.gymball.cpdgt_android.ui.lecture

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
import org.gymball.cpdgt_android.model.LectureListData
import org.gymball.cpdgt_android.ui.lecturedetail.LectureDetailActivity
import org.jetbrains.anko.startActivity

class LectureRecyclerViewAdapter(val ctx:Context, var dataList: ArrayList<LectureListData>, var total: Int) : RecyclerView.Adapter<LectureRecyclerViewAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_frag_lecture_list, parent,false)
        return Holder(view)
    }

    override fun getItemCount(): Int = total

    override fun onBindViewHolder(holder: LectureRecyclerViewAdapter.Holder, position: Int) {
        holder.whole.setOnClickListener {
            ctx.startActivity<LectureDetailActivity>( "t_image" to dataList[position].teacher_img,
                "c_name" to dataList[position].class_name, "c_time" to dataList[position].class_time,
                "t_name" to dataList[position].teacher_name, "summary" to dataList[position].summary,
                "background" to dataList[position].background)
        }

        var options: RequestOptions = RequestOptions().transform(CenterCrop(), RoundedCorners(170))
        Glide.with(ctx)
            .load(dataList[position].background)
            .into(holder.back)
        holder.c_name.text = dataList[position].class_name
        holder.c_time.text = dataList[position].class_time
        Glide.with(ctx)
            .load(dataList[position].teacher_img)
            .apply(options)
            .into(holder.t_img)
        holder.t_name.text = dataList[position].teacher_name
        holder.ment1.text = "_"+dataList[position].ment1+"부터 수강 시작"
        holder.ment2.text = "_"+dataList[position].ment2+"일째 Gym 중"
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val whole: CardView = itemView.findViewById(R.id.cv_rv_item_frag_lecture_list_whole) as CardView
        val back: ImageView = itemView.findViewById(R.id.iv_rv_item_frag_lecture_list_background) as ImageView
        val c_name: TextView = itemView.findViewById(R.id.tv_rv_item_lecture_list_class_name) as TextView
        val c_time: TextView = itemView.findViewById(R.id.tv_rv_item_lecture_list_class_time) as TextView
        val t_img: ImageView = itemView.findViewById(R.id.iv_rv_item_frag_lecture_list_image) as ImageView
        val t_name: TextView = itemView.findViewById(R.id.tv_rv_item_lecture_list_teacher_name) as TextView
        val ment1: TextView = itemView.findViewById(R.id.tv_rv_item_lecture_list_explain_1) as TextView
        val ment2: TextView = itemView.findViewById(R.id.tv_rv_item_lecture_list_explain_2) as TextView
    }
}
