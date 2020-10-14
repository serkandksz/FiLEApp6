package com.serkan.fileapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.serkan.fileapp.R
import com.serkan.fileapp.fragments.categories.EtTavukSarkuteriFragment
import com.serkan.fileapp.fragments.categories.IcecekFragment
import com.serkan.fileapp.fragments.categories.SebzeMeyveFragment
import com.serkan.fileapp.fragments.categories.SutVeSutUrunFragment
import kotlinx.android.synthetic.main.item_view_pager.view.*

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        when(position){
            0 -> {return SebzeMeyveFragment()}
            1 -> {return IcecekFragment() }
            2 -> {return EtTavukSarkuteriFragment() }
            3 -> {return SutVeSutUrunFragment() }
            else -> {return SebzeMeyveFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position){
            0 -> {return "Sebze-Meyve"}
            1 -> {return "İçecek"}
            2 -> {return "Et-Tavuk-Şarküter"}
            3 -> {return "Süt-Süt Ürunleri"}
            else ->{return "Sebze-Meyve"}
        }
    }



    override fun getCount(): Int {
        return 4
    }
}