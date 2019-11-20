package org.gymball.cpdgt_android.ui.lecturedetail

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.dialog_chat.*
import org.gymball.cpdgt_android.R
import java.lang.Exception

class ChatDialog(context: Context) : Dialog(context), View.OnClickListener {
    override fun onClick(v: View?) {
        try{
            dismiss()
        } catch (e: Exception){
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_chat)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_dialog_chat_confirm.setOnClickListener {
            dismiss()
        }
        btn_dialog_chat_deposit.setOnClickListener {
            dismiss()
        }
    }
}
