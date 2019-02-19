package com.example.khoi.fragnavtest


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class Host2Fragment : Fragment(){
    private val TAG = "Host2Fragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_host2, container, false)
//        val button = view.findViewById(R.id.button_host2) as Button
//        button.setOnClickListener{
//            Log.d(TAG, "Clicked Host2 Fragment")
//        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let{
            val safeArgs = Host2FragmentArgs.fromBundle(it)
            println(safeArgs.address)
        }
    }
}
