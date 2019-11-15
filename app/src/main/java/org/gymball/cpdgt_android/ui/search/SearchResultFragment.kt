package org.gymball.cpdgt_android.ui.search


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_search_result.*

import androidx.recyclerview.widget.DividerItemDecoration
import android.R



/**
 * A simple [Fragment] subclass.
 */
class SearchResultFragment : Fragment() {
    lateinit var searchResultRecyclerViewAdapter: SearchResultRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(org.gymball.cpdgt_android.R.layout.fragment_search_result, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setRecyclerView()
    }

    private fun setRecyclerView(){
        var dataList: ArrayList<SearchResultData> = ArrayList()
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))


        searchResultRecyclerViewAdapter = SearchResultRecyclerViewAdapter(activity!!, dataList)
        rv_search_result_list.addItemDecoration(DividerItemDecoration(context, 1))
        rv_search_result_list.adapter = searchResultRecyclerViewAdapter
        rv_search_result_list.layoutManager = LinearLayoutManager(activity)
    }
}
