package com.codingprotocols.androidlibrarieshub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.codingprotocols.androidlibrarieshub.adapters.ViewPagerAdapter
import com.gauravk.bubblenavigation.BubbleNavigationLinearView

// Created by Ajeet Yadav

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pagerAdapter = ViewPagerAdapter(
            supportFragmentManager
        )

        val bubbleNavigationLinearView =
            findViewById<BubbleNavigationLinearView>(R.id.bottom_navigation_view_linear)

        bubbleNavigationLinearView.setBadgeValue(0, null)
        bubbleNavigationLinearView.setBadgeValue(1, null) //invisible badge

        bubbleNavigationLinearView.setBadgeValue(2, "0")
        bubbleNavigationLinearView.setBadgeValue(3, null) //invisible badge


        val viewPager = findViewById<ViewPager>(R.id.view_pager)
        viewPager.adapter = pagerAdapter
        viewPager.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(i: Int, v: Float, i1: Int) {}
            override fun onPageSelected(i: Int) {
                bubbleNavigationLinearView.setCurrentActiveItem(i)
            }

            override fun onPageScrollStateChanged(i: Int) {}
        })


        bubbleNavigationLinearView.setNavigationChangeListener { _, position ->
            viewPager.setCurrentItem(
                position,
                true
            )
        }
    }
}