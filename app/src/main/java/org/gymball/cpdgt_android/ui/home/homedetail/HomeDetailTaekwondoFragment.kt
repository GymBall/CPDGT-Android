package org.gymball.cpdgt_android.ui.home.homedetail


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home_detail_whole.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.HomeDetailData
import org.gymball.cpdgt_android.ui.home.HomeDetailRecyclerViewAdapter

class HomeDetailTaekwondoFragment : Fragment() {
    lateinit var homeDetailRecyclerViewAdapter : HomeDetailRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home_detail_whole, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerViewTop()
        setRecyclerViewBottom()
    }

    private fun setRecyclerViewTop(){

        var dataList: ArrayList<HomeDetailData> = ArrayList()
        dataList.add(
            HomeDetailData(
                R.drawable.taekwondo_b1,
                R.drawable.taekwondo_t1,
                "태권도 기초반",
                "강수진",
                "4.1",
                "수, 금 오후 7시",
                "\"즐겁고 건강하게 태권도를 배우고 싶은 사람! 모두 여기 모여라!\""
            )
        )
        dataList.add(
            HomeDetailData(
                R.drawable.taekwondo_b2,
                R.drawable.taekwondo_t2,
                "태권도 초급반",
                "이태현",
                "3.5",
                "화, 목 오후 8시",
                "\"눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!\""
            )
        )

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()

        dataList2.add(
            HomeDetailData(
                R.drawable.taekwondo_b3,
                R.drawable.taekwondo_t3,
                "태권도 중급반",
                "한혜리",
                "4.3",
                "월, 수, 금 오후 7시",
                "\"어려운 태권도? 한혜리 짐선생과 함께라면 더 이상 어렵지 않습니다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.taekwondo_b4,
                R.drawable.taekwondo_t4,
                "태권도 고급반",
                "임은지",
                "4.5",
                "화, 목 오후 4시",
                "\"화려한 수상 경력! 임은지 짐선생의 1:1 고급 태권도 코칭\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.taekwondo_b5,
                R.drawable.taekwondo_t5,
                "태권도 대회준비반",
                "오성훈",
                "3.9",
                "수, 금 오후 2시",
                "\"10년 경력의 짐선생이 세심한 코칭으로 태권도 대회까지 책임집니다^^\""
            )
        )

        dataList2.add(
            HomeDetailData(
                R.drawable.taekwondo_b1,
                R.drawable.taekwondo_t1,
                "태권도 기초반",
                "강수진",
                "4.1",
                "수, 금 오후 7시",
                "\"즐겁고 건강하게 태권도를 배우고 싶은 사람! 모두 여기 모여라!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.taekwondo_b2,
                R.drawable.taekwondo_t2,
                "태권도 초급반",
                "이태현",
                "3.5",
                "화, 목 오후 8시",
                "\"눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!\""
            )
        )

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
