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

class HomeDetailTaekwondoFragment : Fragment() {
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
        dataList.add(HomeDetailData("http://ssd2696.maroo2003.gethompy.com/PEG/14556680016431.jpg","https://scontent-lht6-1.cdninstagram.com/v/t51.2885-15/e35/66489940_2361017267316600_3901728565817242360_n.jpg?_nc_ht=scontent-lht6-1.cdninstagram.com&se=8&oh=2d03b77926b6c324da439b968b476822&oe=5DFFA447&ig_cache_key=MjEwNjMzNTg0NDUzMjQyODU5MA%3D%3D.2", "태권도 기초반", "강수진", "4.1", "수, 금 오후 7시", "\"즐겁고 건강하게 태권도를 배우고 싶은 사람! 모두 여기 모여라!\""))
        dataList.add(HomeDetailData("http://www.tkdnews.com/news/photo/200911/5034_5018_2556.jpg","http://menshealthkorea.com/wp-content/uploads/2018/08/MH-people-fitguy-hoyoungjin1.jpg", "태권도 초급반", "이태현", "3.5", "화, 목 오후 8시", "\"눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(HomeDetailData("http://ssd2696.maroo2003.gethompy.com/PEG/14556680016431.jpg","https://scontent-lht6-1.cdninstagram.com/v/t51.2885-15/e35/66489940_2361017267316600_3901728565817242360_n.jpg?_nc_ht=scontent-lht6-1.cdninstagram.com&se=8&oh=2d03b77926b6c324da439b968b476822&oe=5DFFA447&ig_cache_key=MjEwNjMzNTg0NDUzMjQyODU5MA%3D%3D.2", "태권도 기초반", "강수진", "4.1", "수, 금 오후 7시", "\"즐겁고 건강하게 태권도를 배우고 싶은 사람! 모두 여기 모여라!\""))
        dataList2.add(HomeDetailData("http://www.tkdnews.com/news/photo/200911/5034_5018_2556.jpg","http://menshealthkorea.com/wp-content/uploads/2018/08/MH-people-fitguy-hoyoungjin1.jpg", "태권도 초급반", "이태현", "3.5", "화, 목 오후 8시", "\"눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!\""))
        dataList2.add(HomeDetailData("http://cfile211.uf.daum.net/R400x0/2307D33E561392A4177184","https://www.bctaekwondo.com/page/image/instructor_303.jpg", "태권도 중급반", "한혜리", "4.3", "월, 수, 금 오후 7시", "\"어려운 태권도? 한혜리 짐선생과 함께라면 더 이상 어렵지 않습니다!\""))
        dataList2.add(HomeDetailData("https://www.bctaekwondo.com/page/image/instructor_305.jpg","https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile3.uf.tistory.com%2Fimage%2F231A1A3F557E77A71DC033", "태권도 고급반", "임은지", "4.5", "화, 목 오후 4시", "\"화려한 수상 경력! 임은지 짐선생의 1:1 고급 태권도 코칭\""))
        dataList2.add(HomeDetailData("https://t1.daumcdn.net/cfile/tistory/223A084A54F97D9729","https://mblogthumb-phinf.pstatic.net/MjAxNzAxMDNfMTg1/MDAxNDgzNDIwNDkxNTI3.VqJmQfVqvZHIxhVYS35m144SyeZAPjzv4QJC4vKCmwgg.arPJbRhw9Drw0gvb2RsdMMUSceMrrxwPDCGtzMgZqZcg.JPEG.icare_korea/%EA%B4%80%EC%9E%A5%EB%8B%98.JPG?type=w800", "태권도 대회준비반", "오성훈", "3.9", "수, 금 오후 2시", "\"10년 경력의 짐선생이 세심한 코칭으로 태권도 대회까지 책임집니다^^\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
