package org.gymball.cpdgt_android.ui.my


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_my.*

import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.HomeDetailData
import org.gymball.cpdgt_android.model.LectureAbsData
import org.gymball.cpdgt_android.ui.MainActivity
import org.gymball.cpdgt_android.ui.login.LoginActivity
import org.gymball.cpdgt_android.util.User
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.support.v4.ctx
import org.jetbrains.anko.support.v4.startActivity

class MyFragment : Fragment() {

    lateinit var myRecyclerViewAdapter: MyRecyclerViewAdapter
    var dataList: ArrayList<HomeDetailData> = arrayListOf(
        HomeDetailData(
            R.drawable.dance_b5,
            R.drawable.dance_t5,
            "팝핀댄스 중급반",
            "박정륭",
            "3.4",
            "월, 화 오후 7시 반",
            "\"연체동물처럼 꺾는 팝핀댄스! 유연하지 않아도 할 수 있어요 @_@\""
        ),
        HomeDetailData(
            R.drawable.ballet_b4,
            R.drawable.ballet_t4,
            "발레 중급반",
            "이준수",
            "3.7",
            "수, 금 오후 4시",
            "\"발레를 배워 본 경험이 있는 짐학생들 여기여기 모여라~ 준수 짐선생과 발레 마스터까지 고고!\""
        ),
        HomeDetailData(
            R.drawable.swim_b2,
            R.drawable.swim_t2,
            "수영 심화반",
            "박민철",
            "3.3",
            "화, 목, 토 오전 6시",
            "\"고등학교 선수출신의 고급 수영 꿀팁! 하나부터 열까지 모두 알려드립니다^^\""
        ),
        HomeDetailData(
            R.drawable.taekwondo_b5,
            R.drawable.taekwondo_t5,
            "태권도 대회준비반",
            "오성훈",
            "3.9",
            "수, 금 오후 2시",
            "\"10년 경력의 짐선생이 세심한 코칭으로 태권도 대회까지 책임집니다^^\""
        ),
        HomeDetailData(
            R.drawable.etc_b4,
            R.drawable.etc_t4,
            "테니스 초급반",
            "최고운",
            "4.5",
            "수, 금 오후 7시",
            "\"다른 수업과 차원이 다른 테니스 수업! 주저하지말고 신청하세요 :)\""
        ),
        HomeDetailData(
            R.drawable.etc_b5,
            R.drawable.etc_t5,
            "스쿼시 초급반",
            "황용식",
            "3.8",
            "금, 토 오후 5시",
            "\"쉽게 접할 수 없는 스쿼시! 재미있게 배울 수 있는 절호의 기회!\""
        )
    )

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
        tv_frag_my_nickname.text = User.nickname+" 님"
        logout.setOnClickListener {
            User.flag = -1
            User.nickname = null
            startActivity<LoginActivity>()
            MainActivity.MainClass.act?.finish()
        }
    }

    private fun setRecyclerView() {
        myRecyclerViewAdapter = MyRecyclerViewAdapter(activity!!, dataList, dataList.size)
        rv_my_recent.adapter = myRecyclerViewAdapter
        rv_my_recent.layoutManager = LinearLayoutManager(activity!!, LinearLayoutManager.HORIZONTAL, false)
    }
}
