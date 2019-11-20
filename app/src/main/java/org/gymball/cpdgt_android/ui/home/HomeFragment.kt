package org.gymball.cpdgt_android.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.MainActivity


class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val transaction: FragmentTransaction = (context as MainActivity).supportFragmentManager.beginTransaction()
        transaction.add(R.id.fl_frag_home, HomeMainFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
