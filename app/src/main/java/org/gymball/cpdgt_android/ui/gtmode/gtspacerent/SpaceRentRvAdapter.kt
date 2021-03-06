package org.gymball.cpdgt_android.ui.gtmode.gtspacerent

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.SpaceRentData


class SpaceRentRvAdapter (val ctx: Context, var SpaceList: ArrayList<SpaceRentData>, var total: Int):
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
            .load(SpaceList[position].space_image)
            .into(holder.s_Image)
        holder.r_count.text = "총 "+SpaceList[position].rental_count+"회 대여"
        holder.s_category.text = SpaceList[position].space_category
        holder.s_name.text = SpaceList[position].space_name
        holder.s_address.text = SpaceList[position].space_address
        holder.s_time.text = SpaceList[position].space_time


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