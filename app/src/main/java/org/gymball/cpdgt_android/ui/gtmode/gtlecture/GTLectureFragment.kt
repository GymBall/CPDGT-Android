package org.gymball.cpdgt_android.ui.gtmode.gtlecture

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_gtlecture.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.GTLectureData
import org.jetbrains.anko.support.v4.startActivity

class GTLectureFragment : Fragment(){
    lateinit var GTLecRvAdapter: GTLecRvAdapter

    var datalist:ArrayList<GTLectureData> = arrayListOf(
        GTLectureData("태권도 초급반", "화, 목 8시 30분", "3.5", "5", "2", R.drawable.basic_taekwon),
        GTLectureData("태권도 중급반", "화, 목 8시 30분", "3.5", "6", "4", R.drawable.basic_taekwon),
        GTLectureData("태권도 고급반", "화, 목 8시 30분", "3.5", "3", "1", R.drawable.basic_taekwon),
        GTLectureData("태권도 대회준비반", "화, 목 8시 30분", "3.5", "2", "1", R.drawable.basic_taekwon),
        GTLectureData("요가 초급반", "월, 수 오후 9시", "5", "10", "5", R.drawable.bliss_ad))

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View?{
        return inflater.inflate(R.layout.fragment_gtlecture, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setRecyclerView()
        setView()
        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_frag_gtlecture_new_lecture.setOnClickListener {
            startActivity<GTLectureNewActivity>()
        }
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