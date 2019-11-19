package org.gymball.cpdgt_android.ui.lecturedetail

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.activity_chat.*
import org.gymball.cpdgt_android.R

class ChatActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)
        setOnClickListener()
        setStatusBarTransparent()
    }

    private fun setWindowFlag(bits: Int, on: Boolean) {
        val win = window
        val winParams = win.attributes
        if (on) {
            winParams.flags = winParams.flags or bits
            return
        }
        winParams.flags = winParams.flags and bits.inv()
        win.attributes = winParams
    }

    private fun setStatusBarTransparent() {
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.decorView.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR

        setWindowFlag(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false)
        if (Build.VERSION.SDK_INT >= 21) {
            window.statusBarColor = Color.TRANSPARENT
        }
    }
    private fun setOnClickListener() {
        btn_act_chat_back.setOnClickListener {
            finish()
        }
        btn_act_chat_plus.setOnClickListener {
            val chatdialog = ChatDialog(this)
            chatdialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            chatdialog.setCanceledOnTouchOutside(false)
            chatdialog.show()

            val btn: RelativeLayout = chatdialog.findViewById<RelativeLayout>(R.id.btn_dialog_chat_confirm)
            btn.setOnClickListener {
                tv_act_chat_confirm.visibility = View.VISIBLE
                chatdialog.dismiss()
            }

        }
    }
}
