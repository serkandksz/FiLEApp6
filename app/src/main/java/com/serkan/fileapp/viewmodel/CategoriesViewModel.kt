package com.serkan.fileapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.serkan.fileapp.model.Category
import com.serkan.fileapp.model.Products

class CategoriesViewModel : ViewModel() {
    val categories = MutableLiveData<List<Category>>()
    val categoryError = MutableLiveData<Boolean>()
    val categoryLoading = MutableLiveData<Boolean>()

    fun refreshData(){
        
        val category = Category("Kahvaltılık","www.ss.com")
        val category2 = Category("Et ve Balık","www.ss.com")
        val category3 = Category("Kişisel Bakım","www.ss.com")
        val category4 = Category("Temizlik","www.ss.com")
        val category5 = Category("Teknoloji","www.ss.com")
        val category6 = Category("Dondurma","www.ss.com")
        val category7 = Category("Tatlı","www.ss.com")
        val category8 = Category("Sağlık","www.ss.com")
        val category9 = Category("Ev & Ofis","www.ss.com")
        val category10 = Category("Giyim","www.ss.com")
        val category11 = Category("Kağıt Ürünleri","www.ss.com")

        val categoryList = arrayListOf<Category>(category,category2,category3,category4,category5,category6,category7,category8,category9,category10,category11)

        categories.value = categoryList
        categoryError.value = false
        categoryLoading.value = false
    }


}