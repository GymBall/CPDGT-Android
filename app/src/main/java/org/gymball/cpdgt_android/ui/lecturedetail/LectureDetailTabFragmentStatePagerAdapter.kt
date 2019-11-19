package org.gymball.cpdgt_android.ui.lecturedetail

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class LectureDetailTabFragmentStatePagerAdapter (fm: FragmentManager, private val fragmentCount: Int) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> return LectureDetailClassFragment()
            1 -> return LectureDetailTeacherFragment()
            else -> return LectureDetailClassFragment()
        }
    }

    override fun getCount(): Int = fragmentCount
}