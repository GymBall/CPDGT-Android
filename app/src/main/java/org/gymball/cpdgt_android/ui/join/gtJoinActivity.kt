package org.gymball.cpdgt_android.ui.join

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gt_join.*
import kotlinx.android.synthetic.main.activity_gt_join2.*
import kotlinx.android.synthetic.main.activity_join3.*
import kotlinx.android.synthetic.main.activity_join3.btn_finish
import org.gymball.cpdgt_android.R

class gtJoinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gt_join)
        btn_next.setOnClickListener {
            setContentView(R.layout.activity_gt_join2)
            btn_finish.setOnClickListener {
                finish()
            }
        }
    }
}
