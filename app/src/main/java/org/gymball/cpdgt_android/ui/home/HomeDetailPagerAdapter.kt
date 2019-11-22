package org.gymball.cpdgt_android.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import org.gymball.cpdgt_android.ui.home.homedetail.*

class HomeDetailPagerAdapter (fm : FragmentManager, val fragmentCount : Int): FragmentStatePagerAdapter(fm){

    override fun getItem(position:Int): Fragment{

        when(position){
            0-> return HomeDetailWholeFragment()
            1-> return HomeDetailYogaFragment()
            2-> return HomeDetailBalletFragment()
            3-> return HomeDetailTaekwondoFragment()
            4-> return HomeDetailHealthFragment()
            5-> return HomeDetailDanceFragment()
            6-> return HomeDetailSwimFragment()
            7-> return HomeDetailBoxingFragment()
            8-> return HomeDetailEtcFragment()
            else -> return HomeDetailWholeFragment()
        }
    }

    override fun getCount(): Int = fragmentCount
}