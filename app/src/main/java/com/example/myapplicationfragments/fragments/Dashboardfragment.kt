package com.example.myapplicationfragments.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapplicationfragments.R

class Dashboardfragment: Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            DashboardfragmentArgs.fromBundle(requireArguments()).amount.toString()
    }
}