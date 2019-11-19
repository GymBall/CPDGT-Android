package org.gymball.cpdgt_android.ui.home


import android.app.Activity
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_home_detail.*
import kotlinx.android.synthetic.main.fragment_search_result.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.MainTabFragmentStatePagerAdapter
import org.gymball.cpdgt_android.ui.search.SearchResultData
import org.gymball.cpdgt_android.ui.search.SearchResultRecyclerViewAdapter
import org.jetbrains.anko.find

//adapter = HomeDetailAdapter(myContext.getSupportFragmentManager(), 4)
class HomeDetailFragment : Fragment() {
    lateinit var homeDetailRecyclerViewAdapter : HomeDetailRecyclerViewAdapter

    private val myContext = FragmentActivity()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_detail, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        configureTopNavigation()
    }

    private fun configureTopNavigation(){
        vp_home_detail.adapter = HomeDetailPagerAdapter(childFragmentManager, 9)

        vp_home_detail.offscreenPageLimit = 9
        tl_home_detail_bar.setupWithViewPager(vp_home_detail)

    }


}
