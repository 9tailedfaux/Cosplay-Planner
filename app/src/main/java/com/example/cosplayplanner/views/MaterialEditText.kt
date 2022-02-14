package com.example.cosplayplanner.views

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import com.example.cosplayplanner.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MaterialEditText(private val ctx: Context, attrs: AttributeSet?): FrameLayout(ctx, attrs) {

    fun setIcon(icon: Int){
        inputLayout.startIconDrawable = getDrawable(ctx, icon)
    }

    fun setText(text: String) {
        editText.setText(text)
    }
    fun getText(): String {
        return editText.text.toString()
    }

    private lateinit var editText: TextInputEditText
    private lateinit var inputLayout: TextInputLayout

    init {
        initView()
        val arr = ctx.obtainStyledAttributes(attrs, R.styleable.MaterialEditText)
        val icon = arr.getInt(R.styleable.MaterialEditText_icon, 0)
        if (icon != 0) setIcon(icon)
        arr.recycle()
    }

    constructor(ctx: Context): this(ctx, null) {
        initView()
    }

    private fun initView(){
        val view = inflate(ctx, R.layout.material_edittext, this)
        editText = view.findViewById(R.id.edittext)
        inputLayout = view.findViewById(R.id.textlayout)
    }
}