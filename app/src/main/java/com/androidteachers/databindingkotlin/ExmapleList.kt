package com.androidteachers.databindingkotlin

/**
 * @author Android Teachers
 */

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_exmaple_list.*


class ExmapleList : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        //TODO("not implemented")
        var intent: Intent?
        when (p2) {
            0 -> {
                intent = Intent(this, MainActivity::class.java)
            }
            1 -> {
                intent = Intent(this, DataBindFragmentActivity::class.java)
            }
            2 -> {
                intent = Intent(this, MyTwoWayBinding::class.java)
            }
            3 -> {
                intent = Intent(this, JavaTwoWayBinding::class.java)
            }

            else -> intent = null
        }

        if (intent != null) {
            startActivity(intent)
        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exmaple_list)

        lv_sample.setOnItemClickListener(this)
    }
}
