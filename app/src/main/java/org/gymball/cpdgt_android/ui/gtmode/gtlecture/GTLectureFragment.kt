package org.gymball.cpdgt_android.ui.gtmode.gtlecture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_gtlecture.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.GTLectureData
import org.jetbrains.anko.support.v4.startActivity

class GTLectureFragment : Fragment(){
    lateinit var GTLecRvAdapter: GTLecRvAdapter

    var datalist = ArrayList<GTLectureData>()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View?{
        return inflater.inflate(R.layout.fragment_gtlecture, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
        setView()
        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_frag_gtlecture_new_lecture.setOnClickListener {
            startActivity<GTLectureNewActivity>()
        }
    }

    private fun setView() {
        num_of_lec.text = datalist.size.toString()
    }

    private fun setRecyclerView() {
        datalist.add(
            GTLectureData(
                R.drawable.taekwondo_b1,
                R.drawable.taekwondo_t4,
                "태권도 중급반",
                "임은지",
                "4.5",
                "월, 수, 금 오후 7시",
                "\"어려운 태권도? 한혜리 짐선생과 함께라면 더 이상 어렵지 않습니다!\"","4","2"
            )
        )
        datalist.add(
            GTLectureData(
                R.drawable.taekwondo_b2,
                R.drawable.taekwondo_t4,
                "태권도 고급반",
                "임은지",
                "4.5",
                "화, 목 오후 4시",
                "\"화려한 수상 경력! 임은지 짐선생의 1:1 고급 태권도 코칭\"","1","2"
            )
        )
        datalist.add(
            GTLectureData(
                R.drawable.taekwondo_b3,
                R.drawable.taekwondo_t4,
                "태권도 대회준비반",
                "임은지",
                "4.5",
                "수, 금 오후 2시",
                "\"10년 경력의 짐선생이 세심한 코칭으로 태권도 대회까지 책임집니다^^\"","5","2"
            )
        )

        datalist.add(
            GTLectureData(
                R.drawable.taekwondo_b4,
                R.drawable.taekwondo_t4,
                "태권도 기초반",
                "임은지",
                "4.5",
                "수, 금 오후 7시",
                "\"즐겁고 건강하게 태권도를 배우고 싶은 사람! 모두 여기 모여라!\"","5","1"
            )
        )
        datalist.add(
            GTLectureData(
                R.drawable.taekwondo_b5,
                R.drawable.taekwondo_t4,
                "태권도 초급반",
                "임은지",
                "4.5",
                "화, 목 오후 8시",
                "\"눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!\"","7","1"
            )
        )
        GTLecRvAdapter = GTLecRvAdapter(activity!!, datalist, datalist.size)
        recycler_view.adapter = GTLecRvAdapter
        recycler_view.layoutManager = LinearLayoutManager(activity!!, LinearLayoutManager.VERTICAL, false)

    }

}