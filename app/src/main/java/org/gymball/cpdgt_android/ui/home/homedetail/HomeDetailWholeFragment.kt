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

        dataList.add(HomeDetailData("http://ssd2696.maroo2003.gethompy.com/PEG/14556680016431.jpg","https://scontent-lht6-1.cdninstagram.com/v/t51.2885-15/e35/66489940_2361017267316600_3901728565817242360_n.jpg?_nc_ht=scontent-lht6-1.cdninstagram.com&se=8&oh=2d03b77926b6c324da439b968b476822&oe=5DFFA447&ig_cache_k진ey=MjEwNjMzNTg0NDUzMjQyODU5MA%3D%3D.2", "태권도 기초반", "강수진", "4.1", "수, 금 오후 7시", "\"즐겁고 건강하게 태권도를 배우고 싶은 사람! 모두 여기 모여라!\""))
        dataList.add(HomeDetailData("http://www.bgnews.kr/news/photo/201907/11858_13273_3817.jpg","https://i.ytimg.com/vi/atVRqth1upg/maxresdefault.jpg", "수영 기초반", "김하랑", "4.4", "월, 수, 금 오전 5시", "\"Funny한 수영, Funny한 선생님! 이 한 줄이면 충분하지 않나요? 망설이지마세요\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList)
        rv_adv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_adv_class_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setRecyclerViewBottom() {
        var dataList2 : ArrayList<HomeDetailData> = ArrayList()
        dataList2.add(HomeDetailData("htm_2011122804626a010a011.jpg","http://tbc.imgdl.xcache.kinxcdn.com/cdn001/20191001/-2147483648_1004beauty5.jpg", "폴댄스 개인특강", "신아람", "3.7", "화, 수 오후 12시", "\"폴댄스 1:1 특강입니다. 모든 기구 구비되어 있습니다!\""))
        dataList2.add(HomeDetailData("https://i.ytimg.com/vi/-iCMcpdzvS0/maxresdefault.jpg","http://mblogthumb4.phinf.naver.net/MjAxNzA2MTZfMjE5/MDAxNDk3NTQxOTE3NTM3.K-sUFNTeJCbIS4_AztSI05dTAtSncENfBRLfOmCKvgkg.AEpRM8tCDpRfsxjmNFqtkykMcykz_4iEMb7_l_z7fzMg.JPEG.ph_factory/KEN_%EC%8B%AC%EB%AF%BC%EC%A7%80-170531-%EC%B4%AC%EC%98%81%EC%9B%90%EB%B3%B8-5.jpg?type=w800", "발레 개인수업반", "강슬기", "4.3", "토, 일 오전 10시", "\"하나하나 섬세한 코치로 자세교정? 1대1 코칭 전문 강슬기 짐선생만 믿고 따라오세요~\""))
        dataList2.add(HomeDetailData("https://dailysecu.com/news/photo/201910/75345_72550_2232.jpg","http://www.xportsnews.com/contents/images/upload/article/2016/0909/1473412223218.jpg", "플라잉 요가반", "김태리", "4.7", "월, 화 오후 8시", "\"김태리 짐선생의 즐거운 플라잉 요가! 해먹과 함께 근력을 키워봅시다!\""))
        dataList2.add(HomeDetailData("http://www.funch.ne.kr/main/data/file/gym/2039362590_41YiOyPB_59dabf3f696acb0dbe9cdddfbd867df29a6d06c1.jpg","https://mblogthumb-phinf.pstatic.net/MjAxOTA1MjdfMTg1/MDAxNTU4OTQxODA2MzI3.gLn3Nz4FIQQDWmMIMwXvyJ_XO1OehVILUvY_HFP47vcg.HXd5LocIR-hZyik9Lhx2lhVQneowyyJ3aOBWYwG-7JEg.JPEG.marioluigi85/KakaoTalk_20170606_174456283.jpg?type=w800", "복싱 기초 주부반", "민정아", "4.5", "토, 일 오전 8시", "\"주부 전용 반 개설했습니다. 어렵게 생각하지 마시고 편하게 문의주세요!\""))
        dataList2.add(HomeDetailData("https://scontent-lht6-1.cdninstagram.com/v/t51.2885-15/e35/65652049_482355385872221_2967853958846202031_n.jpg?_nc_ht=scontent-lht6-1.cdninstagram.com&_nc_cat=105&se=7&oh=f6dc36c9f344d49b934a5c5d6fd54bce&oe=5E012772&ig_cache_key=MjA4MDU1MzMxMDM1NTcwNDE4OQ%3D%3D.2","https://post-phinf.pstatic.net/MjAxOTAzMDhfNDQg/MDAxNTUyMDAzNzA2NzIy.jYN5oQnoPo89goVTwcDDioA_yt8LI7Eag4RAJgiOsQYg.auKcgMiFBL_VOAeNR8XtObEFJjsBaoCZQk8tfD-0z5Ag.JPEG/IMG_8598.JPG?type=w1200", "복싱 대회준비반", "구정태", "3.3", "금, 토 오후 8시", "\"대회 준비하는 반입니다, 1년 이상 해보신 분들만 연락주세요!\""))
        dataList2.add(HomeDetailData("http://www.djtimes.co.kr/news/photo/201903/76578_53198_1731.jpg","http://img.hani.co.kr/imgdb/resize/2018/1122/00503715_20181122.JPG", "복싱 1대1", "김지아", "2.5", "주 5회 시간 자유", "\"1대1, 주 5회로 전문적으로 가까이서 알려드립니다.\""))
        dataList2.add(HomeDetailData("https://www.bctaekwondo.com/page/image/instructor_305.jpg","https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile3.uf.tistory.com%2Fimage%2F231A1A3F557E77A71DC033", "태권도 고급반", "임은지", "4.5", "화, 목 오후 4시", "\"화려한 수상 경력! 임은지 짐선생의 1:1 고급 태권도 코칭\""))
        dataList2.add(HomeDetailData("https://t1.daumcdn.net/cfile/tistory/223A084A54F97D9729","https://mblogthumb-phinf.pstatic.net/MjAxNzAxMDNfMTg1/MDAxNDgzNDIwNDkxNTI3.VqJmQfVqvZHIxhVYS35m144SyeZAPjzv4QJC4vKCmwgg.arPJbRhw9Drw0gvb2RsdMMUSceMrrxwPDCGtzMgZqZcg.JPEG.icare_korea/%EA%B4%80%EC%9E%A5%EB%8B%98.JPG?type=w800", "태권도 대회준비반", "오성훈", "3.9", "수, 금 오후 2시", "\"10년 경력의 짐선생이 세심한 코칭으로 태권도 대회까지 책임집니다^^\""))
        dataList2.add(HomeDetailData("https://img.huffingtonpost.com/asset/5d71e5df2500004d120658d3.jpeg?ops=scalefit_630_noupscale","https://scontent-iad3-1.cdninstagram.com/vp/3e16f739b69940a4bf034f770c15e9d7/5E5604D0/t51.2885-15/e35/c4.0.568.568a/65770696_706962619743607_1124398013105255515_n.jpg?_nc_ht=scontent-iad3-1.cdninstagram.com&_nc_cat=107", "무산소 운동반", "유주아", "4.2", "월, 수, 금 오후 7시", "\"탄탄한 바디 , 을매나 보기 좋게요~! 제가 만들어 드릴게요!\""))
        dataList2.add(HomeDetailData("https://t1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/6qYm/image/sXRg9shAb164ONcdOrWlaQ-C2dU.jpg","https://scontent-frx5-1.cdninstagram.com/vp/7cc8fb063e63fc25b022c6d8cb230f5b/5E40FE1D/t51.2885-15/e35/p1080x1080/69160640_2028224100612386_5358694645389527321_n.jpg?_nc_ht=scontent-frx5-1.cdninstagram.com&_nc_cat=102&ig_cache_key=MjEyODQ5ODUxNzQzMjU3MTA4MQ%3D%3D.2", "헬스 무산소반", "신하은", "3.2", "월, 수 오후 6시", "\"근육의 아름다움에 대하여. 운동도 잘하면 보기싫은 근육이 아닌 예쁜 근육이 됩니다! 저와 함께 해요!\""))
        dataList2.add(HomeDetailData("https://i.ytimg.com/vi/KrNUbmopXiI/maxresdefault.jpg","http://imgnews.naver.net/image/5207/2017/07/08/0000184701_001_20170708092149234.jpg", "수영 중급반", "이하은", "4.6", "화, 목, 토 오전 6시", "\"실력자는 말이 많지 않은거 아시죠. 주저하지 마세요. 전 선수 출신입니다.\""))
        dataList2.add(HomeDetailData("http://mimaji.com/app/dubu_board/docs/imgs/f/lg_f15178766516559_img11.jpg","https://img1.daumcdn.net/thumb/R720x0.q80/?scode=mtistory2&fname=http%3A%2F%2Fcfile2.uf.tistory.com%2Fimage%2F991B1B4E5C4C70E8014EB9", "한국무용 기초반", "김혜연", "4.3", "토, 일 오전 9시", "\"숙명여대 출신의 한국무용 짐선생! 김혜연 짐선생과 한국무용을 시작해보세요^^\""))
        dataList2.add(HomeDetailData("https://scontent-cdt1-1.cdninstagram.com/vp/1435abcb6bb1e4aefeb13dcb7ace43fa/5E28382B/t51.2885-15/e35/49933498_2028304794133659_517210995919470802_n.jpg?_nc_ht=scontent-cdt1-1.cdninstagram.com&_nc_cat=103&ig_cache_key=MTk1MzQ5NDIwMTExMTM3NjYyNg%3D%3D.2","http://www.kyeongin.com/mnt/file/201810/20181031000812439_1.jpg", "필라테스반", "한상호", "3.8", "월, 목 오전 9시", "\"기초 탄탄, 처음 시작하는 사람도 누구나 쉽게! 필라테스 수업은 한상호 짐선생고 함께!\""))
        dataList2.add(HomeDetailData("https://t1.daumcdn.net/thumb/R1280x0/?fname=http://t1.daumcdn.net/brunch/service/user/1h02/image/a8UAEUbhcIJiKdJTqKOSMhJz2qo.jpg","https://scontent-yyz1-1.cdninstagram.com/vp/f7f6a404404122e60da5de29b7e76fa3/5DE47FF9/t51.2885-15/e35/44513599_716836658702920_340072690380682739_n.jpg?_nc_ht=scontent-yyz1-1.cdninstagram.com&se=8", "요가 자세교정반", "차승희", "4.9", "토, 일 오전 10시", "\"일대일로! 바로 옆에서 자세 교정 해드려요^^* 틀어진 골반, 승희 짐선생이 책임지고 돌려드립니다!\""))
        dataList2.add(HomeDetailData("https://social.lge.co.kr/wp-content/uploads/2013/09/LG-Sakers_%EB%86%8D%EA%B5%AC%EA%B5%90%EC%8B%A45.jpg","https://post-phinf.pstatic.net/MjAxODA2MTVfMjcz/MDAxNTI5MDM3NDUwNDgy.RrZHhmaCCKnryoKh5QE0pD74sgNBXSSI3NvTbqzyVRQg.BIB7FBu8m4chgCqenuA1btHsJq19x_UgAOo8wL36naQg.JPEG/%EC%9A%B4%EB%8F%993.jpg?type=w1200", "테니스 초급반", "최고운", "4.5", "수, 금 오후 7시", "\"다른 수업과 차원이 다른 테니스 수업! 주저하지말고 신청하세요 :)\""))
        dataList2.add(HomeDetailData("http://saemaulfit.cafe24.com/web/saemaul/squash/11.JPG","https://scontent-lht6-1.cdninstagram.com/v/t51.2885-15/e35/61843914_460458424757416_9027288343031843825_n.jpg?_nc_ht=scontent-lht6-1.cdninstagram.com&se=7&oh=bdb2d05e4c5ad3fc616ea7dbc741232c&oe=5DF12877&ig_cache_key=MjA3MDQyNjEyNjM1NTcwODI3Nw%3D%3D.2", "스쿼시 초급반", "황용식", "3.8", "금, 토 오후 5시", "\"쉽게 접할 수 없는 스쿼시! 재미있게 배울 수 있는 절호의 기회!\""))
        dataList2.add(HomeDetailData("http://talkimg.imbc.com/TVianUpload/tvian/TViews/image/2016/09/14/yNyNb6ek3o0l636094411007331290.jpg","https://pbs.twimg.com/media/DzKr16yVsAEa7N_.jpg", "방탄커버댄스반", "김기범", "4.6", "목, 금 오후 8시", "\"방탄소년단의 춤도 저와 함께라면 어렵지 않아요*^o^*\""))
        dataList2.add(HomeDetailData("http://health.chosun.com/site/data/img_dir/2014/11/20/2014112001053_0.jpg","http://ptness.com/jinsung_board/upload_data/image_data/data_1394090830.jpg", "헬스 스타트반", "강종민", "4.4", "화, 목, 토 오전 6시", "\"기초가 탄탄해야 더 건강하게 운동할 수 있다는 사실, 다들 알고 계신가요? 탄탄한 기초를 쌓을 수 있도록 도와드릴게요!\""))
        dataList2.add(HomeDetailData("http://www.econovill.com/news/photo/201901/354418_238664_4221.png","http://upload.luckyworld.net/lifeboard/2014/08/22/0822_6031.jpg", "핫바디반", "민지유", "4.9", "월, 수, 금 오후 8시", "\"늘어난 뱃살은 그만! 저와 함께 핫바디 만들어가요\""))
        dataList2.add(HomeDetailData("http://www.nbnnews.co.kr/news/photo/201710/114470_176609_1218.jpg","https://yt3.ggpht.com/a/AGF-l7_mfR3RUS1ZJiCM0kdgj_yxsN4NRpk290RILQ=s800-c-k-c0xffffffff-no-rj-mo", "소프트 헬스반", "이규민", "4.7", "월, 금 오후 9시", "\"헬스가 힘들기만 하다는 생각, 제가 없애드리겠습니다! 헬스도 즐겁게 할 수 도록!\""))
        dataList2.add(HomeDetailData("http://www.bgnews.kr/news/photo/201907/11858_13273_3817.jpg","https://i.ytimg.com/vi/atVRqth1upg/maxresdefault.jpg", "수영 기초반", "김하랑", "4.4", "월, 수, 금 오전 5시", "\"Funny한 수영, Funny한 선생님! 이 한 줄이면 충분하지 않나요? 망설이지마세요\""))
        dataList2.add(HomeDetailData("http://img.khan.co.kr/news/2012/07/22/l_2012072201007243200222691.jpg","http://dhcdn.design.co.kr/cms/img/2015/07/M.1437035165.6687.2.jpg", "수영 심화반", "박민철", "3.3", "화, 목, 토 오전 6시", "\"고등학교 선수출신의 고급 수영 꿀팁! 하나부터 열까지 모두 알려드립니다^^\""))
        dataList2.add(HomeDetailData("http://mblogthumb2.phinf.naver.net/MjAxNzExMjFfMjY2/MDAxNTExMjI3NTIxMzI2.mZ34rPLLcQ0i4pFaArWEHtWf5g25bBHxnXdFy6o7gegg.b7HysXI68bwXEUuX2aWRnbdUTsdlUNNwgbym63i3S0gg.JPEG.jinee4417/1109%EB%8D%A4%EB%B2%A8%EC%9A%94%EA%B0%80_%283%29.jpg?type=w2","https://t1.daumcdn.net/thumb/R1024x0/?fname=http://cfile289.uf.daum.net/image/993D5A495CC1578A1DB088", "덤벨 요가반", "정아린", "3.7", "화, 목 오후 6시", "\"자세 교정, 근력 향상! 일석이조 덤벨 요가, 아린 짐선생과 함께해요~\""))
        dataList2.add(HomeDetailData("http://www.ornan.kr/ballet/images/ornan_18.jpg","http://www.sportsq.co.kr/news/photo/201406/11219_21760_2733.jpg", "발레 기초반", "박재우", "4.2", "토, 일 오후 2시", "\"발레를 처음 시작하는 어린이부터 어른까지! 박재우 짐선생이 베이스부터 차근차근 알려드립니다!\""))
        dataList2.add(HomeDetailData("http://www.insideballet.co.kr/bbs/data/gallery2/1465277_611918078845985_1911403616_n.jpg","http://www.topstarnews.net/news/photo/201910/685298_394454_536.jpeg", "발레 초급반", "차예림", "3.9", "월, 수, 금 오후 6시", "\"발레 강사 경력 15년 차예림 짐선생과 함께라면 매일 기대되는 발레 수업 보장합니다!\""))
        dataList2.add(HomeDetailData("http://news20.busan.com/content/image/2017/04/02/20170402000088_0.jpg","http://img.asiatoday.co.kr/file/2017y/02m/15d/2017021501001828500101171.jpg", "발레 남성전용반", "권상훈", "4.0", "화, 목 오후 8시", "\"발레를 배우고 싶지만 도전하기 어려웠던 남성분들, 지금 시작하세요! 남성전용 발레 코칭 :)\""))
        dataList2.add(HomeDetailData("https://post-phinf.pstatic.net/MjAxNzA2MThfMjc3/MDAxNDk3NzY1OTY1NzYz.1vZqPr2pYZ5SX54rZ2LW_A2nm3XBzk4Jo_guba5brzkg.WpROo5LmQCfZ6vSP7V-pJRh_iJCeD4CIM2mwyEuKAygg.PNG/image.png?type=w1200","http://art.chosun.com/site/data/img_dir/2017/02/16/2017021600834_0.jpg", "발레 중급반", "이준수", "3.7", "수, 금 오후 4시", "\"발레를 배워 본 경험이 있는 짐학생들 여기여기 모여라~ 준수 짐선생과 발레 마스터까지 고고!\""))
        dataList2.add(HomeDetailData("http://ssd2696.maroo2003.gethompy.com/PEG/14556680016431.jpg","https://scontent-lht6-1.cdninstagram.com/v/t51.2885-15/e35/66489940_2361017267316600_3901728565817242360_n.jpg?_nc_ht=scontent-lht6-1.cdninstagram.com&se=8&oh=2d03b77926b6c324da439b968b476822&oe=5DFFA447&ig_cache_k진ey=MjEwNjMzNTg0NDUzMjQyODU5MA%3D%3D.2", "태권도 기초반", "강수진", "4.1", "수, 금 오후 7시", "\"즐겁고 건강하게 태권도를 배우고 싶은 사람! 모두 여기 모여라!\""))
        dataList2.add(HomeDetailData("http://www.tkdnews.com/news/photo/200911/5034_5018_2556.jpg","http://menshealthkorea.com/wp-content/uploads/2018/08/MH-people-fitguy-hoyoungjin1.jpg", "태권도 초급반", "이태현", "3.5", "화, 목 오후 8시", "\"눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!\""))
        dataList2.add(HomeDetailData("https://pds.joins.com/news/component/htmlphoto_mmdata/201811/25/75d754f3-9b37-4659-88a1-1a8269d14c35.jpg","http://cfile239.uf.daum.net/image/9956D7395DA10F711493CB", "줌바댄스 기초반", "이수정", "3.3", "월, 수, 금 오전 11시", "\"100일만에 10kg 감량 가능하다구요! 바로 저와 함께라면!!\""))
        dataList2.add(HomeDetailData("https://post-phinf.pstatic.net/MjAxODA2MTVfNyAg/MDAxNTI5MDM1NjU2MTcy.AVob4SBoZ-xjRGRPyQcivU7NRqauuO4BX4fUlGktRXIg.OguNIGwaTpSvrWclGX1bg6QBuWSNHWKqM1M-YGiBwaEg.JPEG/포3.jpg?type=w1200","https://modo-phinf.pstatic.net/20180820_265/1534736764876NpBA1_JPEG/mosaiDOzLl.jpeg?type=a1100", "방송댄스 여자부", "최민아", "3.9", "수 오후 10시", "\"최신 유행 댄스를 한달에 한곡씩 마스터할 수 있습니다. 어렵다고 생각하지 마세요!\""))
        dataList2.add(HomeDetailData("http://cfile211.uf.daum.net/R400x0/2307D33E561392A4177184","https://www.bctaekwondo.com/page/image/instructor_303.jpg", "태권도 중급반", "한혜리", "4.3", "월, 수, 금 오후 7시", "\"어려운 태권도? 한혜리 짐선생과 함께라면 더 이상 어렵지 않습니다!\""))
        dataList2.add(HomeDetailData("https://i.ytimg.com/vi/JY23c8MmJtU/maxresdefault.jpg","https://shop.r10s.jp/auc-elehelm-hatstore/cabinet/item/59/l3981-011_m1.jpg", "팝핀댄스 중급반", "박정륭", "3.4", "월, 화 오후 7시 반", "\"연체동물처럼 꺾는 팝핀댄스! 유연하지 않아도 할 수 있어요 @_@\""))
        dataList2.add(HomeDetailData("https://scontent-lga3-1.cdninstagram.com/vp/5a8e8f2ab2f9a1ce9826491791f20968/5DE204DD/t51.2885-15/e35/66426025_2358866244371600_263797346540604813_n.jpg?_nc_ht=scontent-lga3-1.cdninstagram.com","https://3.bp.blogspot.com/-5vzpa9kcIIQ/XJDcGJHpP1I/AAAAAAAAJ2k/cn-0KKJikLIMZVXxy4WC1PMinJqyn8gZwCLcBGAs/s1600/D0o-Q_SU0AAAmHf%25EC%258A%25A4%25ED%2583%2580%25ED%258A%25B8.jpg", "주짓수 중급반", "배주현", "4.7", "월, 수 오후 7시", "\"배주현 짐선생이 주짓수 기초 체계부터 탄탄하게 잡아드립니다!\""))
        dataList2.add(HomeDetailData("https://social.lge.co.kr/wp-content/uploads/2013/09/LG-Sakers_%EB%86%8D%EA%B5%AC%EA%B5%90%EC%8B%A45.jpg","http://img.hani.co.kr/imgdb/resize/2019/0606/00500049_20190606.JPG", "농구 입문반", "김치용", "2.3", "화, 목 오후 8시", "\"김치용 짐선생의 수업과 함께 농구 실력도 쑥쑥! 키도 쑥쑥!\""))
        dataList2.add(HomeDetailData("https://scontent-lhr3-1.cdninstagram.com/vp/37f74b4bad6e974820f0daf5b1bddfe2/5E2BE91B/t51.2885-15/e35/s1080x1080/69620913_386570805578602_6404033088369302608_n.jpg?_nc_ht=scontent-lhr3-1.cdninstagram.com&_nc_cat=110","https://post-phinf.pstatic.net/MjAxOTAxMTVfMTgw/MDAxNTQ3NTM0MzAyOTU5.3xr8lB0eNyy2VdnclI5y6UoMjjL_lYf0skIe-hV5qhUg.xGWNC6QPec1goIjTgPMXhu8BvEeMGqn60ecRjlsnhzkg.JPEG/D6F3DD3B-3156-4C82-AA27-95C643F99780.jpeg?type=w1200", "다이어트 요가반", "김유아", "4.4", "화, 목 오후 2시", "\"다이어트 전용 요가 김유아 짐선생입니다! 한 달이면 효과 뿜뿜!\""))
        dataList2.add(HomeDetailData("http://www.dtnews24.com/news/photo/201908/555432_192971_5358.jpg","https://pbs.twimg.com/tweet_video_thumb/ECljS0xVAAEr0jr.jpg", "수영 중급반", "김상우", "4.5", "월, 수, 금 오후 8시", "\"김상우 짐선생과 함께 물길을 헤쳐나가봅시다! 믿고 맡겨주세요 :)\""))
        dataList2.add(HomeDetailData("https://post-phinf.pstatic.net/MjAxOTA2MjFfMjU2/MDAxNTYxMTA5Nzk0MDQ0._s6xMpg126KQOyjudNAWHwj-xT-pkGBsvjFPmw0w2yog.Kc9be5xigKavQE0CAzBUSABRkB-YStjzw8VlM85Pf9kg.JPEG/%EC%88%98%EC%98%812.jpg?type=w1200","http://nimage.newsway.kr/photo/2019/06/27/20190627000152_0700.jpg", "수영 초급반", "윤민아", "4.9", "월, 수, 금 오후 8시", "\"기본기가 탄탄해야 오래 배울 수 있습니다. 기본기를 만들어드릴게요.\""))
        dataList2.add(HomeDetailData("https://post-phinf.pstatic.net/MjAxODAyMjdfMTkx/MDAxNTE5NzIxNzk0NTg3.GPejmem9AyEiiEf_Ggx3lHitc2_e4U3IjNy3dS8oO1gg.CA-n9uVG1rs8H3QH4a4rgQ_1z5N0K-Ldt5ZiFaO61Acg.JPEG/image_3847560001519721511274.jpg?type=w1200","http://pds24.cafe.daum.net/download.php?grpid=ibyz&fldid=IL8P&dataid=620&fileid=1&disk=20&.jpg", "복싱 중급반", "이마음", "3.6", "월, 화 오후 2시", "\"체육관에서 전문적으로 알려드려요! (장비는 본인 장비로 하시면 됩니다!)\""))
        dataList2.add(HomeDetailData("https://instagram.frix8-1.fna.fbcdn.net/vp/036d2bcda64ab80f2ae3a9e48c945b78/5DDB127F/t51.2885-15/e35/66429489_501151350631777_8955867208626223280_n.jpg?_nc_ht=instagram.frix8-1.fna.fbcdn.net","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPwPI1GYfq3rPYCj9xGzGdo7Dc2QjMbnq4ftkmCQcT2bISkVVbmw&s", "복싱 전문반", "배자일", "4.7", "수, 금 오후 4시 반", "\"전문적으로 배우고 싶으신 분들 모두모두 주목!! 저 배자일과 함께 복싱 정복해봅시다!\""))

        homeDetailRecyclerViewAdapter =
            HomeDetailRecyclerViewAdapter(activity!!, dataList2)
        rv_class_list.adapter = homeDetailRecyclerViewAdapter
        rv_class_list.layoutManager = LinearLayoutManager(activity)
    }
}
