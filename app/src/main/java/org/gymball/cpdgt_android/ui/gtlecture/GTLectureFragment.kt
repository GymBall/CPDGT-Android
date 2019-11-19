package org.gymball.cpdgt_android.ui.gtlecture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_gt_mylecture.*
import kotlinx.android.synthetic.main.fragment_space_rent.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.spacerent.SpaceRentData
import org.gymball.cpdgt_android.ui.spacerent.SpaceRentRvAdapter

class GTLectureFragment : Fragment(){
    lateinit var GTLecRvAdapter: GTLecRvAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View?{
        return inflater.inflate(R.layout.fragment_space_rent, container, false)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        var datalist:ArrayList<GTLecture> = ArrayList()

        datalist.add(GTLecture("태권도 초급반", "화, 목 8시 30분", "3.5", "5", "2", R.drawable.basic_taekwon))
        datalist.add(GTLecture("태권도 중급반", "화, 목 8시 30분", "3.5", "6", "4", R.drawable.basic_taekwon))
        datalist.add(GTLecture("태권도 고급반", "화, 목 8시 30분", "3.5", "3", "1", R.drawable.basic_taekwon))
        datalist.add(GTLecture("태권도 대회준비반", "화, 목 8시 30분", "3.5", "2", "1", R.drawable.basic_taekwon))

        GTLecRvAdapter = GTLecRvAdapter(activity!!, datalist, 4)
        recycler_spaceview.adapter = GTLecRvAdapter
        recycler_spaceview.layoutManager = LinearLayoutManager(activity!!, LinearLayoutManager.VERTICAL, false)

    }

}