package com.androidteachers.databindingkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * Created by androidteachers on 09/21/2017.
 */

class DataBindFragmentActivity : AppCompatActivity() {

    companion object {
        val flag = true
        val app_name :String = if (flag) "Imtiyaz" else "Khalani"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_bind_fragment)

        supportFragmentManager.beginTransaction().add(R.id.frag_container, DataBindFragment()).commit()

    }
}
