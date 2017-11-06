package com.androidteachers.databindingkotlin;

import android.content.Context;
import android.content.Intent;

/**
 * Created by Dilavar on 10/09/2017.
 */


public class Test {

    private void test(Context context, int i) {
        Intent intent = null;
        switch (i) {
            case 1:
                intent = new Intent(context, MainActivity.class);
            case 2:
                intent = new Intent(context, DataBindFragmentActivity.class);
            case 3:
                intent = new Intent(context, MyTwoWayBinding.class);

            default:
                intent = null;
        }
        if (intent != null) {
            context.startActivity(intent);
        }
    }

}
