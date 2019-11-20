package org.gymball.cpdgt_android.ui.lecture

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_lecture_comment.*
import org.gymball.cpdgt_android.R

class LectureCommentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture_comment)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        iv_act_lecture_comment_score1.setOnClickListener {
            iv_act_lecture_comment_score1.isSelected = !iv_act_lecture_comment_score1.isSelected
        }
        iv_act_lecture_comment_score2.setOnClickListener {
            iv_act_lecture_comment_score2.isSelected = !iv_act_lecture_comment_score2.isSelected
        }
        iv_act_lecture_comment_score3.setOnClickListener {
            iv_act_lecture_comment_score3.isSelected = !iv_act_lecture_comment_score3.isSelected
        }
        iv_act_lecture_comment_score4.setOnClickListener {
            iv_act_lecture_comment_score4.isSelected = !iv_act_lecture_comment_score4.isSelected
        }
        iv_act_lecture_comment_score5.setOnClickListener {
            iv_act_lecture_comment_score5.isSelected = !iv_act_lecture_comment_score5.isSelected
        }

        btn_act_lecture_comment_back.setOnClickListener{
            finish()
        }
        btn_act_lecture_comment_close.setOnClickListener {
            finish()
        }
        btn_act_lecture_comment_confirm.setOnClickListener {
            finish()
        }
    }
}
