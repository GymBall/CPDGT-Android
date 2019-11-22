package org.gymball.cpdgt_android.ui.login

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import okhttp3.MediaType
import okhttp3.RequestBody
import org.gymball.cpdgt_android.R
import org.gymball.cpdgt_android.model.PostLoginResponse
import org.gymball.cpdgt_android.ui.MainActivity
import org.gymball.cpdgt_android.ui.join.gsJoinActivity
import org.gymball.cpdgt_android.ui.join.gtJoinActivity
import org.gymball.cpdgt_android.util.ApplicationController
import org.gymball.cpdgt_android.util.NetworkService
import org.gymball.cpdgt_android.util.User
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class LoginActivity : AppCompatActivity() {

    var user_id: String = ""
    //var user_pw: String = ""
    //var jsonObject = JSONObject()

    val networkService: NetworkService by lazy {
        ApplicationController.instance.networkService
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setOnEditorActionListener()
        setOnClickListener()
    }

    private fun setOnClickListener() {
        loginButton.setOnClickListener {
            user_id = et_act_login_id.text.toString()
            postLoginResponse()
        }
        GTJoinButton.setOnClickListener {
            startActivity<gtJoinActivity>() //짐선생 조인으로 수정하기
        }
        GSJoinButton.setOnClickListener {
            startActivity<gsJoinActivity>() //짐학생 조인으로 수정하기
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

    private fun postLoginResponse() {
        val id:RequestBody = RequestBody.create(MediaType.parse("text/plain"),user_id)
        val postLoginResponse = networkService.postLoginResponse(id)
        postLoginResponse.enqueue(object : Callback<PostLoginResponse> {
            override fun onFailure(call: Call<PostLoginResponse>, t: Throwable) {
                Log.e("postLogin_Fail", t.toString())
            }
            override fun onResponse(call: Call<PostLoginResponse>, response: Response<PostLoginResponse>) {
                if(response.isSuccessful) {
                    Log.d("postLogin_Response",response.body().toString())
                    val name: String = response.body()!!.result[0].nickname
                    val flag: Int = Integer.parseInt(response.body()!!.result[0].flag)
                    User.nickname = name
                    User.flag = flag
                    startActivity<MainActivity>()
                    toast("로그인 성공!")
                    finish()
                } else {
                    Log.e("postLogin_Response",response.body().toString())
                }
            }
        })
    }
}
