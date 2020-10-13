package com.serkan.fileapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.serkan.fileapp.R
import com.serkan.fileapp.fragments.SiparisFragmentDirections
import com.serkan.fileapp.model.Category
import kotlinx.android.synthetic.main.options_item.view.*

class CategoryAdapter(val categoryList: ArrayList<Category>): RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.options_item,parent,false)
        return CategoryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.view.option_name.text = categoryList[position].categoryName

        holder.view.setOnClickListener {
            val action = SiparisFragmentDirections.actionSiparisFragmentToChosenOptionFragment()
            Navigation.findNavController(it).navigate(action)
        }

    }
    fun updateCategoryList(newCategoryList: List<Category>){
        categoryList.clear()
        categoryList.addAll(newCategoryList)
        notifyDataSetChanged()
    }
}