package org.gymball.cpdgt_android.ui.home.homedetail


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home_detail_whole.*

import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.home.HomeDetailData
import org.gymball.cpdgt_android.ui.home.HomeDetailRecyclerViewAdapter

class HomeDetailYogaFragment : Fragment() {

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
        dataList.add(HomeDetailData("https://dailysecu.com/news/photo/201910/75345_72550_2232.jpg","http://www.xportsnews.com/contents/images/upload/article/2016/0909/1473412223218.jpg", "플라잉 요가반", "김태리", "4.7", "월, 화 오후 8시", "\"김태리 짐선생의 즐거운 플라잉 요가! 해먹과 함께 근력을 키워봅시다!\""))
        dataList.add(HomeDetailData("https://scontent-lhr3-1.cdninstagram.com/vp/37f74b4bad6e974820f0daf5b1bddfe2/5E2BE91B/t51.2885-15/e35/s1080x1080/69620913_386570805578602_6404033088369302608_n.jpg?_nc_ht=scontent-lhr3-1.cdninstagram.com&_nc_cat=110","https://post-phinf.pstatic.net/MjAxOTAxMTVfMTgw/MDAxNTQ3NTM0MzAyOTU5.3xr8lB0eNyy2VdnclI5y6UoMjjL_lYf0skIe-hV5qhUg.xGWNC6QPec1goIjTgPMXhu8BvEeMGqn60ecRjlsnhzkg.JPEG/D6F3DD3B-3156-4C82-AA27-95C643F99780.jpeg?type=w1200", "다이어트 요가반", "김유아", "4.4", "화, 목 오후 2시", "\"다이어트 전용 요가 김유아 짐선생입니다! 한 달이면 효과 뿜뿜!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(HomeDetailData("https://dailysecu.com/news/photo/201910/75345_72550_2232.jpg","http://www.xportsnews.com/contents/images/upload/article/2016/0909/1473412223218.jpg", "플라잉 요가반", "김태리", "4.7", "월, 화 오후 8시", "\"김태리 짐선생의 즐거운 플라잉 요가! 해먹과 함께 근력을 키워봅시다!\""))
        dataList2.add(HomeDetailData("https://scontent-lhr3-1.cdninstagram.com/vp/37f74b4bad6e974820f0daf5b1bddfe2/5E2BE91B/t51.2885-15/e35/s1080x1080/69620913_386570805578602_6404033088369302608_n.jpg?_nc_ht=scontent-lhr3-1.cdninstagram.com&_nc_cat=110","https://post-phinf.pstatic.net/MjAxOTAxMTVfMTgw/MDAxNTQ3NTM0MzAyOTU5.3xr8lB0eNyy2VdnclI5y6UoMjjL_lYf0skIe-hV5qhUg.xGWNC6QPec1goIjTgPMXhu8BvEeMGqn60ecRjlsnhzkg.JPEG/D6F3DD3B-3156-4C82-AA27-95C643F99780.jpeg?type=w1200", "다이어트 요가반", "김유아", "4.4", "화, 목 오후 2시", "\"다이어트 전용 요가 김유아 짐선생입니다! 한 달이면 효과 뿜뿜!\""))
        dataList2.add(HomeDetailData("https://scontent-cdt1-1.cdninstagram.com/vp/1435abcb6bb1e4aefeb13dcb7ace43fa/5E28382B/t51.2885-15/e35/49933498_2028304794133659_517210995919470802_n.jpg?_nc_ht=scontent-cdt1-1.cdninstagram.com&_nc_cat=103&ig_cache_key=MTk1MzQ5NDIwMTExMTM3NjYyNg%3D%3D.2","http://www.kyeongin.com/mnt/file/201810/20181031000812439_1.jpg", "필라테스반", "한상호", "3.8", "월, 목 오전 9시", "\"기초 탄탄, 처음 시작하는 사람도 누구나 쉽게! 필라테스 수업은 한상호 짐선생고 함께!\""))
        dataList2.add(HomeDetailData("https://t1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/1h02/image/a8UAEUbhcIJiKdJTqKOSMhJz2qo.jpg","https://scontent-yyz1-1.cdninstagram.com/vp/f7f6a404404122e60da5de29b7e76fa3/5DE47FF9/t51.2885-15/e35/44513599_716836658702920_340072690380682739_n.jpg?_nc_ht=scontent-yyz1-1.cdninstagram.com&se=8", "요가 자세교정반", "차승희", "4.9", "토, 일 오전 10시", "\"일대일로! 바로 옆에서 자세 교정 해드려요^^* 틀어진 골반, 승희 짐선생이 책임지고 돌려드립니다!\""))
        dataList2.add(HomeDetailData("http://mblogthumb2.phinf.naver.net/MjAxNzExMjFfMjY2/MDAxNTExMjI3NTIxMzI2.mZ34rPLLcQ0i4pFaArWEHtWf5g25bBHxnXdFy6o7gegg.b7HysXI68bwXEUuX2aWRnbdUTsdlUNNwgbym63i3S0gg.JPEG.jinee4417/1109%EB%8D%A4%EB%B2%A8%EC%9A%94%EA%B0%80_%283%29.jpg?type=w2","https://t1.daumcdn.net/thumb/R1024x0/?fname=http://cfile289.uf.daum.net/image/993D5A495CC1578A1DB088", "덤벨 요가반", "정아린", "3.7", "화, 목 오후 6시", "\"자세 교정, 근력 향상! 일석이조 덤벨 요가, 아린 짐선생과 함께해요~\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
