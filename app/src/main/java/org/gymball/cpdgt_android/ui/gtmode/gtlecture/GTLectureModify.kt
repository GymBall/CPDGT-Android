package org.gymball.cpdgt_android.ui.gtmode.gtlecture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gtlecture_modify.*
import org.gymball.cpdgt_android.R

class GTLectureModify : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gtlecture_modify)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_change_intro_yes.setOnClickListener{
            finish()
        }
    }
}
