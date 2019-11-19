package org.gymball.cpdgt_android.ui.gtmode

import android.app.Activity
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gtmode.*
import kotlinx.android.synthetic.main.tab_gtmode.*
import org.gymball.cpdgt_android.R

class GTModeActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        GTModeClass.act = this@GTModeActivity
        setContentView(R.layout.activity_gtmode)
        //setStatusBarTransparent()

        viewInit()
        //setOnClickListener()
    }
    class GTModeClass {
        companion object{
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

    private fun setOnClickListener() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun viewInit() {
        vp_act_gtmode_pager.adapter = GTModeTabFragmentStatePagerAdapter(supportFragmentManager, 2)
        tl_act_gtmode_top_bar.setupWithViewPager(vp_act_gtmode_pager, true)

        val tabLayout: View = this.layoutInflater.inflate(R.layout.tab_gtmode, null, false)
        tl_act_gtmode_top_bar.getTabAt(0)!!.customView = tabLayout.findViewById(R.id.btn_tab_gtmode_my)
        tl_act_gtmode_top_bar.getTabAt(1)!!.customView = tabLayout.findViewById(R.id.btn_tab_gtmode_space)



    }


    private fun selectedGTModeTab(position: Int){
        if(position==0) {

            tv_tl_gtmode_my.setTextColor(resources.getColor(R.color.colorBlack))
            tv_tl_gtmode_space.setTextColor(resources.getColor(R.color.gtmodeDefault))
            //tv_tl_gtmode_my.typeface = Typeface.createFromAsset(assets,"font/nanumsquare_bold.ttf")
          //  tv_tl_gtmode_space.typeface = Typeface.createFromAsset(assets,"font/nanumsquare_regular.ttf")
        } else {
            tv_tl_gtmode_my.setTextColor(resources.getColor(R.color.gtmodeDefault))
            tv_tl_gtmode_space.setTextColor(resources.getColor(R.color.colorBlack))
          //  tv_tl_gtmode_my.typeface = Typeface.createFromAsset(assets,"font/nanumsquare_regular.ttf")
         //   tv_tl_gtmode_space.typeface = Typeface.createFromAsset(assets,"font/nanumsquare_bold.ttf")

        }
    }

}