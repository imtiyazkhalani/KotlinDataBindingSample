package com.androidteachers.databindingkotlin

import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MyTwoWayBinding : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding: ViewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_binding)
        var myModel = MyModel("Test")
        binding.setVariable(BR.viewModel, myModel)
        binding.executePendingBindings()
    }

}
