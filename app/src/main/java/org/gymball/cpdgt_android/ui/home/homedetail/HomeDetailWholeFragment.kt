package org.gymball.cpdgt_android.ui.home.homedetail


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home_detail_whole.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.HomeDetailData
import org.gymball.cpdgt_android.ui.home.HomeDetailRecyclerViewAdapter

//adapter = HomeDetailAdapter(myContext.getSupportFragmentManager(), 4)
class HomeDetailWholeFragment: Fragment() {

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

        dataList.add(
            HomeDetailData(
                R.drawable.taekwondo_b1,
                R.drawable.taekwondo_t1,
                "태권도 기초반",
                "강수진",
                "4.1",
                "수, 금 오후 7시",
                "\"즐겁고 건강하게 태권도를 배우고 싶은 사람! 모두 여기 모여라!\""
            )
        )
        dataList.add(
            HomeDetailData(
                R.drawable.swim_b1,
                R.drawable.swim_t1,
                "수영 기초반",
                "김하랑",
                "4.4",
                "월, 수, 금 오전 5시",
                "\"Funny한 수영, Funny한 선생님! 이 한 줄이면 충분하지 않나요? 망설이지마세요\""
            )
        )

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(
            HomeDetailData(
                R.drawable.ballet_b3,
                R.drawable.ballet_t3,
                "발레 남성전용반",
                "권상훈",
                "4.0",
                "화, 목 오후 8시",
                "\"발레를 배우고 싶지만 도전하기 어려웠던 남성분들, 지금 시작하세요! 남성전용 발레 코칭 :)\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.ballet_b4,
                R.drawable.ballet_t4,
                "발레 중급반",
                "이준수",
                "3.7",
                "수, 금 오후 4시",
                "\"발레를 배워 본 경험이 있는 짐학생들 여기여기 모여라~ 준수 짐선생과 발레 마스터까지 고고!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.ballet_b5,
                R.drawable.ballet_t5,
                "발레 개인수업반",
                "강슬기",
                "4.3",
                "토, 일 오전 10시",
                "\"하나하나 섬세한 코치로 자세교정? 1대1 코칭 전문 강슬기 짐선생만 믿고 따라오세요~\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.ballet_b1,
                R.drawable.ballet_t1,
                "발레 기초반",
                "박재우",
                "4.2",
                "토, 일 오후 2시",
                "\"발레를 처음 시작하는 어린이부터 어른까지! 박재우 짐선생이 베이스부터 차근차근 알려드립니다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.ballet_b2,
                R.drawable.ballet_t2,
                "발레 초급반",
                "차예림",
                "3.9",
                "월, 수, 금 오후 6시",
                "\"발레 강사 경력 15년 차예림 짐선생과 함께라면 매일 기대되는 발레 수업 보장합니다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.boxing_b3,
                R.drawable.boxing_t3,
                "복싱 1대1",
                "김지아",
                "2.5",
                "주 5회 시간 자유",
                "\"1대1, 주 5회로 전문적으로 가까이서 알려드립니다.\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.boxing_b4,
                R.drawable.boxing_t4,
                "복싱 중급반",
                "이마음",
                "3.6",
                "월, 화 오후 2시",
                "\"체육관에서 전문적으로 알려드려요! (장비는 본인 장비로 하시면 됩니다!)\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.boxing_b5,
                R.drawable.boxing_t5,
                "복싱 전문반",
                "배자일",
                "4.7",
                "수, 금 오후 4시 반",
                "\"전문적으로 배우고 싶으신 분들 모두모두 주목!! 저 배자일과 함께 복싱 정복해봅시다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.boxing_b1,
                R.drawable.boxing_t1,
                "복싱 기초 주부반",
                "민정아",
                "4.5",
                "토, 일 오전 8시",
                "\"주부 전용 반 개설했습니다. 어렵게 생각하지 마시고 편하게 문의주세요!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.boxing_b2,
                R.drawable.boxing_t2,
                "복싱 대회준비반",
                "구정태",
                "3.3",
                "금, 토 오후 8시",
                "\"대회 준비하는 반입니다, 1년 이상 해보신 분들만 연락주세요!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.dance_b3,
                R.drawable.dance_t3,
                "방송댄스 여자부",
                "최민아",
                "3.9",
                "수 오후 10시",
                "\"최신 유행 댄스를 한달에 한곡씩 마스터할 수 있습니다. 어렵다고 생각하지 마세요!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.dance_b4,
                R.drawable.dance_t4,
                "폴댄스 개인특강",
                "신아람",
                "3.7",
                "화, 수 오후 12시",
                "\"폴댄스 1:1 특강입니다. 모든 기구 구비되어 있습니다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.dance_b5,
                R.drawable.dance_t5,
                "팝핀댄스 중급반",
                "박정륭",
                "3.4",
                "월, 화 오후 7시 반",
                "\"연체동물처럼 꺾는 팝핀댄스! 유연하지 않아도 할 수 있어요 @_@\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.dance_b1,
                R.drawable.dance_t1,
                "방탄커버댄스반",
                "김기범",
                "4.6",
                "목, 금 오후 8시",
                "\"방탄소년단의 춤도 저와 함께라면 어렵지 않아요*^o^*\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.dance_b2,
                R.drawable.dance_t2,
                "줌바댄스 기초반",
                "이수정",
                "3.3",
                "월, 수, 금 오전 11시",
                "\"100일만에 10kg 감량 가능하다구요! 바로 저와 함께라면!!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.etc_b3,
                R.drawable.etc_t3,
                "농구 입문반",
                "김치용",
                "2.3",
                "화, 목 오후 8시",
                "\"김치용 짐선생의 수업과 함께 농구 실력도 쑥쑥! 키도 쑥쑥!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.etc_b4,
                R.drawable.etc_t4,
                "테니스 초급반",
                "최고운",
                "4.5",
                "수, 금 오후 7시",
                "\"다른 수업과 차원이 다른 테니스 수업! 주저하지말고 신청하세요 :)\""
            )
        )
        dataList2.add(
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
        dataList2.add(
            HomeDetailData(
                R.drawable.etc_b1,
                R.drawable.etc_t1,
                "한국무용 기초반",
                "김혜연",
                "4.3",
                "토, 일 오전 9시",
                "\"숙명여대 출신의 한국무용 짐선생! 김혜연 짐선생과 한국무용을 시작해보세요^^\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.etc_b2,
                R.drawable.etc_t2,
                "주짓수 중급반",
                "배주현",
                "4.7",
                "월, 수 오후 7시",
                "\"배주현 짐선생이 주짓수 기초 체계부터 탄탄하게 잡아드립니다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.health_b3,
                R.drawable.health_t3,
                "헬스 스타트반",
                "강종민",
                "4.4",
                "화, 목, 토 오전 6시",
                "\"기초가 탄탄해야 더 건강하게 운동할 수 있다는 사실, 다들 알고 계신가요? 탄탄한 기초를 쌓을 수 있도록 도와드릴게요!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.health_b4,
                R.drawable.health_t4,
                "핫바디반",
                "민지유",
                "4.9",
                "월, 수, 금 오후 8시",
                "\"늘어난 뱃살은 그만! 저와 함께 핫바디 만들어가요\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.health_b5,
                R.drawable.health_t5,
                "소프트 헬스반",
                "이규민",
                "4.7",
                "월, 금 오후 9시",
                "\"헬스가 힘들기만 하다는 생각, 제가 없애드리겠습니다! 헬스도 즐겁게 할 수 도록!\""
            )
        )

        dataList2.add(
            HomeDetailData(
                R.drawable.health_b1,
                R.drawable.health_t1,
                "무산소 운동반",
                "유주아",
                "4.2",
                "월, 수, 금 오후 7시",
                "\"탄탄한 바디, 을매나 보기 좋게요~! 제가 만들어 드릴게요!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.health_b2,
                R.drawable.health_t2,
                "헬스 무산소반",
                "신하은",
                "3.2",
                "월, 수 오후 6시",
                "\"근육의 아름다움에 대하여. 운동도 잘하면 보기싫은 근육이 아닌 예쁜 근육이 됩니다! 저와 함께 해요!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.swim_b3,
                R.drawable.swim_t3,
                "수영 중급반",
                "김상우",
                "4.5",
                "월, 수, 금 오후 8시",
                "\"김상우 짐선생과 함께 물길을 헤쳐나가봅시다! 믿고 맡겨주세요 :)\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.swim_b4,
                R.drawable.swim_t4,
                "수영 초급반",
                "윤민아",
                "4.9",
                "월, 수, 금 오후 8시",
                "\"기본기가 탄탄해야 오래 배울 수 있습니다. 기본기를 만들어드릴게요.\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.swim_b5,
                R.drawable.swim_t5,
                "수영 중급반",
                "이하은",
                "4.6",
                "화, 목, 토 오전 6시",
                "\"실력자는 말이 많지 않은거 아시죠. 주저하지 마세요. 전 선수 출신입니다.\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.swim_b1,
                R.drawable.swim_t1,
                "수영 기초반",
                "김하랑",
                "4.4",
                "월, 수, 금 오전 5시",
                "\"Funny한 수영, Funny한 선생님! 이 한 줄이면 충분하지 않나요? 망설이지마세요\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.swim_b2,
                R.drawable.swim_t2,
                "수영 심화반",
                "박민철",
                "3.3",
                "화, 목, 토 오전 6시",
                "\"고등학교 선수출신의 고급 수영 꿀팁! 하나부터 열까지 모두 알려드립니다^^\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.taekwondo_b3,
                R.drawable.taekwondo_t3,
                "태권도 중급반",
                "한혜리",
                "4.3",
                "월, 수, 금 오후 7시",
                "\"어려운 태권도? 한혜리 짐선생과 함께라면 더 이상 어렵지 않습니다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.taekwondo_b4,
                R.drawable.taekwondo_t4,
                "태권도 고급반",
                "임은지",
                "4.5",
                "화, 목 오후 4시",
                "\"화려한 수상 경력! 임은지 짐선생의 1:1 고급 태권도 코칭\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.taekwondo_b5,
                R.drawable.taekwondo_t5,
                "태권도 대회준비반",
                "오성훈",
                "3.9",
                "수, 금 오후 2시",
                "\"10년 경력의 짐선생이 세심한 코칭으로 태권도 대회까지 책임집니다^^\""
            )
        )

        dataList2.add(
            HomeDetailData(
                R.drawable.taekwondo_b1,
                R.drawable.taekwondo_t1,
                "태권도 기초반",
                "강수진",
                "4.1",
                "수, 금 오후 7시",
                "\"즐겁고 건강하게 태권도를 배우고 싶은 사람! 모두 여기 모여라!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.taekwondo_b2,
                R.drawable.taekwondo_t2,
                "태권도 초급반",
                "이태현",
                "3.5",
                "화, 목 오후 8시",
                "\"눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.yoga_b3,
                R.drawable.yoga_t3,
                "필라테스반",
                "한상호",
                "3.8",
                "월, 목 오전 9시",
                "\"기초 탄탄, 처음 시작하는 사람도 누구나 쉽게! 필라테스 수업은 한상호 짐선생고 함께!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.yoga_b4,
                R.drawable.yoga_t4,
                "요가 자세교정반",
                "차승희",
                "4.9",
                "토, 일 오전 10시",
                "\"일대일로! 바로 옆에서 자세 교정 해드려요^^* 틀어진 골반, 승희 짐선생이 책임지고 돌려드립니다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.yoga_b5,
                R.drawable.yoga_t5,
                "덤벨 요가반",
                "정아린",
                "3.7",
                "화, 목 오후 6시",
                "\"자세 교정, 근력 향상! 일석이조 덤벨 요가, 아린 짐선생과 함께해요~\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.yoga_b1,
                R.drawable.yoga_t1,
                "플라잉 요가반",
                "김태리",
                "4.7",
                "월, 화 오후 8시",
                "\"김태리 짐선생의 즐거운 플라잉 요가! 해먹과 함께 근력을 키워봅시다!\""
            )
        )
        dataList2.add(
            HomeDetailData(
                R.drawable.yoga_b2,
                R.drawable.yoga_t2,
                "다이어트 요가반",
                "김유아",
                "4.4",
                "화, 목 오후 2시",
                "\"다이어트 전용 요가 김유아 짐선생입니다! 한 달이면 효과 뿜뿜!\""
            )
        )



        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
