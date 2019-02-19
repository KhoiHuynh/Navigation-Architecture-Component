package com.example.khoi.fragnavtest


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_host.*

class HostFragment : Fragment(){
    companion object {
        private const val TAG = "HostFragment"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_host, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val data = "501 van Lang"
        button.setOnClickListener{
            val nextAction = HostFragmentDirections.nextAction()
            nextAction.address = data

            Navigation.findNavController(it).navigate(nextAction)
        }

//        val button = view.findViewById(R.id.button) as Button
//        button.setOnClickListener{
//            Log.d(HostFragment.TAG, "Clicked Host button")
//            fragmentManager?.beginTransaction()?.add(R.id.container, Host2Fragment(), "host2Fragment")?.commit()
//        }
    }
}
