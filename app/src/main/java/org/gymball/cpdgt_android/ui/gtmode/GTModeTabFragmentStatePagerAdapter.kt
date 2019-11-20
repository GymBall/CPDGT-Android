package org.gymball.cpdgt_android.ui.gtmode


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import org.gymball.cpdgt_android.ui.gtmode.gtlecture.GTLectureFragment
import org.gymball.cpdgt_android.ui.gtmode.gtspacerent.SpaceRentFragment

class GTModeTabFragmentStatePagerAdapter (fm:FragmentManager, private val fragmentCount:Int)  :FragmentStatePagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> return GTLectureFragment()
            1 -> return SpaceRentFragment()
            else -> return GTLectureFragment()

        }
    }

    override fun getCount(): Int = fragmentCount

}