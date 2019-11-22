package org.gymball.cpdgt_android.model

data class LectureListData(
    val background: Int,
    val teacher_img: Int,
    val class_name: String,
    val teacher_name: String,
    var gymIndex : String?,
    val class_time: String,
    val summary: String,
    val ment1: String,
    val ment2: String
)