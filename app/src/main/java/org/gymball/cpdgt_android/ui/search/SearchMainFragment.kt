package org.gymball.cpdgt_android.ui.search


import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import kotlinx.android.synthetic.main.fragment_search_main.*
import kotlinx.android.synthetic.main.fragment_search_result.*
import kotlinx.android.synthetic.main.fragment_search_result.search_view
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.MainActivity

class SearchMainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search_main, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?){
        super.onActivityCreated(savedInstanceState)
        setOnClickListener()
    }

    private fun setOnClickListener(){
        search_view.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_DOWN) {
                val transaction: FragmentTransaction = (context as MainActivity).supportFragmentManager.beginTransaction()
                transaction.add(R.id.fl_frag_search, SearchResultFragment())
                transaction.addToBackStack(null)
                transaction.commit()
                SearchResultFragment.instance.search_object = search_view.text.toString()
                return@OnKeyListener true
            }
            false
        })

        btn_frag_search_main_taekwondo.setOnClickListener {
            val transaction: FragmentTransaction = (context as MainActivity).supportFragmentManager.beginTransaction()
            transaction.add(R.id.fl_frag_search, SearchResultFragment())
            transaction.addToBackStack(null)
            transaction.commit()
            SearchResultFragment.instance.search_object = "태권도"

        }
    }
}
