package com.serkan.fileapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.serkan.fileapp.model.Products

class ChosenCategoryViewModel : ViewModel() {
    val products = MutableLiveData<List<Products>>()

    fun getDataFromRoom(){

        val product1 = Products("Kahvaltılık","peynir","1 kg", "24,99", "19,99","www.ss.com")
        val product2 = Products("Teknoloji","bilgisayar","1 adet","2000","1699,99","www.ss.com")
        val product3 = Products("Kişisel Bakım","şampuan","1 adet","21,55","18,25","www.sss.com")

        val productsList = arrayListOf<Products>(product1,product2,product3)

        products.value = productsList


    }
}