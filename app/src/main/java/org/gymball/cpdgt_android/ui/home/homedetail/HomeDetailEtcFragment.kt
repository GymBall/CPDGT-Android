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

class HomeDetailEtcFragment : Fragment() {
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
        dataList.add(HomeDetailData("http://mimaji.com/app/dubu_board/docs/imgs/f/lg_f15178766516559_img11.jpg","https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile2.uf.tistory.com%2Fimage%2F991B1B4E5C4C70E8014EB9", "한국무용 기초반", "김혜연", "4.3", "토, 일 오전 9시", "\"숙명여대 출신의 한국무용 짐선생! 김혜연 짐선생과 한국무용을 시작해보세요^^\""))
        dataList.add(HomeDetailData("https://scontent-lga3-1.cdninstagram.com/vp/5a8e8f2ab2f9a1ce9826491791f20968/5DE204DD/t51.2885-15/e35/66426025_2358866244371600_263797346540604813_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com","https://3.bp.blogspot.com/-5vzpa9kcIIQ/XJDcGJHpP1I/AAAAAAAAJ2k/cn-0KKJikLIMZVXxy4WC1PMinJqyn8gZwCLcBGAs/s1600/D0o-Q_SU0AAAmHf%25EC%258A%25A4%25ED%2583%2580%25ED%258A%25B8.jpg", "주짓수 중급반", "배주현", "4.7", "월, 수 오후 7시", "\"배주현 짐선생이 주짓수 기초 체계부터 탄탄하게 잡아드립니다!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(HomeDetailData("http://mimaji.com/app/dubu_board/docs/imgs/f/lg_f15178766516559_img11.jpg","https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile2.uf.tistory.com%2Fimage%2F991B1B4E5C4C70E8014EB9", "한국무용 기초반", "김혜연", "4.3", "토, 일 오전 9시", "\"숙명여대 출신의 한국무용 짐선생! 김혜연 짐선생과 한국무용을 시작해보세요^^\""))
        dataList2.add(HomeDetailData("https://scontent-lga3-1.cdninstagram.com/vp/5a8e8f2ab2f9a1ce9826491791f20968/5DE204DD/t51.2885-15/e35/66426025_2358866244371600_263797346540604813_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com","https://3.bp.blogspot.com/-5vzpa9kcIIQ/XJDcGJHpP1I/AAAAAAAAJ2k/cn-0KKJikLIMZVXxy4WC1PMinJqyn8gZwCLcBGAs/s1600/D0o-Q_SU0AAAmHf%25EC%258A%25A4%25ED%2583%2580%25ED%258A%25B8.jpg", "주짓수 중급반", "배주현", "4.7", "월, 수 오후 7시", "\"배주현 짐선생이 주짓수 기초 체계부터 탄탄하게 잡아드립니다!\""))
        dataList2.add(HomeDetailData("https://social.lge.co.kr/wp-content/uploads/2013/09/LG-Sakers_%EB%86%8D%EA%B5%AC%EA%B5%90%EC%8B%A45.jpg","http://img.hani.co.kr/imgdb/resize/2019/0606/00500049_20190606.JPG", "농구 입문반", "김치용", "2.3", "화, 목 오후 8시", "\"김치용 짐선생의 수업과 함께 농구 실력도 쑥쑥! 키도 쑥쑥!\""))
        dataList2.add(HomeDetailData("https://social.lge.co.kr/wp-content/uploads/2013/09/LG-Sakers_%EB%86%8D%EA%B5%AC%EA%B5%90%EC%8B%A45.jpg","https://post-phinf.pstatic.net/MjAxODA2MTVfMjcz/MDAxNTI5MDM3NDUwNDgy.RrZHhmaCCKnryoKh5QE0pD74sgNBXSSI3NvTbqzyVRQg.BIB7FBu8m4chgCqenuA1btHsJq19x_UgAOo8wL36naQg.JPEG/%EC%9A%B4%EB%8F%993.jpg?type=w1200", "테니스 초급반", "최고운", "4.5", "수, 금 오후 7시", "\"다른 수업과 차원이 다른 테니스 수업! 주저하지말고 신청하세요 :)\""))
        dataList2.add(HomeDetailData("http://saemaulfit.cafe24.com/web/saemaul/squash/11.JPG","https://scontent-lht6-1.cdninstagram.com/v/t51.2885-15/e35/61843914_460458424757416_9027288343031843825_n.jpg?_nc_ht=scontent-lht6-1.cdninstagram.com&se=7&oh=bdb2d05e4c5ad3fc616ea7dbc741232c&oe=5DF12877&ig_cache_key=MjA3MDQyNjEyNjM1NTcwODI3Nw%3D%3D.2", "스쿼시 초급반", "황용식", "3.8", "금, 토 오후 5시", "\"쉽게 접할 수 없는 스쿼시! 재미있게 배울 수 있는 절호의 기회!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
