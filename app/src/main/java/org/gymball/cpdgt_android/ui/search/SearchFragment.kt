package org.gymball.cpdgt_android.ui.search


import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.android.synthetic.main.fragment_search.view.*
import kotlinx.android.synthetic.main.fragment_search_result.*
import kotlinx.android.synthetic.main.fragment_search_result.search_view

import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.MainActivity
import org.jetbrains.anko.support.v4.startActivity



class SearchFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(org.gymball.cpdgt_android.R.layout.fragment_search, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?){
        super.onActivityCreated(savedInstanceState)
        setOnClickListener()
    }

    private fun setOnClickListener(){

           search_view.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
               if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                   (activity as MainActivity).replaceFragment(SearchResultFragment())
                   return@OnKeyListener true
               }
               false
           })
       }

}

