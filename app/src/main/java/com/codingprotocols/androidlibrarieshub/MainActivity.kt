package com.codingprotocols.androidlibrarieshub

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.codingprotocols.androidlibrarieshub.adapters.ViewPagerAdapter
import com.gauravk.bubblenavigation.BubbleNavigationLinearView
import java.lang.reflect.Array.newInstance


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragList: ArrayList<Fragment> = ArrayList()
        fragList.add(Fragment())
        fragList.add(Fragment())
        fragList.add(Fragment())
        fragList.add(Fragment())
        val pagerAdapter = ViewPagerAdapter(
            fragList,
            supportFragmentManager
        )

        val bubbleNavigationLinearView =
            findViewById<BubbleNavigationLinearView>(R.id.bottom_navigation_view_linear)
//        bubbleNavigationLinearView.setTypeface(Typeface.createFromAsset(assets, "rubik.ttf"))

        bubbleNavigationLinearView.setBadgeValue(0, "40")
        bubbleNavigationLinearView.setBadgeValue(1, null) //invisible badge

        bubbleNavigationLinearView.setBadgeValue(2, "7")
        bubbleNavigationLinearView.setBadgeValue(3, "2")


        val viewPager = findViewById<ViewPager>(R.id.view_pager)
        viewPager.adapter = pagerAdapter
        viewPager.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(i: Int, v: Float, i1: Int) {}
            override fun onPageSelected(i: Int) {
                bubbleNavigationLinearView.setCurrentActiveItem(i)
            }
            override fun onPageScrollStateChanged(i: Int) {}
        })

        bubbleNavigationLinearView.setNavigationChangeListener { _ , position ->
            viewPager.setCurrentItem(
                position,
                true
            )
        }
    }
}