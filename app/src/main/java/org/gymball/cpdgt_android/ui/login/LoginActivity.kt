package org.gymball.cpdgt_android.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.MainActivity
import org.gymball.cpdgt_android.ui.join.JoinActivity
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setOnClickListener()
    }

    private fun setOnClickListener() {
        loginButton.setOnClickListener {
            startActivity<MainActivity>()
        }
        GTJoinButton.setOnClickListener {
            startActivity<JoinActivity>() //짐선생 조인으로 수정하기
        }
        GSJoinButton.setOnClickListener {
            startActivity<JoinActivity>() //짐학생 조인으로 수정하기
        }
    }
}
