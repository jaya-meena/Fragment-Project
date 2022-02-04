package com.example.atry.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import com.example.atry.Communicator
import com.example.atry.Exit
import com.example.atry.R
import java.time.Instant
import kotlin.concurrent.fixedRateTimer

class FragmentB : Fragment() {

    //private lateinit var communicator: Communicator
    var displayMessage: String? = ""
    var textview : TextView? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_b, container, false)

        //communicator= activity as Communicator
        displayMessage = arguments?.getString("message")
        Log.e("kjhg", displayMessage.toString())
        Log.e("kjhg","h")
        textview = view.findViewById<TextView>(R.id.displayMessage)
        //textview?.text = displayMessage
        //updateEdit(view)

        view.findViewById<Button>(R.id.nextBtn).setOnClickListener{
            activity?.let{
                val intent = Intent (it, Exit::class.java)
                it.startActivity(intent)
            }
        }
        return view
    }


    fun updateEdit(ans :String)
    {
        textview?.text = ans.toString()
    }

}