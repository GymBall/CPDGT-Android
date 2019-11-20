package org.gymball.cpdgt_android.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import org.gymball.cpdgt_android.ui.search.SearchFragment

class HomeDetailPagerAdapter (fm : FragmentManager, val fragmentCount : Int): FragmentStatePagerAdapter(fm){

    override fun getItem(position:Int): Fragment{

        when(position){
            0-> return HomeDetailWhole()
            1-> return HomeDetailWhole()
            2-> return HomeDetailWhole()
            3-> return HomeDetailWhole()
            4-> return HomeDetailWhole()
            5-> return HomeDetailWhole()
            6-> return HomeDetailWhole()
            7-> return HomeDetailWhole()
            8-> return HomeDetailWhole()
            else -> return HomeDetailWhole()
        }
    }

    override fun getCount(): Int = fragmentCount
}