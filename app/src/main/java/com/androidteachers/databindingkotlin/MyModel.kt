package com.androidteachers.databindingkotlin

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import android.text.Editable
import android.text.TextWatcher

/**
 * Created by Dilavar on 10/09/2017.
 */


data class MyModel(var userId: String) : BaseObservable() {

    var is8Digit: Boolean = false

    @Bindable
    fun getPasswordTextWatcher(): TextWatcher {
        return object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
                // Do nothing.
            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
                userId = s.toString()
                is8Digit = userId.length >=8
                notifyChange()
            }

            override fun afterTextChanged(s: Editable) {
                // Do nothing.
            }
        }
    }
}