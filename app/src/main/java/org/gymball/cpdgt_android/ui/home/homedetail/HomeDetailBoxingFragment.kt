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

class HomeDetailBoxingFragment : Fragment() {
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
                R.drawable.boxing_b1,
                R.drawable.boxing_t1,
                "복싱 기초 주부반",
                "민정아",
                "4.5",
                "토, 일 오전 8시",
                "\"주부 전용 반 개설했습니다. 어렵게 생각하지 마시고 편하게 문의주세요!\""
            )
        )
        dataList.add(
            HomeDetailData(
                R.drawable.boxing_b2,
                R.drawable.boxing_t2,
                "복싱 대회준비반",
                "구정태",
                "3.3",
                "금, 토 오후 8시",
                "\"대회 준비하는 반입니다, 1년 이상 해보신 분들만 연락주세요!\""
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
                R.drawable.boxing_b3,
                R.drawable.boxing_t3,
                "복싱 1대1",
                "김지아",
                "2.5",
                "주 5회 시간 자유",
                "\"1대1, 주 5회로 전문적으로 가까이서 알려드립니다.\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.boxing_b4,
                R.drawable.boxing_t4,
                "복싱 중급반",
                "이마음",
                "3.6",
                "월, 화 오후 2시",
                "\"체육관에서 전문적으로 알려드려요! (장비는 본인 장비로 하시면 됩니다!)\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.boxing_b5,
                R.drawable.boxing_t5,
                "복싱 전문반",
                "배자일",
                "4.7",
                "수, 금 오후 4시 반",
                "\"전문적으로 배우고 싶으신 분들 주목!! 저 배자일과 함께 복싱 정복해봅시다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.boxing_b1,
                R.drawable.boxing_t1,
                "복싱 기초 주부반",
                "민정아",
                "4.5",
                "토, 일 오전 8시",
                "\"주부 전용 반 개설했습니다. 어렵게 생각하지 마시고 편하게 문의주세요!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.boxing_b2,
                R.drawable.boxing_t2,
                "복싱 대회준비반",
                "구정태",
                "3.3",
                "금, 토 오후 8시",
                "\"대회 준비하는 반입니다, 1년 이상 해보신 분들만 연락주세요!\""
            )
        )

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
