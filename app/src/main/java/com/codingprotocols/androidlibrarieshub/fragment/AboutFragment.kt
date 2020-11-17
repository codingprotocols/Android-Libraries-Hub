package com.codingprotocols.androidlibrarieshub.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.codingprotocols.androidlibrarieshub.R
import com.dci.dev.appinfobadge.AppInfoBadge

// Created by Ajeet Yadav

class AboutFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val aboutPage = AppInfoBadge
            .darkMode { false }
            .headerColor { Color.parseColor("#f44336") }
            .withAppIcon { false }
            .withPermissions { false }
            .withChangelog { true }
            .withLibraries { true }
            .withRater { false }
            .withEmail { "codingprotocols@gmail.com" }
            .withSite { "https://www.codingprotocols.com" }
            .show()

        activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.aboutFrameLayout, aboutPage)
            ?.commit()

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onResume() {
        super.onResume()
        val window: Window = activity!!.window
        window.statusBarColor = ContextCompat.getColor(activity!!, R.color.red_active)
        window.navigationBarColor = ContextCompat.getColor(activity!!, R.color.red_active)
    }

}