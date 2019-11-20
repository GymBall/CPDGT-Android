package org.gymball.cpdgt_android.ui

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import org.gymball.cpdgt_android.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainClass.act = this@MainActivity
        setContentView(R.layout.activity_main)

        viewInit()
    }

    class MainClass{
        companion object {
            var act: Activity? = null
        }
    }

    private fun viewInit() {
        vp_main_act_pager.apply {
            adapter = MainTabFragmentStatePagerAdapter(supportFragmentManager, 4)
            offscreenPageLimit = 4
        }

        tl_main_act_bottom_bar.setupWithViewPager(vp_main_act_pager)

        val tabLayout: View = this.layoutInflater.inflate(R.layout.tab_main_activity, null, false)

        tl_main_act_bottom_bar.getTabAt(0)!!.customView = tabLayout.findViewById(R.id.btn_tab_main_act_home)
        tl_main_act_bottom_bar.getTabAt(1)!!.customView = tabLayout.findViewById(R.id.btn_tab_main_act_search)
        tl_main_act_bottom_bar.getTabAt(2)!!.customView = tabLayout.findViewById(R.id.btn_tab_main_act_lecture)
        tl_main_act_bottom_bar.getTabAt(3)!!.customView = tabLayout.findViewById(R.id.btn_tab_main_act_my)
    }

    fun replaceFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager.beginTransaction()

        fragmentManager.apply{
            replace(R.id.vp_main_act_pager, fragment)
            addToBackStack(null)
        }
        fragmentManager.commit()
    }
}