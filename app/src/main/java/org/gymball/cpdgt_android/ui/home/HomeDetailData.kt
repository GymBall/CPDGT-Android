package org.gymball.cpdgt_android.ui.home

import android.graphics.drawable.Drawable

data class HomeDetailData(
    var classimage : Drawable,
    var className : String,
    var gymTeacher : String,
    var gymIndex : String,
    var time : String,
    var summary : String
)
