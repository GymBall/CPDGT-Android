package org.gymball.cpdgt_android.ui.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home_detail.*
import kotlinx.android.synthetic.main.fragment_search_result.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.search.SearchResultData
import org.gymball.cpdgt_android.ui.search.SearchResultRecyclerViewAdapter

class HomeDetailFragment : Fragment() {
    lateinit var homeDetailRecyclerViewAdapter : HomeDetailRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_detail, container, false)

        setRecyclerView()
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setRecyclerView()
    }


    private fun setRecyclerView(){
        var dataList: ArrayList<HomeDetailData> = ArrayList()
        dataList.add(HomeDetailData(getResources().getDrawable(R.drawable.detail_tak_img)!!, "태권도 초급반", "이대훈", "3.5", "화,목 오후 8시", "눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!"))
        dataList.add(HomeDetailData(getResources().getDrawable(R.drawable.detail_tak_img2)!!, "태권도 기초반", "오혜리", "4.3", "월,수,금 오후 7시", "어려운 태권도? 오혜리 짐선생과 함께라면 더이상 어렵지 않습니다!"))

        homeDetailRecyclerViewAdapter = HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)

        rv_adv_class_list.addItemDecoration(DividerItemDecoration(context, 1))

        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(HomeDetailData(getResources().getDrawable(R.drawable.detail_tak_img)!!, "태권도 초급반", "이대훈", "3.5", "화,목 오후 8시", "눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!"))
        dataList2.add(HomeDetailData(getResources().getDrawable(R.drawable.detail_tak_img2)!!, "태권도 기초반", "오혜리", "4.3", "월,수,금 오후 7시", "어려운 태권도? 오혜리 짐선생과 함께라면 더이상 어렵지 않습니다!"))
        dataList2.add(HomeDetailData(getResources().getDrawable(R.drawable.detail_tak_img)!!, "태권도 초급반", "이대훈", "3.5", "화,목 오후 8시", "눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!"))
        dataList2.add(HomeDetailData(getResources().getDrawable(R.drawable.detail_tak_img2)!!, "태권도 기초반", "오혜리", "4.3", "월,수,금 오후 7시", "어려운 태권도? 오혜리 짐선생과 함께라면 더이상 어렵지 않습니다!"))
        dataList2.add(HomeDetailData(getResources().getDrawable(R.drawable.detail_tak_img)!!, "태권도 초급반", "이대훈", "3.5", "화,목 오후 8시", "눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!"))
        dataList2.add(HomeDetailData(getResources().getDrawable(R.drawable.detail_tak_img2)!!, "태권도 기초반", "오혜리", "4.3", "월,수,금 오후 7시", "어려운 태권도? 오혜리 짐선생과 함께라면 더이상 어렵지 않습니다!"))
        dataList2.add(HomeDetailData(getResources().getDrawable(R.drawable.detail_tak_img)!!, "태권도 초급반", "이대훈", "3.5", "화,목 오후 8시", "눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!"))
        dataList2.add(HomeDetailData(getResources().getDrawable(R.drawable.detail_tak_img2)!!, "태권도 기초반", "오혜리", "4.3", "월,수,금 오후 7시", "어려운 태권도? 오혜리 짐선생과 함께라면 더이상 어렵지 않습니다!"))

        homeDetailRecyclerViewAdapter = HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
        rv_class_list.addItemDecoration(DividerItemDecoration(context, 1))
    }


}
