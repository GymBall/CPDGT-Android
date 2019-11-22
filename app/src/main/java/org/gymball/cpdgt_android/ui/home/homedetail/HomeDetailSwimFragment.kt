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
        dataList.add(HomeDetailData("http://www.bgnews.kr/news/photo/201907/11858_13273_3817.jpg","https://i.ytimg.com/vi/atVRqth1upg/maxresdefault.jpg", "수영 기초반", "김하랑", "4.4", "월, 수, 금 오전 5시", "\"Funny한 수영, Funny한 선생님! 이 한 줄이면 충분하지 않나요? 망설이지마세요\""))
        dataList.add(HomeDetailData("http://img.khan.co.kr/news/2012/07/22/l_2012072201007243200222691.jpg","http://dhcdn.design.co.kr/cms/img/2015/07/M.1437035165.6687.2.jpg", "수영 심화반", "박민철", "3.3", "화, 목, 토 오전 6시", "\"고등학교 선수출신의 고급 수영 꿀팁! 하나부터 열까지 모두 알려드립니다^^\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(HomeDetailData("http://www.bgnews.kr/news/photo/201907/11858_13273_3817.jpg","https://i.ytimg.com/vi/atVRqth1upg/maxresdefault.jpg", "수영 기초반", "김하랑", "4.4", "월, 수, 금 오전 5시", "\"Funny한 수영, Funny한 선생님! 이 한 줄이면 충분하지 않나요? 망설이지마세요\""))
        dataList2.add(HomeDetailData("http://img.khan.co.kr/news/2012/07/22/l_2012072201007243200222691.jpg","http://dhcdn.design.co.kr/cms/img/2015/07/M.1437035165.6687.2.jpg", "수영 심화반", "박민철", "3.3", "화, 목, 토 오전 6시", "\"고등학교 선수출신의 고급 수영 꿀팁! 하나부터 열까지 모두 알려드립니다^^\""))
        dataList2.add(HomeDetailData("http://www.dtnews24.com/news/photo/201908/555432_192971_5358.jpg","https://pbs.twimg.com/tweet_video_thumb/ECljS0xVAAEr0jr.jpg", "수영 중급반", "김상우", "4.5", "월, 수, 금 오후 8시", "\"김상우 짐선생과 함께 물길을 헤쳐나가봅시다! 믿고 맡겨주세요 :)\""))
        dataList2.add(HomeDetailData("https://post-phinf.pstatic.net/MjAxOTA2MjFfMjU2/MDAxNTYxMTA5Nzk0MDQ0._s6xMpg126KQOyjudNAWHwj-xT-pkGBsvjFPmw0w2yog.Kc9be5xigKavQE0CAzBUSABRkB-YStjzw8VlM85Pf9kg.JPEG/%EC%88%98%EC%98%812.jpg?type=w1200","http://nimage.newsway.kr/photo/2019/06/27/20190627000152_0700.jpg", "수영 초급반", "윤민아", "4.9", "월, 수, 금 오후 8시", "\"기본기가 탄탄해야 오래 배울 수 있습니다. 기본기를 만들어드릴게요.\""))
        dataList2.add(HomeDetailData("https://i.ytimg.com/vi/KrNUbmopXiI/maxresdefault.jpg","http://imgnews.naver.net/image/5207/2017/07/08/0000184701_001_20170708092149234.jpg", "수영 중급반", "이하은", "4.6", "화, 목, 토 오전 6시", "\"실력자는 말이 많지 않은거 아시죠. 주저하지 마세요. 전 선수 출신입니다.\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
