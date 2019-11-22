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

class HomeDetailBalletFragment : Fragment() {

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
                R.drawable.ballet_b1,
                R.drawable.ballet_t1,
                "발레 기초반",
                "박재우",
                "4.2",
                "토, 일 오후 2시",
                "\"발레를 처음 시작하는 어린이부터 어른까지! 베이스부터 차근차근 알려드립니다!\""
            )
        )
        dataList.add(
            HomeDetailData(
                R.drawable.ballet_b2,
                R.drawable.ballet_t2,
                "발레 초급반",
                "차예림",
                "3.9",
                "월, 수, 금 오후 6시",
                "\"발레 강사 경력 15년 차예림 짐선생과 함께라면 매일 기대되는 발레 수업!\""
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
                R.drawable.ballet_b3,
                R.drawable.ballet_t3,
                "발레 남성전용반",
                "권상훈",
                "4.0",
                "화, 목 오후 8시",
                "\"발레에 도전하기 어려웠던 남성분들, 지금 시작하세요! 남성전용 발레 코칭 :)\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.ballet_b4,
                R.drawable.ballet_t4,
                "발레 중급반",
                "이준수",
                "3.7",
                "수, 금 오후 4시",
                "\"경험이 있는 짐학생들 여기여기 모여라~ 준수 짐선생과 발레 마스터까지 고고!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.ballet_b5,
                R.drawable.ballet_t5,
                "발레 개인수업반",
                "강슬기",
                "4.3",
                "토, 일 오전 10시",
                "\"섬세한 코치로 자세교정? 1대1 코칭 전문 강슬기만 믿고 따라오세요~\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.ballet_b1,
                R.drawable.ballet_t1,
                "발레 기초반",
                "박재우",
                "4.2",
                "토, 일 오후 2시",
                "\"발레를 처음 시작하는 어린이부터 어른까지!베이스부터 차근차근 알려드립니다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.ballet_b2,
                R.drawable.ballet_t2,
                "발레 초급반",
                "차예림",
                "3.9",
                "월, 수, 금 오후 6시",
                "\"발레 강사 경력 15년 차예림 짐선생과 함께라면 매일 기대되는 발레 수업\""
            )
        )
        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
