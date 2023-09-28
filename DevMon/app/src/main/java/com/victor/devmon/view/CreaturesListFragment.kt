package com.victor.devmon.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.victor.devmon.R
import com.victor.devmon.viewmodel.CreaturesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreaturesListFragment: Fragment() {
    private val creaturesViewModel: CreaturesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.creatures_list_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        creaturesViewModel.creatures.observe(viewLifecycleOwner) { }

    }
}