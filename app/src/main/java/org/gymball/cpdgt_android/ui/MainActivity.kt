package org.gymball.cpdgt_android.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_gtmain.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_gt_mylecture.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.GTMode.GTModeActivity
import org.gymball.cpdgt_android.ui.GTMode.GTModeTabFragmentStatePagerAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MainClass.act = this@MainActivity
        setContentView(R.layout.activity_gtmain)
        // val nextIntent = Intent(this, GTModeActivity::class.java)
        // startActivity(nextIntent)

        viewInit()


    }


    class MainClass{
        companion object {
            var act: Activity? = null
        }
    }

    private fun viewInit() {
        vp_act_gtmode_pager.apply{
            adapter = MainTabFragmentStatePagerAdapter(supportFragmentManager, 2)
            offscreenPageLimit = 2
        }


        tl_act_gtmode_top_bar.setupWithViewPager(vp_act_gtmode_pager, true)

        val tabLayout: View = this.layoutInflater.inflate(R.layout.tab_gtmode, null, false)
        tl_act_gtmode_top_bar.getTabAt(0)!!.customView = tabLayout.findViewById(R.id.btn_tab_gtmode_my)
        tl_act_gtmode_top_bar.getTabAt(1)!!.customView = tabLayout.findViewById(R.id.btn_tab_gtmode_space)

    }

}
