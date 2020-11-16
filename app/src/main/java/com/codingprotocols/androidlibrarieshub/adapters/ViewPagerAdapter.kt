package com.codingprotocols.androidlibrarieshub.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.codingprotocols.androidlibrarieshub.fragment.AboutFragment
import com.codingprotocols.androidlibrarieshub.fragment.BookmarkFragment
import com.codingprotocols.androidlibrarieshub.fragment.HomeFragment
import com.codingprotocols.androidlibrarieshub.fragment.SearchFragment

// Created by Ajeet Yadav

class ViewPagerAdapter(
    fm: FragmentManager
) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int = 4

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return HomeFragment()
            1 -> return SearchFragment()
            2 -> return BookmarkFragment()
            3 -> return AboutFragment()
        }
        return HomeFragment()
    }
}