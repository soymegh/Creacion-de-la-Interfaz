package com.uca.edu.ni.peliculas.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uca.edu.ni.peliculas.databinding.FragmentGeneroBinding


class GeneroFragment : Fragment() {
    private lateinit var binding : FragmentGeneroBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGeneroBinding.inflate(inflater, container, false)
        return binding.root
    }

}