package org.gymball.cpdgt_android.model

data class PostLoginResponse(
    val status: Int,
    val message: String,
    val result: ArrayList<nameData>
)

data class nameData(
    val nickname: String,
    val flag: String
)