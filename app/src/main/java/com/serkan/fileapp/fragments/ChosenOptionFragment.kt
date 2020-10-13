package com.serkan.fileapp.fragments

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
import kotlinx.android.synthetic.main.fragment_chosen_option.*
import kotlinx.android.synthetic.main.products_item.*


class ChosenOptionFragment : Fragment() {

    //private lateinit var viewModel: ChosenCategoryViewModel
    //private val productAdapter = ProductsAdapter(arrayListOf())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chosen_option, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewModel = ViewModelProviders.of(this).get(ChosenCategoryViewModel::class.java)
        //viewModel.getDataFromRoom()

        //recyclerViewForProducts.layoutManager = GridLayoutManager(context,3)
        //recyclerViewForProducts.adapter = productAdapter

        //observeLiveData()
    }

    /*private fun observeLiveData() {
        viewModel.products.observe(viewLifecycleOwner, Observer { product ->
            product?.let {
                recyclerViewForProducts.visibility = View.VISIBLE
                productAdapter.updateProductList(product)
            }
        })
    }*/


}