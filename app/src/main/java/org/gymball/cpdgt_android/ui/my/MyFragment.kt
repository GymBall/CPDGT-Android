package org.gymball.cpdgt_android.ui.my


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_my.*

import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.LectureAbsData
import org.gymball.cpdgt_android.ui.login.LoginActivity
import org.jetbrains.anko.support.v4.startActivity

class MyFragment : Fragment() {

    lateinit var myRecyclerViewAdapter: MyRecyclerViewAdapter
    var dataList: ArrayList<LectureAbsData> = arrayListOf(
        LectureAbsData("클래스 이름", "클래스 시간대", R.drawable.lecture_comment_teacher,"뫄뫄"),
        LectureAbsData("클래스 이름", "클래스 시간대", R.drawable.lecture_comment_teacher,"묘묘"),
        LectureAbsData("클래스 이름", "클래스 시간대", R.drawable.lecture_comment_teacher,"뮤뮤"),
        LectureAbsData("클래스 이름", "클래스 시간대", R.drawable.lecture_comment_teacher,"뮤뮤")
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        myRecyclerViewAdapter = MyRecyclerViewAdapter(activity!!, dataList, dataList.size)
        rv_my_recent.adapter = myRecyclerViewAdapter
        rv_my_recent.layoutManager = LinearLayoutManager(activity!!, LinearLayoutManager.HORIZONTAL, false)
    }
}
