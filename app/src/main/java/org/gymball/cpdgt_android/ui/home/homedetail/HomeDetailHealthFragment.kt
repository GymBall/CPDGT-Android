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
        dataList.add(HomeDetailData("https://img.huffingtonpost.com/asset/5d71e5df2500004d120658d3.jpeg?ops=scalefit_630_noupscale","https://scontent-iad3-1.cdninstagram.com/vp/3e16f739b69940a4bf034f770c15e9d7/5E5604D0/t51.2885-15/e35/c4.0.568.568a/65770696_706962619743607_1124398013105255515_n.jpg?_nc_ht=scontent-iad3-1.cdninstagram.com&_nc_cat=107", "무산소 운동반", "유주아", "4.2", "월, 수, 금 오후 7시", "\"탄탄한 바디, 을매나 보기 좋게요~! 제가 만들어 드릴게요!\""))
        dataList.add(HomeDetailData("https://t1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/6qYm/image/sXRg9shAb164ONcdOrWlaQ-C2dU.jpg","https://scontent-frx5-1.cdninstagram.com/vp/7cc8fb063e63fc25b022c6d8cb230f5b/5E40FE1D/t51.2885-15/e35/p1080x1080/69160640_2028224100612386_5358694645389527321_n.jpg?_nc_ht=scontent-frx5-1.cdninstagram.com&_nc_cat=102&ig_cache_key=MjEyODQ5ODUxNzQzMjU3MTA4MQ%3D%3D.2", "헬스 무산소반", "신하은", "3.2", "월, 수 오후 6시", "\"근육의 아름다움에 대하여. 운동도 잘하면 보기싫은 근육이 아닌 예쁜 근육이 됩니다! 저와 함께 해요!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(HomeDetailData("https://img.huffingtonpost.com/asset/5d71e5df2500004d120658d3.jpeg?ops=scalefit_630_noupscale","https://scontent-iad3-1.cdninstagram.com/vp/3e16f739b69940a4bf034f770c15e9d7/5E5604D0/t51.2885-15/e35/c4.0.568.568a/65770696_706962619743607_1124398013105255515_n.jpg?_nc_ht=scontent-iad3-1.cdninstagram.com&_nc_cat=107", "무산소 운동반", "유주아", "4.2", "월, 수, 금 오후 7시", "\"탄탄한 바디, 을매나 보기 좋게요~! 제가 만들어 드릴게요!\""))
        dataList2.add(HomeDetailData("https://t1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/6qYm/image/sXRg9shAb164ONcdOrWlaQ-C2dU.jpg","https://scontent-frx5-1.cdninstagram.com/vp/7cc8fb063e63fc25b022c6d8cb230f5b/5E40FE1D/t51.2885-15/e35/p1080x1080/69160640_2028224100612386_5358694645389527321_n.jpg?_nc_ht=scontent-frx5-1.cdninstagram.com&_nc_cat=102&ig_cache_key=MjEyODQ5ODUxNzQzMjU3MTA4MQ%3D%3D.2", "헬스 무산소반", "신하은", "3.2", "월, 수 오후 6시", "\"근육의 아름다움에 대하여. 운동도 잘하면 보기싫은 근육이 아닌 예쁜 근육이 됩니다! 저와 함께 해요!\""))
        dataList2.add(HomeDetailData("http://health.chosun.com/site/data/img_dir/2014/11/20/2014112001053_0.jpg","http://ptness.com/jinsung_board/upload_data/image_data/data_1394090830.jpg", "헬스 스타트반", "강종민", "4.4", "화, 목, 토 오전 6시", "\"기초가 탄탄해야 더 건강하게 운동할 수 있다는 사실, 다들 알고 계신가요? 탄탄한 기초를 쌓을 수 있도록 도와드릴게요!\""))
        dataList2.add(HomeDetailData("http://www.econovill.com/news/photo/201901/354418_238664_4221.png","http://upload.luckyworld.net/lifeboard/2014/08/22/0822_6031.jpg", "핫바디반", "민지유", "4.9", "월, 수, 금 오후 8시", "\"늘어난 뱃살은 그만! 저와 함께 핫바디 만들어가요\""))
        dataList2.add(HomeDetailData("http://www.nbnnews.co.kr/news/photo/201710/114470_176609_1218.jpg","https://yt3.ggpht.com/a/AGF-l7_mfR3RUS1ZJiCM0kdgj_yxsN4NRpk290RILQ=s800-c-k-c0xffffffff-no-rj-mo", "소프트 헬스반", "이규민", "4.7", "월, 금 오후 9시", "\"헬스가 힘들기만 하다는 생각, 제가 없애드리겠습니다! 헬스도 즐겁게 할 수 도록!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
