package com.example.cosplayplanner

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.cosplayplanner.databinding.FragmentMainListBinding

class MainListFragment : Fragment() {

    private lateinit var binding: FragmentMainListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentMainListBinding.inflate(layoutInflater, container, false)

        binding.addButton.setOnClickListener {
            val action = MainListFragmentDirections.actionMainListFragmentToEditFragment()
            it.findNavController().navigate(action)
        }

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

    }
}