package com.androidteachers.databindingkotlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.androidteachers.databindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        var binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        var user = DataBindingKotlinModel("Imtiyaz", "Khalani")
        binding.setVariable(BR.model, user)
        binding.executePendingBindings()
    }
}
