package org.gymball.cpdgt_android.ui.home.homedetail


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home_detail_whole.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.home.HomeDetailData
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
        dataList.add(HomeDetailData("http://www.ornan.kr/ballet/images/ornan_18.jpg","http://www.sportsq.co.kr/news/photo/201406/11219_21760_2733.jpg", "발레 기초반", "박재우", "4.2", "토, 일 오후 2시", "\"발레를 처음 시작하는 어린이부터 어른까지! 박재우 짐선생이 베이스부터 차근차근 알려드립니다!\""))
        dataList.add(HomeDetailData("http://www.insideballet.co.kr/bbs/data/gallery2/1465277_611918078845985_1911403616_n.jpg","http://www.topstarnews.net/news/photo/201910/685298_394454_536.jpeg", "발레 초급반", "차예림", "3.9", "월, 수, 금 오후 6시", "\"발레 강사 경력 15년 차예림 짐선생과 함께라면 매일 기대되는 발레 수업 보장합니다!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(HomeDetailData("http://www.ornan.kr/ballet/images/ornan_18.jpg","http://www.sportsq.co.kr/news/photo/201406/11219_21760_2733.jpg", "발레 기초반", "박재우", "4.2", "토, 일 오후 2시", "\"발레를 처음 시작하는 어린이부터 어른까지! 박재우 짐선생이 베이스부터 차근차근 알려드립니다!\""))
        dataList2.add(HomeDetailData("http://www.insideballet.co.kr/bbs/data/gallery2/1465277_611918078845985_1911403616_n.jpg","http://www.topstarnews.net/news/photo/201910/685298_394454_536.jpeg", "발레 초급반", "차예림", "3.9", "월, 수, 금 오후 6시", "\"발레 강사 경력 15년 차예림 짐선생과 함께라면 매일 기대되는 발레 수업 보장합니다!\""))
        dataList2.add(HomeDetailData("http://news20.busan.com/content/image/2017/04/02/20170402000088_0.jpg","http://img.asiatoday.co.kr/file/2017y/02m/15d/2017021501001828500101171.jpg", "발레 남성전용반", "권상훈", "4.0", "화, 목 오후 8시", "\"발레를 배우고 싶지만 도전하기 어려웠던 남성분들, 지금 시작하세요! 남성전용 발레 코칭 :)\""))
        dataList2.add(HomeDetailData("https://post-phinf.pstatic.net/MjAxNzA2MThfMjc3/MDAxNDk3NzY1OTY1NzYz.1vZqPr2pYZ5SX54rZ2LW_A2nm3XBzk4Jo_guba5brzkg.WpROo5LmQCfZ6vSP7V-pJRh_iJCeD4CIM2mwyEuKAygg.PNG/image.png?type=w1200","http://art.chosun.com/site/data/img_dir/2017/02/16/2017021600834_0.jpg", "발레 중급반", "이준수", "3.7", "수, 금 오후 4시", "\"발레를 배워 본 경험이 있는 짐학생들 여기여기 모여라~ 준수 짐선생과 발레 마스터까지 고고!\""))
        dataList2.add(HomeDetailData("https://i.ytimg.com/vi/-iCMcpdzvS0/maxresdefault.jpg","http://mblogthumb4.phinf.naver.net/MjAxNzA2MTZfMjE5/MDAxNDk3NTQxOTE3NTM3.K-sUFNTeJCbIS4_AztSI05dTAtSncENfBRLfOmCKvgkg.AEpRM8tCDpRfsxjmNFqtkykMcykz_4iEMb7_l_z7fzMg.JPEG.ph_factory/KEN_%EC%8B%AC%EB%AF%BC%EC%A7%80-170531-%EC%B4%AC%EC%98%81%EC%9B%90%EB%B3%B8-5.jpg?type=w800", "발레 개인수업반", "강슬기", "4.3", "토, 일 오전 10시", "\"하나하나 섬세한 코치로 자세교정? 1대1 코칭 전문 강슬기 짐선생만 믿고 따라오세요~\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
