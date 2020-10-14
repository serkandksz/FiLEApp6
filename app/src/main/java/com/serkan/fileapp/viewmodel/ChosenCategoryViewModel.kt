package com.serkan.fileapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.serkan.fileapp.model.Products

class ChosenCategoryViewModel : ViewModel() {
    val productEt = MutableLiveData<List<Products>>()
    val productIcecek = MutableLiveData<List<Products>>()
    val productSebze = MutableLiveData<List<Products>>()
    val productSut = MutableLiveData<List<Products>>()

    fun getDataFromRoom(){

        val product1 = Products("Et ve Tavuk","tavuk","1 kg", "24,99", "19,99","www.ss.com","tavuk but")
        val product2 = Products("İçecek","Kola","2.5litre","6","5","www.ss.com","Coca cola")
        val product3 = Products("Sebze ve Meyve","elma","1 kilo","21,55","18,25","www.sss.com","yerli elma")
        val product4 = Products("Süt ve Süt Ürünleri","peynir","1 adet","21,55","18,25","www.sss.com","kaşar")
        val product5 = Products("Et ve Tavuk","et","1 kg", "54,99", "49,99","www.ss.com","tavuk kanat")
        val product6 = Products("İçecek","Su","1,5litre","2,55","1,25","www.sss.com","hayat")
        val product7 = Products("Süt ve Süt Ürünleri","peynir","1 kilo","14,99","1,99","www.ss.com","sütaş")
        val product8 = Products("İçecek","soda","1 adet","1,55","1,25","www.sss.com","beypazarı")
        val product9 = Products("Sebze ve Meyve","portakal","1 kilo","","3,00","www.sss.com","yerli portakal")

        val productsList = arrayListOf<Products>(product1,product2,product3,product4,product5,product6,product7,product8,product9)
        val etVeTavuk = arrayListOf<Products>()
        val icecek = arrayListOf<Products>()
        val sebzeMeyve = arrayListOf<Products>()
        val sutVeSutUrun = arrayListOf<Products>()

        for (header in productsList){
            if (header.categoryName == "Et ve Tavuk"){
                etVeTavuk.add(header)
                productEt.value = etVeTavuk
            }else if (header.categoryName == "İçecek"){
                icecek.add(header)
                productIcecek.value = icecek
            }else if (header.categoryName == "Sebze ve Meyve"){
                sebzeMeyve.add(header)
                productSebze.value = sebzeMeyve
            }else if (header.categoryName == "Süt ve Süt Ürünleri"){
                sutVeSutUrun.add(header)
                productSut.value = sutVeSutUrun
            }
        }




    }
}