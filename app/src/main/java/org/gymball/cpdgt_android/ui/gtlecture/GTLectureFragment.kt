package org.gymball.cpdgt_android.ui.gtlecture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import kotlinx.android.synthetic.main.fragment_gt_mylecture.*
import kotlinx.android.synthetic.main.fragment_space_rent.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.spacerent.SpaceRentData
import org.gymball.cpdgt_android.ui.spacerent.SpaceRentRvAdapter

class GTLectureFragment : Fragment(){
    lateinit var GTLecRvAdapter: GTLecRvAdapter

    var datalist:ArrayList<GTLecture> = arrayListOf(
        GTLecture("태권도 초급반", "화, 목 8시 30분", "3.5", "5", "2", R.drawable.basic_taekwon),
        GTLecture("태권도 중급반", "화, 목 8시 30분", "3.5", "6", "4", R.drawable.basic_taekwon),
        GTLecture("태권도 고급반", "화, 목 8시 30분", "3.5", "3", "1", R.drawable.basic_taekwon),
    GTLecture("태권도 대회준비반", "화, 목 8시 30분", "3.5", "2", "1", R.drawable.basic_taekwon))

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View?{
        return inflater.inflate(R.layout.fragment_gt_mylecture, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
        setView()
        //setOnClickListener()
        val snapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recycler_view)
    }

    private fun setOnClickListener() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun setView() {
        num_of_lec.text = datalist.size.toString()
    }

    private fun setRecyclerView() {
        GTLecRvAdapter = GTLecRvAdapter(activity!!, datalist, datalist.size)
        recycler_view.adapter = GTLecRvAdapter
        recycler_view.layoutManager = LinearLayoutManager(activity!!, LinearLayoutManager.VERTICAL, false)

    }

}