package com.example.cosplayplanner

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cosplayplanner.databinding.FragmentEditBinding
import com.example.cosplayplanner.models.Cosplay

private const val ARG_MODEL = "model"

class EditFragment : Fragment() {
    private var param1: Cosplay? = null

    private lateinit var binding: FragmentEditBinding

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
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) = EditFragment().apply {
            arguments = Bundle().apply {
                putString(ARG_MODEL, param1)
            }
        }
    }
}