package com.serkan.fileapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.serkan.fileapp.R
import com.serkan.fileapp.model.Products
import kotlinx.android.synthetic.main.products_item.view.*

class ProductsAdapter(val productsList: ArrayList<Products>): RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder>() {

    class ProductsViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.products_item,parent,false)
        return ProductsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productsList.size
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        holder.view.product_name.text = productsList[position].productName
        holder.view.firstCost.text = productsList[position].productFirstCost
        holder.view.secondCost.text = productsList[position].productSecondCost
        holder.view.unit.text = productsList[position].productUnit

    }
    fun updateProductList(newProductList : List<Products>){
        productsList.clear()
        productsList.addAll(newProductList)
        notifyDataSetChanged()
    }
}