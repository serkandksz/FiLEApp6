package com.serkan.fileapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.material.tabs.TabLayoutMediator
import com.serkan.fileapp.R
import com.serkan.fileapp.adapters.ViewPagerAdapter
import com.serkan.fileapp.adapters.ProductsAdapter
import com.serkan.fileapp.viewmodel.ChosenCategoryViewModel
import kotlinx.android.synthetic.main.fragment_diger.*
import kotlinx.android.synthetic.main.fragment_kampanyalar.*


class KampanyalarFragment : Fragment() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kampanyalar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager2.adapter = ViewPagerAdapter(childFragmentManager)
        tabLayout.setupWithViewPager(viewPager2)


    }


}