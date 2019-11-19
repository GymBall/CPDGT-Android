package org.gymball.cpdgt_android.ui.spacerent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_space_rent.*
import org.gymball.cpdgt_android.R

class SpaceRentFragment : Fragment(){

    lateinit var SpaceRentRvAdapter: SpaceRentRvAdapter
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View?{
        return inflater.inflate(R.layout.fragment_space_rent, container, false)

        setRecyclerView()
    }

    private fun setRecyclerView() {
        var datalist:ArrayList<SpaceRentData> = ArrayList()
        datalist.add(SpaceRentData(R.drawable.cp_yoga, "12", "요가 | 발레 | 댄스 | 기타", "청파 요가원 ", "서울시 용산구 청파로 47길 45", "주중 오후 8시이후 사용 가능 | 주말 전시간대 사용가능"))
        datalist.add(SpaceRentData(R.drawable.sm_taekwon,"3", "태권도 | 복싱 ", "숙명 태권도장 ", " 서울특별시 용산구 청파로 45길 45", "주중 오후 4시 이전 사용 가능 | 주말 전시간대 사용 가능"))
        datalist.add(SpaceRentData(R.drawable.hc_swim,"25", "수영 ", "효창 수영장 ", " 서울특별시 용산구 효창로 2길 45", "주중 오후 7시 이후 사용 가능 | 주말 전시간대 사용 가능"))
        datalist.add(SpaceRentData(R.drawable.sm_hall,"54", "댄스 | 복싱 | 기타 ", "숙명여자대학교 다목적관  ", " 서울특별시 용산구 효창로 2길 45", "주중 오후 7시 이후 사용 가능 | 주말 전시간대 사용 가능"))


        SpaceRentRvAdapter = SpaceRentRvAdapter(activity!!, datalist, 4)
        recycler_spaceview.adapter = SpaceRentRvAdapter
        recycler_spaceview.layoutManager = LinearLayoutManager(activity!!, LinearLayoutManager.VERTICAL, false)

    }
}