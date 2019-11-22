package org.gymball.cpdgt_android.util

import okhttp3.RequestBody
import org.gymball.cpdgt_android.model.PostLoginResponse
import retrofit2.Call
import retrofit2.http.*

interface NetworkService {

    //로그인
    @Multipart
    @POST("/account_login.php")
    fun postLoginResponse(
        @Part("id") id: RequestBody
    ): Call<PostLoginResponse> //form-data의 경우 requestbody로 보내서 parsing해서 서버로 보낸다
}