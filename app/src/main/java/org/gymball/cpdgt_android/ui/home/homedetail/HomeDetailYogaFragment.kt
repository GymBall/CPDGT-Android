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

class HomeDetailYogaFragment : Fragment() {

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
                R.drawable.yoga_b1,
                R.drawable.yoga_t1,
                "플라잉 요가반",
                "김태리",
                "4.7",
                "월, 화 오후 8시",
                "\"김태리 짐선생의 즐거운 플라잉 요가! 해먹과 함께 근력을 키워봅시다!\""
            )
        )
        dataList.add(
            HomeDetailData(
                R.drawable.yoga_b2,
                R.drawable.yoga_t2,
                "다이어트 요가반",
                "김유아",
                "4.4",
                "화, 목 오후 2시",
                "\"다이어트 전용 요가 김유아 짐선생입니다! 한 달이면 효과 뿜뿜!\""
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
                R.drawable.yoga_b3,
                R.drawable.yoga_t3,
                "필라테스반",
                "한상호",
                "3.8",
                "월, 목 오전 9시",
                "\"처음 시작하는 사람도 누구나 쉽게! 필라테스 수업은 한상호 짐선생과 함께!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.yoga_b4,
                R.drawable.yoga_t4,
                "요가 자세교정반",
                "차승희",
                "4.9",
                "토, 일 오전 10시",
                "\"바로 옆에서 자세 교정 해드려요^^* 틀어진 골반, 책임지고 돌려드립니다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.yoga_b5,
                R.drawable.yoga_t5,
                "덤벨 요가반",
                "정아린",
                "3.7",
                "화, 목 오후 6시",
                "\"자세 교정, 근력 향상! 일석이조 덤벨 요가, 아린 짐선생과 함께해요~\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.yoga_b1,
                R.drawable.yoga_t1,
                "플라잉 요가반",
                "김태리",
                "4.7",
                "월, 화 오후 8시",
                "\"김태리 짐선생의 즐거운 플라잉 요가! 해먹과 함께 근력을 키워봅시다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.yoga_b2,
                R.drawable.yoga_t2,
                "다이어트 요가반",
                "김유아",
                "4.4",
                "화, 목 오후 2시",
                "\"다이어트 전용 요가 김유아 짐선생입니다! 한 달이면 효과 뿜뿜!\""
            )
        )

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
