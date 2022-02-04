package com.example.atry.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.atry.Communicator
import com.example.atry.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FragmentA : Fragment() {

    private lateinit var communicator: Communicator



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_a, container, false)

        communicator= activity as Communicator

        //activity.passDataCom()


        view.findViewById<Button>(R.id.addBtn).setOnClickListener{

            val a = view.findViewById<EditText>(R.id.messageInput).text.toString().toInt()
            val b= view.findViewById<EditText>(R.id.messageInput2).text.toString().toInt()
            communicator.passDataCom((a+b).toString())
        }

        view.findViewById<Button>(R.id.subBtn).setOnClickListener{

            val a = view.findViewById<EditText>(R.id.messageInput).text.toString().toInt()
            val b= view.findViewById<EditText>(R.id.messageInput2).text.toString().toInt()
            communicator.passDataCom((b-a).toString())
        }

        view.findViewById<Button>(R.id.mulBtn).setOnClickListener{

            val a = view.findViewById<EditText>(R.id.messageInput).text.toString().toInt()
            val b= view.findViewById<EditText>(R.id.messageInput2).text.toString().toInt()
            communicator.passDataCom((a*b).toString())
        }

        view.findViewById<Button>(R.id.divBtn).setOnClickListener{

            val a = view.findViewById<EditText>(R.id.messageInput).text.toString().toFloat()
            val b= view.findViewById<EditText>(R.id.messageInput2).text.toString().toFloat()
            communicator.passDataCom((b/a).toString())
        }

        return view
    }

}