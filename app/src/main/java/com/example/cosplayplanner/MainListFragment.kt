package com.example.cosplayplanner

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.cosplayplanner.adapters.MainListAdapter
import com.example.cosplayplanner.databinding.FragmentMainListBinding
import com.example.cosplayplanner.databinding.LayoutDateSelectorButtonBinding
import com.example.cosplayplanner.models.Cosplay
import io.realm.Realm
import io.realm.kotlin.where

class MainListFragment : Fragment() {

    private lateinit var binding: FragmentMainListBinding

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

        val realm = Realm.getDefaultInstance()
        val allCosplays = realm.where<Cosplay>().findAll()
        binding.mainListRecycler.adapter = MainListAdapter(allCosplays)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
    }
}