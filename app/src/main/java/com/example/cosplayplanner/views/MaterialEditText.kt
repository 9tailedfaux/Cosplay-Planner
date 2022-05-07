package com.example.cosplayplanner.views

import android.content.Context
import android.content.res.Resources
import android.content.res.TypedArray
import android.util.AttributeSet
import android.widget.FrameLayout
import androidx.appcompat.content.res.AppCompatResources.getDrawable
import androidx.core.content.res.ResourcesCompat
import com.example.cosplayplanner.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MaterialEditText(private val ctx: Context, attrs: AttributeSet?): FrameLayout(ctx, attrs) {

    private fun setIcon(icon: Int){
        inputLayout.startIconDrawable = ResourcesCompat.getDrawable(ctx.resources, icon, ctx.theme)
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
        inputLayout.endIconDrawable = getDrawable(ctx, R.drawable.ic_baseline_add_24)
        if (attrs != null) {
            val icon = attrs.getAttributeResourceValue(ns, "icon", 0)
            if (icon != 0) setIcon(icon)
            editText.hint = attrs.getAttributeValue(ns, "text")
        }
    }

    constructor(ctx: Context): this(ctx, null) {
        initView()
    }

    private fun initView(){
        val view = inflate(ctx, R.layout.material_edittext, this)
        editText = view.findViewById(R.id.edittext)
        inputLayout = view.findViewById(R.id.textlayout)
    }

    companion object {
        const val ns = "http://schemas.android.com/apk/res/android"
    }
}