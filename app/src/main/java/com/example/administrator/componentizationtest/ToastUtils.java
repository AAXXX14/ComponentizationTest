package com.example.administrator.componentizationtest;

import android.content.Context;
import android.widget.Toast;

/*
 *2018/11/6 0006  9:42
 *function by lq
 */
public class ToastUtils {

    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

}

