package org.gymball.cpdgt_android.ui.gtlecture

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.gymball.cpdgt_android.R

class LecRvAdapter (val context: Context, val LectureList: ArrayList<Lecture>):
        RecyclerView.Adapter<LecRvAdapter.Holder>(){
    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(LectureList[position], context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.rv_gt_mylecture, parent, false)
        return Holder(view)
    }
    override fun getItemCount(): Int {
        return LectureList.size
    }


    inner class Holder(itemView: View? ): RecyclerView.ViewHolder(itemView!!){
        val LectureName = itemView?.findViewById<TextView>(R.id.gtlec_name)
        val LectureTime = itemView?.findViewById<TextView>(R.id.gtlec_time)
        val LectureGrade = itemView?.findViewById<TextView>(R.id.gtlec_grade)
        val LectureTotal = itemView?.findViewById<TextView>(R.id.gtlec_people)
        val LectureWaitingTotal = itemView?.findViewById<TextView>(R.id.gtlec_waiting)
        val LectureBackground = itemView?.findViewById<ImageView>(R.id.gtlec_background)

        fun bind(lec : Lecture, context: Context){

            if(lec.photo != ""){
                val resourceId = context.resources.getIdentifier(lec.photo, "drawable", context.packageName)
                LectureBackground?.setImageResource(resourceId)
            }else{
                LectureBackground?.setImageResource(R.mipmap.ic_launcher)
            }

            LectureName?.text = lec.lecturename
            LectureTime?.text = lec.lecturetime
            LectureGrade?.text = lec.lecturegrade
            LectureTotal?.text = lec.totalcount
            LectureWaitingTotal?.text = lec.waitcount

        }
    }


}