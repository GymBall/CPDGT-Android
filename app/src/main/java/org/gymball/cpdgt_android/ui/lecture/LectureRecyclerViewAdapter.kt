package org.gymball.cpdgt_android.ui.lecture

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
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
//        Glide.with(ctx)
//            .load(R.drawable.lecture1)
//            .into(holder.img)
//        holder.img.setOnClickListener {
//            ctx.startActivity<LectureDetailActivity>()
//        }
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //val img: ImageView = itemView.findViewById(R.id.iv_rv_item_frag_lecture_list_image) as ImageView
    }
}
