package com.roomorama.caldroid;

import android.databinding.BindingAdapter;
import android.view.View;
import android.view.ViewGroup;

public class BindingUtils {

    @BindingAdapter(value = { "layoutHeight" })
    public static void setLayoutHeight(View view, int height) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = height;
        view.setLayoutParams(layoutParams);
    }
}
