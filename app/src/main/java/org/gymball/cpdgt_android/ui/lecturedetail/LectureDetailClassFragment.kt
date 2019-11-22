package org.gymball.cpdgt_android.ui.lecturedetail


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_lecture_detail_class.*
import org.gymball.cpdgt_android.R

class LectureDetailClassFragment : Fragment() {
    var summary : String? = null
    companion object {
        var instance : LectureDetailClassFragment = LectureDetailClassFragment()
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lecture_detail_class, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var sum = instance.summary

        tv_frag_lecture_detail_class_summary.text = sum
    }
}
