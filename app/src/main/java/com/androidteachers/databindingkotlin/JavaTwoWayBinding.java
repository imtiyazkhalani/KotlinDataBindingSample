package com.androidteachers.databindingkotlin;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Dilavar on 11/02/2017.
 */

public class JavaTwoWayBinding extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        ViewDataBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_binding);
        MyModel myModel = new MyModel("Test");
        binding.setVariable(BR.viewModel, myModel);
        binding.executePendingBindings();
    }
}
