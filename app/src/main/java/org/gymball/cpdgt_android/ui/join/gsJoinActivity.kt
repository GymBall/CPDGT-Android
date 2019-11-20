package org.gymball.cpdgt_android.ui.join

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gs_join.*
import org.gymball.cpdgt_android.R

class gsJoinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gs_join)
        btn_join.setOnClickListener {
            finish()
        }
    }
}
