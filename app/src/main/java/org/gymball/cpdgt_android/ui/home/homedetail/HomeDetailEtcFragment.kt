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

class HomeDetailEtcFragment : Fragment() {
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
                R.drawable.etc_b1,
                R.drawable.etc_t1,
                "한국무용 기초반",
                "김혜연",
                "4.3",
                "토, 일 오전 9시",
                "\"숙명여대 출신의 한국무용 짐선생! 김혜연 짐선생과 한국무용을 시작해보세요^^\""
            )
        )
        dataList.add(
            HomeDetailData(
                R.drawable.etc_b2,
                R.drawable.etc_t2,
                "주짓수 중급반",
                "배주현",
                "4.7",
                "월, 수 오후 7시",
                "\"배주현 짐선생이 주짓수 기초 체계부터 탄탄하게 잡아드립니다!\""
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
                R.drawable.etc_b3,
                R.drawable.etc_t3,
                "농구 입문반",
                "김치용",
                "2.3",
                "화, 목 오후 8시",
                "\"김치용 짐선생의 수업과 함께 농구 실력도 쑥쑥! 키도 쑥쑥!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.etc_b4,
                R.drawable.etc_t4,
                "테니스 초급반",
                "최고운",
                "4.5",
                "수, 금 오후 7시",
                "\"다른 수업과 차원이 다른 테니스 수업! 주저하지말고 신청하세요 :)\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.etc_b5,
                R.drawable.etc_t5,
                "스쿼시 초급반",
                "황용식",
                "3.8",
                "금, 토 오후 5시",
                "\"쉽게 접할 수 없는 스쿼시! 재미있게 배울 수 있는 절호의 기회!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.etc_b1,
                R.drawable.etc_t1,
                "한국무용 기초반",
                "김혜연",
                "4.3",
                "토, 일 오전 9시",
                "\"숙명여대 출신의 한국무용 짐선생! 김혜연 짐선생과 한국무용을 시작해보세요^^\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.etc_b2,
                R.drawable.etc_t2,
                "주짓수 중급반",
                "배주현",
                "4.7",
                "월, 수 오후 7시",
                "\"배주현 짐선생이 주짓수 기초 체계부터 탄탄하게 잡아드립니다!\""
            )
        )

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
