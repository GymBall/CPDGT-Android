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

class HomeDetailHealthFragment : Fragment() {
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
                R.drawable.health_b1,
                R.drawable.health_t1,
                "무산소 운동반",
                "유주아",
                "4.2",
                "월, 수, 금 오후 7시",
                "\"탄탄한 바디, 을매나 보기 좋게요~! 제가 만들어 드릴게요!\""
            )
        )
        dataList.add(
            HomeDetailData(
                R.drawable.health_b2,
                R.drawable.health_t2,
                "헬스 무산소반",
                "신하은",
                "3.2",
                "월, 수 오후 6시",
                "\"근육의 아름다움에 대하여. 운동도 잘하면 예쁜 근육이 됩니다!\""
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
                R.drawable.health_b3,
                R.drawable.health_t3,
                "헬스 스타트반",
                "강종민",
                "4.4",
                "화, 목, 토 오전 6시",
                "\"기초가 탄탄해야 더 건강하게, 다들 아시나요? 탄탄한 기초를 쌓도록 도와드릴게요!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.health_b4,
                R.drawable.health_t4,
                "핫바디반",
                "민지유",
                "4.9",
                "월, 수, 금 오후 8시",
                "\"늘어난 뱃살은 그만! 저와 함께 핫바디 만들어가요\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.health_b5,
                R.drawable.health_t5,
                "소프트 헬스반",
                "이규민",
                "4.7",
                "월, 금 오후 9시",
                "\"헬스가 힘들기만 하다는 생각, 제가 없애드리겠습니다! 헬스도 즐겁게 할 수 도록!\""
            )
        )

        dataList2.add(
            HomeDetailData(
                R.drawable.health_b1,
                R.drawable.health_t1,
                "무산소 운동반",
                "유주아",
                "4.2",
                "월, 수, 금 오후 7시",
                "\"탄탄한 바디, 을매나 보기 좋게요~! 제가 만들어 드릴게요!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.health_b2,
                R.drawable.health_t2,
                "헬스 무산소반",
                "신하은",
                "3.2",
                "월, 수 오후 6시",
                "\"근육의 아름다움에 대하여. 운동도 잘하면 예쁜 근육이 됩니다!\""
            )
        )

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
