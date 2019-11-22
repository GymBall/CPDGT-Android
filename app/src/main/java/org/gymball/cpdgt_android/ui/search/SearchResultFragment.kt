package org.gymball.cpdgt_android.ui.search


import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_search_result.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.SearchResultData
import org.gymball.cpdgt_android.ui.MainActivity

class SearchResultFragment : Fragment() {
    lateinit var searchResultRecyclerViewAdapter: SearchResultRecyclerViewAdapter
    var search_object: String? = null
    companion object {
        var instance : SearchResultFragment = SearchResultFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_result, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setView()
        setOnClickListener()
        setRecyclerView()
    }

    private fun setView() {
        search_view.setText(instance.search_object)

    }

    private fun setRecyclerView(){
        var dataList: ArrayList<SearchResultData> = ArrayList()
        if(instance.search_object=="태권도"){
            dataList.add(
                SearchResultData(
                    R.drawable.taekwondo_b3,
                    R.drawable.taekwondo_t3,
                    "태권도 중급반",
                    "한혜리",
                    "4.3",
                    "월, 수, 금 오후 7시",
                    "\"어려운 태권도? 한혜리 짐선생과 함께라면 더 이상 어렵지 않습니다!\""
                )
            )
            dataList.add(
                SearchResultData(
                    R.drawable.taekwondo_b4,
                    R.drawable.taekwondo_t4,
                    "태권도 고급반",
                    "임은지",
                    "4.5",
                    "화, 목 오후 4시",
                    "\"화려한 수상 경력! 임은지 짐선생의 1:1 고급 태권도 코칭\""
                )
            )
            dataList.add(
                SearchResultData(
                    R.drawable.taekwondo_b5,
                    R.drawable.taekwondo_t5,
                    "태권도 대회준비반",
                    "오성훈",
                    "3.9",
                    "수, 금 오후 2시",
                    "\"10년 경력의 짐선생이 세심한 코칭으로 태권도 대회까지 책임집니다^^\""
                )
            )

            dataList.add(
                SearchResultData(
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
                SearchResultData(
                    R.drawable.taekwondo_b2,
                    R.drawable.taekwondo_t2,
                    "태권도 초급반",
                    "이태현",
                    "3.5",
                    "화, 목 오후 8시",
                    "\"눈높이 교육으로 배워가는 태권도! 이 수업과 함께라면 당신도 태권도 고수!\""
                )
            )
        } else if(instance.search_object =="수영") {
            dataList.add(
                SearchResultData(
                    R.drawable.swim_b3,
                    R.drawable.swim_t3,
                    "수영 중급반",
                    "김상우",
                    "4.5",
                    "월, 수, 금 오후 8시",
                    "\"김상우 짐선생과 함께 물길을 헤쳐나가봅시다! 믿고 맡겨주세요 :)\""
                )
            )
            dataList.add(
                SearchResultData(
                    R.drawable.swim_b4,
                    R.drawable.swim_t4,
                    "수영 초급반",
                    "윤민아",
                    "4.9",
                    "월, 수, 금 오후 8시",
                    "\"기본기가 탄탄해야 오래 배울 수 있습니다. 기본기를 만들어드릴게요.\""
                )
            )
            dataList.add(
                SearchResultData(
                    R.drawable.swim_b5,
                    R.drawable.swim_t5,
                    "수영 중급반",
                    "이하은",
                    "4.6",
                    "화, 목, 토 오전 6시",
                    "\"실력자는 말이 많지 않은거 아시죠. 주저하지 마세요. 전 선수 출신입니다.\""
                )
            )
            dataList.add(
                SearchResultData(
                    R.drawable.swim_b1,
                    R.drawable.swim_t1,
                    "수영 기초반",
                    "김하랑",
                    "4.4",
                    "월, 수, 금 오전 5시",
                    "\"Funny한 수영, Funny한 선생님! 이 한 줄이면 충분하지 않나요? 망설이지마세요\""
                )
            )
            dataList.add(
                SearchResultData(
                    R.drawable.swim_b2,
                    R.drawable.swim_t2,
                    "수영 심화반",
                    "박민철",
                    "3.3",
                    "화, 목, 토 오전 6시",
                    "\"고등학교 선수출신의 고급 수영 꿀팁! 하나부터 열까지 모두 알려드립니다^^\""
                )
            )
        }
        tv_frag_search_result_num.text = dataList.size.toString()+"건"

        searchResultRecyclerViewAdapter = SearchResultRecyclerViewAdapter(activity!!, dataList)
        //rv_search_result_list.addItemDecoration(DividerItemDecoration(context, 1))
        rv_search_result_list.adapter = searchResultRecyclerViewAdapter
        rv_search_result_list.layoutManager = LinearLayoutManager(activity)
    }

    private fun setOnClickListener() {
        search_view.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_DOWN) {
                val transaction: FragmentTransaction = (context as MainActivity).supportFragmentManager.beginTransaction()
                transaction.add(R.id.fl_frag_search, SearchResultFragment())
                transaction.addToBackStack(null)
                transaction.commit()
                instance.search_object = search_view.text.toString()
                return@OnKeyListener true
            }
            false
        })

    }
}
