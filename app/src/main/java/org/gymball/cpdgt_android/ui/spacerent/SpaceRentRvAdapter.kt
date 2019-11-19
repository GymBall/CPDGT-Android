package org.gymball.cpdgt_android.ui.spacerent

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.gtlecture.GTLecRvAdapter
import org.gymball.cpdgt_android.ui.gtlecture.GTLecture


class SpaceRentRvAdapter (val ctx: Context, val LectureList: ArrayList<SpaceRentData>, var total: Int):
    RecyclerView.Adapter<SpaceRentRvAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(ctx).inflate(R.layout.rv_item_space, parent, false)
        return Holder(view)
    }

    override fun getItemCount(): Int = total

    override fun onBindViewHolder(holder: SpaceRentRvAdapter.Holder, position: Int) {
        //holder.whole.setOnClickListener{
        //     ctx.startActivity<
        //  }
        Glide.with(ctx)
            .load(LectureList[position].space_image)
            .into(holder.s_Image)
        holder.r_count.text = LectureList[position].rental_count
        holder.s_category.text = LectureList[position].space_category
        holder.s_name.text = LectureList[position].space_name
        holder.s_address.text = LectureList[position].space_address
        holder.s_time.text = LectureList[position].space_time


    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val s_Image: ImageView = itemView.findViewById(R.id.space_image) as ImageView
        val r_count: TextView = itemView.findViewById(R.id.rental_count) as TextView
        val s_category: TextView = itemView.findViewById(R.id.space_category) as TextView
        val s_name: TextView = itemView.findViewById(R.id.space_name) as TextView
        val s_address: TextView = itemView.findViewById(R.id.space_address) as TextView
        val s_time: TextView = itemView.findViewById(R.id.space_time) as TextView

    }
}