package org.gymball.cpdgt_android.ui.lecturedetail

import android.app.Activity
import android.graphics.Color
import android.graphics.Typeface
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_lecture_detail.*
import kotlinx.android.synthetic.main.tab_lecture_detail_activity.*
import org.gymball.cpdgt_android.R
import org.jetbrains.anko.startActivity

class LectureDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LectureClass.act = this@LectureDetailActivity
        setContentView(R.layout.activity_lecture_detail)
        setStatusBarTransparent()

        viewInit()
        setOnClickListener()
    }

    class LectureClass{
        companion object {
            var act: Activity? = null
        }
    }

    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = window
        val winParams = win.attributes
        if (on) {
            winParams.flags = winParams.flags or bits
            return
        }
        winParams.flags = winParams.flags and bits.inv()
        win.attributes = winParams
    }

    private fun setStatusBarTransparent() {
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
        if (Build.VERSION.SDK_INT >= 21) {
            window.statusBarColor = Color.TRANSPARENT
        }
    }

    private fun viewInit() {
        vp_act_lecture_detail_pager.apply {
            adapter = LectureDetailTabFragmentStatePagerAdapter(supportFragmentManager, 2)
            offscreenPageLimit = 2
        }

        tl_act_lecture_detail_top_bar.setupWithViewPager(vp_act_lecture_detail_pager, true)

        val tabLayout: View = this.layoutInflater.inflate(R.layout.tab_lecture_detail_activity, null, false)
        tl_act_lecture_detail_top_bar.getTabAt(0)!!.customView = tabLayout.findViewById(R.id.btn_tab_lecture_detail_class)
        tl_act_lecture_detail_top_bar.getTabAt(1)!!.customView = tabLayout.findViewById(R.id.btn_tab_lecture_detail_teacher)
        tl_act_lecture_detail_top_bar.addOnTabSelectedListener(object: TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) {
                selectedLectureDetailTab(position = tab!!.position)
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                selectedLectureDetailTab(position = tab!!.position)
            }

            override fun onTabSelected(tab: TabLayout.Tab?) {
                selectedLectureDetailTab(position = tab!!.position)
            }
        })
    }

    private fun selectedLectureDetailTab(position:Int) {
        if(position==0) {
            tv_tl_lecture_detail_class.setTextColor(resources.getColor(R.color.colorBlack))
            tv_tl_lecture_detail_teacher.setTextColor(resources.getColor(R.color.gtmodeDefault))
            tv_tl_lecture_detail_class.typeface = Typeface.createFromAsset(assets,"font/nanumsquare_bold.ttf")
            tv_tl_lecture_detail_teacher.typeface = Typeface.createFromAsset(assets,"font/nanumsquare_regular.ttf")
        } else {
            tv_tl_lecture_detail_class.setTextColor(resources.getColor(R.color.gtmodeDefault))
            tv_tl_lecture_detail_teacher.setTextColor(resources.getColor(R.color.colorBlack))
            tv_tl_lecture_detail_class.typeface = Typeface.createFromAsset(assets,"font/nanumsquare_regular.ttf")
            tv_tl_lecture_detail_teacher.typeface = Typeface.createFromAsset(assets,"font/nanumsquare_bold.ttf")

        }
    }

    private fun setOnClickListener() {
        btn_act_lecture_detail_back.setOnClickListener {
            finish()
        }
        btn_act_lecture_detail_inquire.setOnClickListener {
            startActivity<ChatActivity>()
        }
    }
}
