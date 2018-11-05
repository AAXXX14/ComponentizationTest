package com.example.administrator.componentizationtest

import android.content.Context
import android.widget.Toast

/*
*2018/11/5 0005  15:16
*function by lq
*/
class ShowUtil{

    companion object {
        fun showInfo(context:Context,content:String){
            Toast.makeText(context,content,Toast.LENGTH_LONG).show()
        }
    }
}
