package com.example.cosplayplanner

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.MaterialAutoCompleteTextView

class ExpandableSearchBar(ctx: Context, attrs: AttributeSet?): ConstraintLayout(ctx, attrs){
    private lateinit var searchButton: MaterialButton
    private lateinit var textBox: MaterialAutoCompleteTextView

    override fun onFinishInflate() {
        super.onFinishInflate()
        searchButton = findViewById(R.id.search_button)
        textBox = findViewById(R.id.search_text)
    }

    constructor(ctx: Context): this(ctx, null)
}