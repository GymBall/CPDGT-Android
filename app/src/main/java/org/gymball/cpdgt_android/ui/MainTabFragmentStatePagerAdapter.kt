package org.gymball.cpdgt_android.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import org.gymball.cpdgt_android.ui.home.HomeFragment
import org.gymball.cpdgt_android.ui.lecture.LectureFragment
import org.gymball.cpdgt_android.ui.my.MyFragment
import org.gymball.cpdgt_android.ui.search.SearchFragment
import org.gymball.cpdgt_android.ui.search.SearchResultFragment

class MainTabFragmentStatePagerAdapter (fm: FragmentManager, private val fragmentCount: Int) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return HomeFragment()
            1 -> return SearchFragment()
            2 -> return LectureFragment()
            3 -> return MyFragment()
            else -> return HomeFragment()
        }
    }

    override fun getCount(): Int = fragmentCount
}