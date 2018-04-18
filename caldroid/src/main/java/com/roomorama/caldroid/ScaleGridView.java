package com.roomorama.caldroid;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.GridView;

public class ScaleGridView extends GridView {
    public ScaleGridView(Context context) {
        super(context);
    }

    public ScaleGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScaleGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public ScaleGridView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
