package com.example.khoi.fragnavtest


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class ProfileFragment : Fragment(){
    companion object {
        private val TAG = "ProfileFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)
        val button = view.findViewById(R.id.button) as Button
        button.setOnClickListener{
            Log.d(ProfileFragment.TAG, "Clicked profile button")
        }
        return view
    }
}