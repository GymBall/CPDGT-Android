package org.gymball.cpdgt_android.ui.gtlecture

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import org.gymball.cpdgt_android.R

class GTLecRvAdapter (val ctx: Context, val LectureList: ArrayList<GTLecture>, var total: Int):
        RecyclerView.Adapter<GTLecRvAdapter.Holder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view : View = LayoutInflater.from(ctx).inflate(R.layout.rv_gt_mylecture, parent, false)
       return Holder(view)
    }

    override fun getItemCount(): Int  = total

    override fun onBindViewHolder(holder: GTLecRvAdapter.Holder, position: Int) {
        //holder.whole.setOnClickListener{
       //     ctx.startActivity<
      //  }
        holder.l_name.text = LectureList[position].lecturename
        holder.l_Time.text = LectureList[position].lecturetime
        holder.l_Grade.text = LectureList[position].lecturegrade
        holder.l_Total.text = LectureList[position].totalcount
        holder.l_WaitingTotal.text = LectureList[position].waitcount
        Glide.with(ctx)
            .load(LectureList[position].photo)
            .into(holder.l_Background)

    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val l_Background : ImageView = itemView.findViewById(R.id.gtlec_background) as ImageView
        val l_name: TextView = itemView.findViewById(R.id.gtlec_name) as TextView
        val l_Time : TextView = itemView.findViewById(R.id.gtlec_grade)  as TextView
        val l_Grade  : TextView = itemView.findViewById(R.id.gtlec_time)  as TextView
        val l_Total   : TextView = itemView.findViewById(R.id.gtlec_people) as TextView
        val l_WaitingTotal    : TextView = itemView.findViewById(R.id.gtlec_waiting) as TextView

    }
}