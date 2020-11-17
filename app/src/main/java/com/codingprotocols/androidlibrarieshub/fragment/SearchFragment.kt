package com.codingprotocols.androidlibrarieshub.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.codingprotocols.androidlibrarieshub.R

// Created by Ajeet Yadav

class SearchFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Inflate the layout for this fragment
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onResume() {
        super.onResume()
        val window: Window = activity!!.window
        window.statusBarColor = ContextCompat.getColor(activity!!, R.color.blue_active)
        window.navigationBarColor = ContextCompat.getColor(activity!!, R.color.blue_active)
    }

}