package com.serkan.fileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.serkan.fileapp.adapters.ViewPagerAdapter
import com.serkan.fileapp.fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchFragment = SearchFragment()
        val digerFragment = DigerFragment()
        val kampanyalarFragment= KampanyalarFragment()
        val sepetimFragment= SepetimFragment()
        val siparisFragment= SiparisFragment()

        setCurrentFragment(siparisFragment)

        bottom_nav.setupWithNavController(Navigation.findNavController(this,R.id.fragment))

        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.siparis -> setCurrentFragment(siparisFragment)
                R.id.search -> setCurrentFragment(searchFragment)
                R.id.sepetim -> setCurrentFragment(sepetimFragment)
                R.id.kampanyalar -> setCurrentFragment(kampanyalarFragment)
                R.id.diger -> setCurrentFragment(digerFragment)
            }
            true
        }
    }
    private fun setCurrentFragment(fragment:Fragment) = supportFragmentManager.beginTransaction().apply {
        replace(R.id.fragment, fragment)
        commit()
    }
}