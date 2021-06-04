package com.example.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class EmotionalFaceView : View {
    private lateinit var mPaint : Paint
    // them trong code
    constructor(context: Context) : super(context){
        initDraw()
    }

    // them trong xml
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs){
        initDraw()
    }

    // them code,xml voi style attribute
    constructor(context: Context, attr: AttributeSet, defStyleAttr: Int) : super(context,attr,defStyleAttr){
        initDraw()
    }

    constructor(context: Context, attr: AttributeSet, defStyleAttr: Int, defStyleRes: Int) : super(context,attr,defStyleAttr,defStyleRes){
        initDraw()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        //canvas?.drawPoint(100F,200F,mPaint)
       //canvas?.drawPoints(floatArrayOf(50F,100F,120F,150F,200F,300F),mPaint)
        //canvas?.drawLine(100F,50F,200F,50F,mPaint)
        val width = 200f
        val height = 400f
        val left = (getWidth() - width) / 2.0f
        val top = (getHeight() - height) / 2.0f
        canvas!!.drawRect(left, top, left + width, top + height, mPaint)

    }

    private fun initDraw(){
        mPaint = Paint(Paint.ANTI_ALIAS_FLAG)
        mPaint.color = Color.BLUE
        mPaint.strokeWidth = 30F
    }
}