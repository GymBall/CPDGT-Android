package org.gymball.cpdgt_android.ui.login

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_login.*
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.ui.MainActivity
import org.gymball.cpdgt_android.ui.join.JoinActivity
import org.jetbrains.anko.startActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setOnEditorActionListener()
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

    private fun setOnEditorActionListener() {
        et_act_login_id.setOnEditorActionListener { v, actionId, event ->
            if(actionId== EditorInfo.IME_ACTION_DONE){
                val imm = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(et_act_login_pw.windowToken,0)
                return@setOnEditorActionListener true
            } else {
                return@setOnEditorActionListener false
            }
        }
    }
}
