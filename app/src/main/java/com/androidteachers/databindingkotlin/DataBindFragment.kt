package com.androidteachers.databindingkotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.androidteachers.databindingkotlin.databinding.FragmentDatabindBinding

/**
 * Created by androidteachers on 09/26/2017.
 */

class DataBindFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var binding : FragmentDatabindBinding = DataBindingUtil.inflate(inflater ,R.layout.fragment_databind,container , false)
        var myView : View  = binding.root


        // setting values to model
        val user = DataBindingKotlinModel("Imtiyaz", "Khalani")
        binding.model = user

        return myView
    }

}