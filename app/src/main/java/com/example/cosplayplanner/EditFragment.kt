package com.example.cosplayplanner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cosplayplanner.databinding.FragmentEditBinding
import com.example.cosplayplanner.databinding.LayoutDateSelectorButtonBinding
import com.example.cosplayplanner.models.Cosplay
import java.util.*

private const val ARG_MODEL = "model"

class EditFragment : Fragment() {
    private var param1: Cosplay? = null

    private lateinit var binding: FragmentEditBinding
    private var selectable = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getSerializable(ARG_MODEL) as Cosplay?
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentEditBinding.inflate(inflater, container, false)

        binding.startDateLayout.dateLayout.setOnClickListener { binding.startDateLayout.handleClick() }
        binding.dueDateLayout.dateLayout.setOnClickListener { binding.dueDateLayout.handleClick() }

        return binding.root
    }

    private fun LayoutDateSelectorButtonBinding.handleClick() {
        if (selectable) {
            selectable = false
            binding.datePicker.setDate(date ?: GregorianCalendar())
            binding.datePicker.binding.picker.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->
                transformationLayout.finishTransform()
                selectable = true
            }
            //binding.datePicker.binding.executePendingBindings()
            transformationLayout.bindTargetView(binding.datePicker.binding.root)
            transformationLayout.startTransform()
        }
    }
}