package org.gymball.cpdgt_android.ui.lecture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import kotlinx.android.synthetic.main.fragment_lecture.*
import kotlinx.android.synthetic.main.fragment_lecture.view.*

import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.LectureListData

class LectureFragment : Fragment() {

    lateinit var lectureRecyclerViewAdapter: LectureRecyclerViewAdapter
    var dataList: ArrayList<LectureListData> = arrayListOf(LectureListData(R.drawable.lecture1),LectureListData(R.drawable.lecture1),LectureListData(R.drawable.lecture1))

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_lecture, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
        setView()
        val snapHelper : LinearSnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv_frag_lecture_lecture_list)
    }

    private fun setView() {
        tv_frag_lecture_lec_num.text = dataList.size.toString()
    }
    private fun setRecyclerView() {
        lectureRecyclerViewAdapter = LectureRecyclerViewAdapter(activity!!, dataList, dataList.size)
        rv_frag_lecture_lecture_list.adapter = lectureRecyclerViewAdapter
        rv_frag_lecture_lecture_list.layoutManager = LinearLayoutManager(activity!!, LinearLayoutManager.HORIZONTAL, false)
        indicator_frag_lecture.attachToRecyclerView(rv_frag_lecture_lecture_list)
    }
}
