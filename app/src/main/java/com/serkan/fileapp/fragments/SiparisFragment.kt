package com.serkan.fileapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.serkan.fileapp.R
import com.serkan.fileapp.adapters.CategoryAdapter
import com.serkan.fileapp.adapters.ViewPagerAdapter
import com.serkan.fileapp.viewmodel.CategoriesViewModel
import kotlinx.android.synthetic.main.fragment_siparis.*


class SiparisFragment : Fragment() {

    private lateinit var viewModel : CategoriesViewModel
    private val categoryAdapter = CategoryAdapter(arrayListOf())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_siparis, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(CategoriesViewModel::class.java)
        viewModel.refreshData()

        recyclerViewOptions.layoutManager = GridLayoutManager(context,3)
        recyclerViewOptions.adapter = categoryAdapter

        observeLiveData()


    }
    fun observeLiveData(){
        viewModel.categories.observe(viewLifecycleOwner, Observer {categories ->
            categories?.let {
                recyclerViewOptions.visibility=View.VISIBLE
                categoryAdapter.updateCategoryList(categories)

            }

        })
        viewModel.categoryError.observe(viewLifecycleOwner, Observer { error ->
            error?.let {
                if (it){
                    options_error.visibility = View.VISIBLE
                }else{
                    options_error.visibility = View.GONE
                }
            }
        })
        viewModel.categoryLoading.observe(viewLifecycleOwner, Observer { loading ->
            loading?.let {
                if (it){
                    options_loading.visibility = View.VISIBLE
                    recyclerViewOptions.visibility = View.GONE
                    options_error.visibility = View.GONE
                }else{
                    options_loading.visibility = View.GONE
                }
            }
        })
    }

}