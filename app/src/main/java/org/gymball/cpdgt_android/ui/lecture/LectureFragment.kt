package org.gymball.cpdgt_android.ui.lecture

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.rbrooks.indefinitepagerindicator.IndefinitePagerIndicator
import kotlinx.android.synthetic.main.fragment_lecture.*
import kotlinx.android.synthetic.main.fragment_lecture.view.*

import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.LectureListData
import org.jetbrains.anko.support.v4.startActivity

class LectureFragment : Fragment() {

    lateinit var lectureRecyclerViewAdapter: LectureRecyclerViewAdapter
    var dataList: ArrayList<LectureListData> = arrayListOf(
        LectureListData(
            R.drawable.boxing_b3,
            R.drawable.boxing_t3,
            "복싱 1대1",
            "김지아",
            "2.5",
            "주 5회 시간 자유",
            "\"1대1, 주 5회로 전문적으로 가까이서 알려드립니다.\"","8월 24일", "23"
        ),
        LectureListData(
            R.drawable.dance_b4,
            R.drawable.dance_t4,
            "폴댄스 개인특강",
            "신아람",
            "3.7",
            "화, 수 오후 12시",
            "\"폴댄스 1:1 특강입니다. 모든 기구 구비되어 있습니다!\"","4월 12일","142"
        ),
        LectureListData(
            R.drawable.swim_b3,
            R.drawable.swim_t3,
            "수영 중급반",
            "김상우",
            "4.5",
            "월, 수, 금 오후 8시",
            "\"김상우 짐선생과 함께 물길을 헤쳐나가봅시다! 믿고 맡겨주세요 :)\"","6월 1일","183"
        ),
        LectureListData(
            R.drawable.taekwondo_b3,
            R.drawable.taekwondo_t3,
            "태권도 중급반",
            "한혜리",
            "4.3",
            "월, 수, 금 오후 7시",
            "\"어려운 태권도? 한혜리 짐선생과 함께라면 더 이상 어렵지 않습니다!\"","10월 2일","21"
        )
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_lecture, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
        setView()
        setOnClickListener()
        val snapHelper = LinearSnapHelper()
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

    private fun setOnClickListener() {
        btn_frag_lecture_write_comment.setOnClickListener {
            startActivity<LectureCommentActivity>()
        }
    }
}
