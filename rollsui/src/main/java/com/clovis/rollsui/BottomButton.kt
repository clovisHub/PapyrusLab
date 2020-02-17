package com.clovis.rollsui

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.widget.Button

public class BottomButton : Button {

    constructor(context: Context) : super(context)

    constructor(context: Context, attributeSet: AttributeSet?): super(context, attributeSet)

    constructor(context: Context, attributeSet: AttributeSet?, defStyle : Int)
            : super(context, attributeSet, defStyle) {

           init(context, attributeSet, defStyle)
    }

    private fun init (context: Context, attrs: AttributeSet?, defStyle: Int) {
            inflate(context, R.layout.lower_button, null)
        var drawable : Int = R.color.black
        var title : String? =""
        var translate : Int= R.color.button_dark
        val attributes = context.theme
            .obtainStyledAttributes(attrs, R.styleable.customButton, defStyle, 0)
        try {
            drawable = attributes.getInteger(R.styleable.customButton_imageType, R.color.black)
            title = attributes.getString(R.styleable.customButton_textContent)!!
            translate = attributes.getInteger(R.styleable.customButton_textColor, R.color.button_dark)

        } catch (exc: Exception) { }
        finally {
            attributes.recycle()
        }

        setValues(title, translate, drawable)
    }

    private fun setValues(title: String?,textColor: Int,  drawable: Int) {
        setButtonText(title?: "Button")
        setButtonTextColor(textColor)
    }


    fun setButtonText(value: String) {
        this.text = value
    }

    fun setButtonTextColor(color: Int) {
        this.setTextColor(color)
    }

}