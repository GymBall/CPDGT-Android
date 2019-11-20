package org.gymball.cpdgt_android.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.MainActivity


class SearchFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val transaction: FragmentTransaction = (context as MainActivity).supportFragmentManager.beginTransaction()
        transaction.add(R.id.fl_frag_search, SearchMainFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}

