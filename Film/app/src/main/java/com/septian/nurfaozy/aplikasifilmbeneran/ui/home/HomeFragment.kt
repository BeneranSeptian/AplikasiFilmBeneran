package com.septian.nurfaozy.aplikasifilmbeneran.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.septian.nurfaozy.aplikasifilmbeneran.R
import com.septian.nurfaozy.aplikasifilmbeneran.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private val homeViewModel by viewModels<HomeViewModel>()
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSearch.setOnClickListener {
            homeViewModel.getMovieTitle(binding.etTitle.text.toString())
        }

        homeViewModel.Movie().observe(viewLifecycleOwner){movie ->
            Toast.makeText(requireContext(), movie.title, Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}