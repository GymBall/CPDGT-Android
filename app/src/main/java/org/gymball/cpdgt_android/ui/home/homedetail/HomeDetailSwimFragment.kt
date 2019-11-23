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

class HomeDetailSwimFragment : Fragment() {
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
                R.drawable.swim_b1,
                R.drawable.swim_t1,
                "수영 기초반",
                "김하랑",
                "4.4",
                "월, 수, 금 오전 5시",
                "\"Funny한 수영, Funny한 선생님! 이 한 줄이면 충분하지 않나요? 망설이지마세요\""
            )
        )
        dataList.add(
            HomeDetailData(
                R.drawable.swim_b2,
                R.drawable.swim_t2,
                "수영 심화반",
                "박민철",
                "3.3",
                "화, 목, 토 오전 6시",
                "\"고등학교 선수출신의 고급 수영 꿀팁! 하나부터 열까지 모두 알려드립니다^^\""
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
                R.drawable.swim_b3,
                R.drawable.swim_t3,
                "수영 중급반",
                "김상우",
                "4.5",
                "월, 수, 금 오후 8시",
                "\"김상우 짐선생과 함께 물길을 헤쳐나가봅시다! 믿고 맡겨주세요 :)\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.swim_b4,
                R.drawable.swim_t4,
                "수영 초급반",
                "윤민아",
                "4.9",
                "월, 수, 금 오후 8시",
                "\"기본기가 탄탄해야 오래 배울 수 있습니다. 기본기를 만들어드릴게요.\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.swim_b5,
                R.drawable.swim_t5,
                "수영 중급반",
                "이하은",
                "4.6",
                "화, 목, 토 오전 6시",
                "\"실력자는 말이 많지 않은거 아시죠. 주저하지 마세요. 전 선수 출신입니다.\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.swim_b1,
                R.drawable.swim_t1,
                "수영 기초반",
                "김하랑",
                "4.4",
                "월, 수, 금 오전 5시",
                "\"Funny한 수영, Funny한 선생님! 이 한 줄이면 충분하지 않나요? 망설이지 마세요\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.swim_b2,
                R.drawable.swim_t2,
                "수영 심화반",
                "박민철",
                "3.3",
                "화, 목, 토 오전 6시",
                "\"고등학교 선수출신의 고급 수영 꿀팁! 하나부터 열까지 모두 알려드립니다^^\""
            )
        )

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
