package com.example.cosplayplanner.views

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.DatePicker
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.cosplayplanner.databinding.LayoutDatePickerBinding
import java.util.*

class DatePickerClass(context: Context, attrs: AttributeSet?): ConstraintLayout(context, attrs) {
    constructor(context: Context) : this(context, null)

    var binding: LayoutDatePickerBinding

    init {
        val inflater = LayoutInflater.from(context)
        binding = LayoutDatePickerBinding.inflate(inflater, this, true)
    }

    fun setUp(date: GregorianCalendar, dateChangedListener: DatePicker.OnDateChangedListener) {
        binding.picker.init(
            date.get(Calendar.YEAR),
            date.get(Calendar.MONTH),
            date.get(Calendar.DAY_OF_MONTH),
            dateChangedListener
        )
    }

    fun setDate(date: GregorianCalendar) {
        binding.picker.updateDate(
            date.get(Calendar.YEAR),
            date.get(Calendar.MONTH),
            date.get(Calendar.DAY_OF_MONTH)
        )
    }
}