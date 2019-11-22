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
        dataList.add(HomeDetailData("http://talkimg.imbc.com/TVianUpload/tvian/TViews/image/2016/09/14/yNyNb6ek3o0l636094411007331290.jpg","https://pbs.twimg.com/media/DzKr16yVsAEa7N_.jpg", "방탄커버댄스반", "김기범", "4.6", "목, 금 오후 8시", "\"방탄소년단의 춤도 저와 함께라면 어렵지 않아요*^o^*\""))
        dataList.add(HomeDetailData("https://pds.joins.com/news/component/htmlphoto_mmdata/201811/25/75d754f3-9b37-4659-88a1-1a8269d14c35.jpg","http://cfile239.uf.daum.net/image/9956D7395DA10F711493CB", "줌바댄스 기초반", "이수정", "3.3", "월, 수, 금 오전 11시", "\"100일만에 10kg 감량 가능하다구요! 바로 저와 함께라면!!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(HomeDetailData("http://talkimg.imbc.com/TVianUpload/tvian/TViews/image/2016/09/14/yNyNb6ek3o0l636094411007331290.jpg","https://pbs.twimg.com/media/DzKr16yVsAEa7N_.jpg", "방탄커버댄스반", "김기범", "4.6", "목, 금 오후 8시", "\"방탄소년단의 춤도 저와 함께라면 어렵지 않아요*^o^*\""))
        dataList2.add(HomeDetailData("https://pds.joins.com/news/component/htmlphoto_mmdata/201811/25/75d754f3-9b37-4659-88a1-1a8269d14c35.jpg","http://cfile239.uf.daum.net/image/9956D7395DA10F711493CB", "줌바댄스 기초반", "이수정", "3.3", "월, 수, 금 오전 11시", "\"100일만에 10kg 감량 가능하다구요! 바로 저와 함께라면!!\""))
        dataList2.add(HomeDetailData("https://post-phinf.pstatic.net/MjAxODA2MTVfNyAg/MDAxNTI5MDM1NjU2MTcy.AVob4SBoZ-xjRGRPyQcivU7NRqauuO4BX4fUlGktRXIg.OguNIGwaTpSvrWclGX1bg6QBuWSNHWKqM1M-YGiBwaEg.JPEG/포3.jpg?type=w1200","https://modo-phinf.pstatic.net/20180820_265/1534736764876NpBA1_JPEG/mosaiDOzLl.jpeg?type=a1100", "방송댄스 여자부", "최민아", "3.9", "수 오후 10시", "\"최신 유행 댄스를 한달에 한곡씩 마스터할 수 있습니다. 어렵다고 생각하지 마세요!\""))
        dataList2.add(HomeDetailData("htm_2011122804626a010a011.jpg","http://tbc.imgdl.xcache.kinxcdn.com/cdn001/20191001/-2147483648_1004beauty5.jpg", "폴댄스 개인특강", "신아람", "3.7", "화, 수 오후 12시", "\"폴댄스 1:1 특강입니다. 모든 기구 구비되어 있습니다!\""))
        dataList2.add(HomeDetailData("https://i.ytimg.com/vi/JY23c8MmJtU/maxresdefault.jpg","https://shop.r10s.jp/auc-elehelm-hatstore/cabinet/item/59/l3981-011_m1.jpg", "팝핀댄스 중급반", "박정륭", "3.4", "월, 화 오후 7시 반", "\"연체동물처럼 꺾는 팝핀댄스! 유연하지 않아도 할 수 있어요 @_@\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
