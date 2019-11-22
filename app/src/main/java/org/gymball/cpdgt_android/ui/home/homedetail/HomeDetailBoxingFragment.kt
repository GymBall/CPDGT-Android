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

class HomeDetailBoxingFragment : Fragment() {
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
        dataList.add(HomeDetailData("http://www.funch.ne.kr/main/data/file/gym/2039362590_41YiOyPB_59dabf3f696acb0dbe9cdddfbd867df29a6d06c1.jpg","https://mblogthumb-phinf.pstatic.net/MjAxOTA1MjdfMTg1/MDAxNTU4OTQxODA2MzI3.gLn3Nz4FIQQDWmMIMwXvyJ_XO1OehVILUvY_HFP47vcg.HXd5LocIR-hZyik9Lhx2lhVQneowyyJ3aOBWYwG-7JEg.JPEG.marioluigi85/KakaoTalk_20170606_174456283.jpg?type=w800", "복싱 기초 주부반", "민정아", "4.5", "토, 일 오전 8시", "\"주부 전용 반 개설했습니다. 어렵게 생각하지 마시고 편하게 문의주세요!\""))
        dataList.add(HomeDetailData("https://scontent-lht6-1.cdninstagram.com/v/t51.2885-15/e35/65652049_482355385872221_2967853958846202031_n.jpg?_nc_ht=scontent-lht6-1.cdninstagram.com&_nc_cat=105&se=7&oh=f6dc36c9f344d49b934a5c5d6fd54bce&oe=5E012772&ig_cache_key=MjA4MDU1MzMxMDM1NTcwNDE4OQ%3D%3D.2","https://post-phinf.pstatic.net/MjAxOTAzMDhfNDQg/MDAxNTUyMDAzNzA2NzIy.jYN5oQnoPo89goVTwcDDioA_yt8LI7Eag4RAJgiOsQYg.auKcgMiFBL_VOAeNR8XtObEFJjsBaoCZQk8tfD-0z5Ag.JPEG/IMG_8598.JPG?type=w1200", "복싱 대회준비반", "구정태", "3.3", "금, 토 오후 8시", "\"대회 준비하는 반입니다, 1년 이상 해보신 분들만 연락주세요!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(HomeDetailData("http://www.funch.ne.kr/main/data/file/gym/2039362590_41YiOyPB_59dabf3f696acb0dbe9cdddfbd867df29a6d06c1.jpg","https://mblogthumb-phinf.pstatic.net/MjAxOTA1MjdfMTg1/MDAxNTU4OTQxODA2MzI3.gLn3Nz4FIQQDWmMIMwXvyJ_XO1OehVILUvY_HFP47vcg.HXd5LocIR-hZyik9Lhx2lhVQneowyyJ3aOBWYwG-7JEg.JPEG.marioluigi85/KakaoTalk_20170606_174456283.jpg?type=w800", "복싱 기초 주부반", "민정아", "4.5", "토, 일 오전 8시", "\"주부 전용 반 개설했습니다. 어렵게 생각하지 마시고 편하게 문의주세요!\""))
        dataList2.add(HomeDetailData("https://scontent-lht6-1.cdninstagram.com/v/t51.2885-15/e35/65652049_482355385872221_2967853958846202031_n.jpg?_nc_ht=scontent-lht6-1.cdninstagram.com&_nc_cat=105&se=7&oh=f6dc36c9f344d49b934a5c5d6fd54bce&oe=5E012772&ig_cache_key=MjA4MDU1MzMxMDM1NTcwNDE4OQ%3D%3D.2","https://post-phinf.pstatic.net/MjAxOTAzMDhfNDQg/MDAxNTUyMDAzNzA2NzIy.jYN5oQnoPo89goVTwcDDioA_yt8LI7Eag4RAJgiOsQYg.auKcgMiFBL_VOAeNR8XtObEFJjsBaoCZQk8tfD-0z5Ag.JPEG/IMG_8598.JPG?type=w1200", "복싱 대회준비반", "구정태", "3.3", "금, 토 오후 8시", "\"대회 준비하는 반입니다, 1년 이상 해보신 분들만 연락주세요!\""))
        dataList2.add(HomeDetailData("http://www.djtimes.co.kr/news/photo/201903/76578_53198_1731.jpg","http://img.hani.co.kr/imgdb/resize/2018/1122/00503715_20181122.JPG", "복싱 1대1", "김지아", "2.5", "주 5회 시간 자유", "\"1대1, 주 5회로 전문적으로 가까이서 알려드립니다.\""))
        dataList2.add(HomeDetailData("https://post-phinf.pstatic.net/MjAxODAyMjdfMTkx/MDAxNTE5NzIxNzk0NTg3.GPejmem9AyEiiEf_Ggx3lHitc2_e4U3IjNy3dS8oO1gg.CA-n9uVG1rs8H3QH4a4rgQ_1z5N0K-Ldt5ZiFaO61Acg.JPEG/image_3847560001519721511274.jpg?type=w1200","http://pds24.cafe.daum.net/download.php?grpid=ibyz&fldid=IL8P&dataid=620&fileid=1&disk=20&.jpg", "복싱 중급반", "이마음", "3.6", "월, 화 오후 2시", "\"체육관에서 전문적으로 알려드려요! (장비는 본인 장비로 하시면 됩니다!)\""))
        dataList2.add(HomeDetailData("https://instagram.frix8-1.fna.fbcdn.net/vp/036d2bcda64ab80f2ae3a9e48c945b78/5DDB127F/t51.2885-15/e35/66429489_501151350631777_8955867208626223280_n.jpg?_nc_ht=instagram.frix8-1.fna.fbcdn.net","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPwPI1GYfq3rPYCj9xGzGdo7Dc2QjMbnq4ftkmCQcT2bISkVVbmw&s", "복싱 전문반", "배자일", "4.7", "수, 금 오후 4시 반", "\"전문적으로 배우고 싶으신 분들 모두모두 주목!! 저 배자일과 함께 복싱 정복해봅시다!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
