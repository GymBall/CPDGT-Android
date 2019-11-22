package org.gymball.cpdgt_android.ui.home


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.fragment_home_main.*

import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.HomeImageData
import org.gymball.cpdgt_android.ui.MainActivity
import org.gymball.cpdgt_android.ui.gtmode.GTModeActivity
import org.jetbrains.anko.support.v4.startActivity

class HomeMainFragment : Fragment() {

    lateinit var homeRecyclerViewAdapter : HomeRecyclerViewAdapter
    var pos : Int = -1

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_main, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setOnClickListener()
        setRecyclerView()
    }

    private fun setRecyclerView(){
        var dataList : ArrayList<HomeImageData> = ArrayList()
        dataList.add(HomeImageData(getResources().getDrawable(R.drawable.home_image1)!!))
        dataList.add(HomeImageData(getResources().getDrawable(R.drawable.home_image2)!!))
        dataList.add(HomeImageData(getResources().getDrawable(R.drawable.home_image3)!!))

        homeRecyclerViewAdapter = HomeRecyclerViewAdapter(activity!!, dataList)
        rv_home_image.adapter = homeRecyclerViewAdapter
        rv_home_image.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)


        val snapHelper: LinearSnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(rv_home_image)
        rv_home_image.addItemDecoration(LinePagerIndicatorDecoration())

        //rv_home_image.adapter.getItemId(0)


    }

    private fun setOnClickListener(){
        whole_btn.setOnClickListener{
            pos = 0
            replaceFragment(pos)

        }
        yoga_btn.setOnClickListener {
            pos = 1
            replaceFragment(pos)
        }
        ballet_btn.setOnClickListener {
            pos = 2
            replaceFragment(pos)
        }
        taekwondo_btn.setOnClickListener {
            pos = 3
            replaceFragment(pos)
        }
        health_btn.setOnClickListener {
            pos = 4
            replaceFragment(pos)
        }
        dance_btn.setOnClickListener {
            pos = 5
            replaceFragment(pos)
        }
        swim_btn.setOnClickListener {
            pos = 6
            replaceFragment(pos)
        }
        boxing_btn.setOnClickListener {
            pos = 7
            replaceFragment(pos)
        }
        etc_btn.setOnClickListener {
            pos = 8
            replaceFragment(pos)
        }
        btn_gt_mode.setOnClickListener {
            startActivity<GTModeActivity>()
        }
    }

    private fun replaceFragment(pos:Int) {
        val transaction: FragmentTransaction = (context as MainActivity).supportFragmentManager.beginTransaction()
        transaction.add(R.id.fl_frag_home, HomeDetailFragment())
        transaction.addToBackStack(null)
        transaction.commit()
        HomeDetailFragment.instance.pos = pos
    }

}
