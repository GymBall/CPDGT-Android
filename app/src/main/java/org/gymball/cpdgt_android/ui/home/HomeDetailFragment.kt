package org.gymball.cpdgt_android.ui.home

import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_home_detail.*
import kotlinx.android.synthetic.main.tab_home_detail_frag.*
import org.gymball.cpdgt_android.R

class HomeDetailFragment : Fragment() {
    var pos : Int = -1
    companion object {
        var instance : HomeDetailFragment = HomeDetailFragment()
    }
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
        val tabLayout: View = this.layoutInflater.inflate(R.layout.tab_home_detail_frag,null)
        tl_home_detail_bar.getTabAt(0)!!.customView = tabLayout.findViewById(R.id.rl_tab_home_detail_frag_whole)
        tl_home_detail_bar.getTabAt(1)!!.customView = tabLayout.findViewById(R.id.rl_tab_home_detail_frag_yoga)
        tl_home_detail_bar.getTabAt(2)!!.customView = tabLayout.findViewById(R.id.rl_tab_home_detail_frag_ballet)
        tl_home_detail_bar.getTabAt(3)!!.customView = tabLayout.findViewById(R.id.rl_tab_home_detail_frag_taekwondo)
        tl_home_detail_bar.getTabAt(4)!!.customView = tabLayout.findViewById(R.id.rl_tab_home_detail_frag_health)
        tl_home_detail_bar.getTabAt(5)!!.customView = tabLayout.findViewById(R.id.rl_tab_home_detail_frag_dance)
        tl_home_detail_bar.getTabAt(6)!!.customView = tabLayout.findViewById(R.id.rl_tab_home_detail_frag_swim)
        tl_home_detail_bar.getTabAt(7)!!.customView = tabLayout.findViewById(R.id.rl_tab_home_detail_frag_boxing)
        tl_home_detail_bar.getTabAt(8)!!.customView = tabLayout.findViewById(R.id.rl_tab_home_detail_frag_etc)
        tl_home_detail_bar.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
                selectedHomeDetailTab(position = tab!!.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                selectedHomeDetailTab(position = tab!!.position)
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                selectedHomeDetailTab(position = tab!!.position)
            }
        })


        pos = instance.pos
        tl_home_detail_bar.getTabAt(pos)!!.select()
    }

    private fun selectedHomeDetailTab(position:Int) {
        if(position == 0) {
            tv_tab_home_Detail_frag_whole.setTextColor(resources.getColor(R.color.colorPrimary))
            tv_tab_home_Detail_frag_yoga.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_ballet.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_taekwondo.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_health.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_dance.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_swim.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_boxing.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_etc.setTextColor(resources.getColor(R.color.homedetaildefault))

            tv_tab_home_Detail_frag_whole.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_bold.ttf")
            tv_tab_home_Detail_frag_yoga.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_ballet.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_taekwondo.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_health.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_dance.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_swim.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_boxing.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_etc.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
        } else if(position == 1) {
            tv_tab_home_Detail_frag_whole.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_yoga.setTextColor(resources.getColor(R.color.colorPrimary))
            tv_tab_home_Detail_frag_ballet.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_taekwondo.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_health.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_dance.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_swim.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_boxing.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_etc.setTextColor(resources.getColor(R.color.homedetaildefault))

            tv_tab_home_Detail_frag_whole.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_yoga.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_bold.ttf")
            tv_tab_home_Detail_frag_ballet.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_taekwondo.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_health.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_dance.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_swim.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_boxing.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_etc.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
        } else if(position == 2) {
            tv_tab_home_Detail_frag_whole.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_yoga.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_ballet.setTextColor(resources.getColor(R.color.colorPrimary))
            tv_tab_home_Detail_frag_taekwondo.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_health.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_dance.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_swim.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_boxing.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_etc.setTextColor(resources.getColor(R.color.homedetaildefault))

            tv_tab_home_Detail_frag_whole.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_yoga.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_ballet.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_bold.ttf")
            tv_tab_home_Detail_frag_taekwondo.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_health.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_dance.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_swim.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_boxing.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_etc.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
        } else if(position == 3) {
            tv_tab_home_Detail_frag_whole.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_yoga.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_ballet.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_taekwondo.setTextColor(resources.getColor(R.color.colorPrimary))
            tv_tab_home_Detail_frag_health.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_dance.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_swim.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_boxing.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_etc.setTextColor(resources.getColor(R.color.homedetaildefault))

            tv_tab_home_Detail_frag_whole.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_yoga.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_ballet.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_taekwondo.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_bold.ttf")
            tv_tab_home_Detail_frag_health.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_dance.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_swim.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_boxing.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_etc.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
        } else if(position == 4) {
            tv_tab_home_Detail_frag_whole.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_yoga.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_ballet.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_taekwondo.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_health.setTextColor(resources.getColor(R.color.colorPrimary))
            tv_tab_home_Detail_frag_dance.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_swim.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_boxing.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_etc.setTextColor(resources.getColor(R.color.homedetaildefault))

            tv_tab_home_Detail_frag_whole.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_yoga.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_ballet.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_taekwondo.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_health.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_bold.ttf")
            tv_tab_home_Detail_frag_dance.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_swim.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_boxing.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_etc.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
        } else if(position == 5) {
            tv_tab_home_Detail_frag_whole.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_yoga.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_ballet.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_taekwondo.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_health.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_dance.setTextColor(resources.getColor(R.color.colorPrimary))
            tv_tab_home_Detail_frag_swim.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_boxing.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_etc.setTextColor(resources.getColor(R.color.homedetaildefault))

            tv_tab_home_Detail_frag_whole.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_yoga.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_ballet.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_taekwondo.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_health.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_dance.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_bold.ttf")
            tv_tab_home_Detail_frag_swim.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_boxing.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_etc.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
        } else if(position == 6) {
            tv_tab_home_Detail_frag_whole.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_yoga.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_ballet.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_taekwondo.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_health.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_dance.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_swim.setTextColor(resources.getColor(R.color.colorPrimary))
            tv_tab_home_Detail_frag_boxing.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_etc.setTextColor(resources.getColor(R.color.homedetaildefault))

            tv_tab_home_Detail_frag_whole.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_yoga.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_ballet.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_taekwondo.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_health.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_dance.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_swim.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_bold.ttf")
            tv_tab_home_Detail_frag_boxing.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_etc.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
        } else if(position == 7) {
            tv_tab_home_Detail_frag_whole.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_yoga.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_ballet.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_taekwondo.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_health.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_dance.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_swim.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_boxing.setTextColor(resources.getColor(R.color.colorPrimary))
            tv_tab_home_Detail_frag_etc.setTextColor(resources.getColor(R.color.homedetaildefault))

            tv_tab_home_Detail_frag_whole.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_yoga.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_ballet.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_taekwondo.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_health.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_dance.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_swim.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_boxing.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_bold.ttf")
            tv_tab_home_Detail_frag_etc.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
        } else if(position == 8) {
            tv_tab_home_Detail_frag_whole.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_yoga.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_ballet.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_taekwondo.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_health.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_dance.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_swim.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_boxing.setTextColor(resources.getColor(R.color.homedetaildefault))
            tv_tab_home_Detail_frag_etc.setTextColor(resources.getColor(R.color.colorPrimary))

            tv_tab_home_Detail_frag_whole.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_yoga.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_ballet.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_taekwondo.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_health.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_dance.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_swim.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_boxing.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_regular.ttf")
            tv_tab_home_Detail_frag_etc.typeface = Typeface.createFromAsset(activity!!.assets,"font/nanumsquare_bold.ttf")
        }
    }
}
