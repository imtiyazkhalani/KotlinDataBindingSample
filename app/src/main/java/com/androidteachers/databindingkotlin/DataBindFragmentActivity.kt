package com.androidteachers.databindingkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by androidteachers on 09/21/2017.
 */

class DataBindFragmentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_bind_fragment)

        supportFragmentManager.beginTransaction().add(R.id.frag_container, DataBindFragment()).commit()

    }
}
