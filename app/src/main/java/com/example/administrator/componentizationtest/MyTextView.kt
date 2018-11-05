package com.example.administrator.componentizationtest

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.support.v7.widget.AppCompatTextView
import android.util.AttributeSet

/*
*2018/10/31 0031  18:32
*Test_MyTextView by lq
*/
class MyTextView @JvmOverloads constructor(context: Context, attributeSet: AttributeSet? = null, defStyleAttr: Int = 0) : AppCompatTextView(context, attributeSet, defStyleAttr) {
    lateinit var content: String
    private var textPaint: Paint = Paint().apply {
        color = Color.YELLOW
    }
    private var linePaint: Paint = Paint().apply {
        color = Color.BLACK
        strokeWidth = 1f
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        content = text.toString()
        canvas?.drawText(content, 100f, 100f, textPaint)
        canvas?.drawLine(0f,0f,200f,10f,linePaint)
    }

}