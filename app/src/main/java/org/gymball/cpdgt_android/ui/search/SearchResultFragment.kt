package org.gymball.cpdgt_android.ui.search


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_search_result.*
import androidx.recyclerview.widget.DividerItemDecoration
import org.gymball.cpdgt_android.R

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
        setRecyclerView()
    }

    private fun setView() {
        search_view.setText(instance.search_object)

    }

    private fun setRecyclerView(){
        var dataList: ArrayList<SearchResultData> = ArrayList()
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        dataList.add(SearchResultData(getResources().getDrawable(R.drawable.search_result_image)!!, "태권도 초급반", "이대훈 짐선생", "3.5", "화,목 오후 8시"))
        tv_frag_search_result_num.text = dataList.size.toString()+"건"

        searchResultRecyclerViewAdapter = SearchResultRecyclerViewAdapter(activity!!, dataList)
        //rv_search_result_list.addItemDecoration(DividerItemDecoration(context, 1))
        rv_search_result_list.adapter = searchResultRecyclerViewAdapter
        rv_search_result_list.layoutManager = LinearLayoutManager(activity)
    }
}
