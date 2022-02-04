package com.example.atry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.app.FragmentManager
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.atry.fragments.FragmentA
import com.example.atry.fragments.FragmentB
//import android.R




class MainActivity : AppCompatActivity() , Communicator{

    val fragmentA=  FragmentA()
    val fragmentB= FragmentB()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction().add(R.id.fragmentA_container, fragmentA).commit()
        supportFragmentManager.beginTransaction().add(R.id.fragmentB_container, fragmentB, "fragb").commit()


    }

    override fun passDataCom(editTextinput: String) {
        fragmentB.updateEdit(editTextinput)
    }

}