package com.serkan.fileapp.fragments.categories

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.serkan.fileapp.R
import com.serkan.fileapp.adapters.ProductsAdapter
import com.serkan.fileapp.viewmodel.ChosenCategoryViewModel
import kotlinx.android.synthetic.main.fragment_diger.*
import kotlinx.android.synthetic.main.fragment_sebze_meyve.*


class SebzeMeyveFragment : Fragment() {
    private lateinit var viewModel: ChosenCategoryViewModel
    private val productAdapter = ProductsAdapter(arrayListOf())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sebze_meyve, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ChosenCategoryViewModel::class.java)
        viewModel.getDataFromRoom()

        recyclerViewSebzeMeyve.layoutManager = GridLayoutManager(context,3)
        recyclerViewSebzeMeyve.adapter = productAdapter

        observeLiveData()
    }
    private fun observeLiveData() {
        viewModel.productSebze.observe(viewLifecycleOwner, Observer { product ->
            product?.let {
                recyclerViewSebzeMeyve.visibility = View.VISIBLE
                productAdapter.updateProductList(product)
            }
        })
    }


}