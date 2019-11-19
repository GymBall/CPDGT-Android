package org.gymball.cpdgt_android.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import androidx.recyclerview.widget.PagerSnapHelper
import android.R
import org.gymball.cpdgt_android.ui.MainActivity


class HomeFragment : Fragment() {
    lateinit var HomeRecyclerViewAdapter : HomeRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(org.gymball.cpdgt_android.R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setOnClickListener()
        setRecyclerView()
    }

    private fun setRecyclerView(){
        var dataList : ArrayList<HomeImageData> = ArrayList()
        dataList.add(HomeImageData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.home_image1)!!))
        dataList.add(HomeImageData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.home_image2)!!))
        dataList.add(HomeImageData(getResources().getDrawable(org.gymball.cpdgt_android.R.drawable.home_image3)!!))

        HomeRecyclerViewAdapter = HomeRecyclerViewAdapter(activity!!, dataList)
        rv_home_image.adapter = HomeRecyclerViewAdapter
        rv_home_image.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(rv_home_image)
        rv_home_image.addItemDecoration(LinePagerIndicatorDecoration())
    }

    private fun setOnClickListener(){
        whole_btn.setOnClickListener{
            (activity as MainActivity).replaceFragment(HomeDetailWhole())
        }
    }

}
