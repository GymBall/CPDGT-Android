package org.gymball.cpdgt_android.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import org.gymball.cpdgt_android.ui.search.SearchFragment

class HomeDetailPagerAdapter (fm : FragmentManager, val fragmentCount : Int): FragmentStatePagerAdapter(fm){

    private val fragmentTitleList = mutableListOf("전체", "요가","발레", "태권도", "헬스")

    override fun getItem(position:Int): Fragment{

        when(position){
            0-> return HomeDetailWhole()
            1-> return SearchFragment()
            2-> return SearchFragment()
            3-> return SearchFragment()
            else -> return HomeFragment()
        }
    }

    override fun getPageTitle(position: Int):CharSequence?{
        return fragmentTitleList[position]
    }
    override fun getCount(): Int = fragmentCount
}