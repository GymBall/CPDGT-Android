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

class HomeDetailDanceFragment : Fragment() {
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
                R.drawable.dance_b1,
                R.drawable.dance_t1,
                "방탄커버댄스반",
                "김기범",
                "4.6",
                "목, 금 오후 8시",
                "\"방탄소년단의 춤도 저와 함께라면 어렵지 않아요*^o^*\""
            )
        )
        dataList.add(
            HomeDetailData(
                R.drawable.dance_b2,
                R.drawable.dance_t2,
                "줌바댄스 기초반",
                "이수정",
                "3.3",
                "월, 수, 금 오전 11시",
                "\"100일만에 10kg 감량 가능하다구요! 바로 저와 함께라면!!\""
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
                R.drawable.dance_b3,
                R.drawable.dance_t3,
                "방송댄스 여자부",
                "최민아",
                "3.9",
                "수 오후 10시",
                "\"최신 유행 댄스를 한달에 한곡씩 마스터할 수 있습니다. 어렵다고 생각하지 마세요!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.dance_b4,
                R.drawable.dance_t4,
                "폴댄스 개인특강",
                "신아람",
                "3.7",
                "화, 수 오후 12시",
                "\"폴댄스 1:1 특강입니다. 모든 기구 구비되어 있습니다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.dance_b5,
                R.drawable.dance_t5,
                "팝핀댄스 중급반",
                "박정륭",
                "3.4",
                "월, 화 오후 7시 반",
                "\"연체동물처럼 꺾는 팝핀댄스! 유연하지 않아도 할 수 있어요 @_@\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.dance_b1,
                R.drawable.dance_t1,
                "방탄커버댄스반",
                "김기범",
                "4.6",
                "목, 금 오후 8시",
                "\"방탄소년단의 춤도 저와 함께라면 어렵지 않아요*^o^*\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.dance_b2,
                R.drawable.dance_t2,
                "줌바댄스 기초반",
                "이수정",
                "3.3",
                "월, 수, 금 오전 11시",
                "\"100일만에 10kg 감량 가능하다구요! 바로 저와 함께라면!!\""
            )
        )

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
