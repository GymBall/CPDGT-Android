package org.gymball.cpdgt_android.ui.gtmode.gtlecture

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.dialog_gtendingcheck.*
import org.gymball.cpdgt_android.R
import java.lang.Exception

class GTEndingDialog(context: Context) : Dialog(context), View.OnClickListener {
    override fun onClick(v: View?) {
        try{
            dismiss()
        } catch (e: Exception){
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_gtendingcheck)
        setOnClickListener()
    }

    private fun setOnClickListener() {
        btn_end_yes.setOnClickListener {
            dismiss()
        }
        btn_end_no.setOnClickListener {
            dismiss()
        }
    }
}