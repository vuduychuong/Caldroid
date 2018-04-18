package com.roomorama.caldroid;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.caldroid.R;
import com.caldroid.databinding.LayoutCellViewBinding;
import java.util.ArrayList;

/**
 * Created by crocodile2u on 3/30/15.
 */
public class CellView extends LinearLayout {

    public static final int STATE_TODAY = R.attr.state_date_today;
    public static final int STATE_SELECTED = R.attr.state_date_selected;
    public static final int STATE_DISABLED = R.attr.state_date_disabled;
    public static final int STATE_PREV_NEXT_MONTH = R.attr.state_date_prev_next_month;

    public ObservableField<String> textDate = new ObservableField<>();
    public ObservableField<Integer> heightView = new ObservableField<>(getHeight());

    private ArrayList<Integer> customStates = new ArrayList<Integer>();

    public CellView(Context context) {
        this(context, null);
    }

    public CellView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CellView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        if (!isInEditMode()) {
            init(attrs);
        }
    }

    private void init(AttributeSet attrs) {
        if (null == customStates) customStates = new ArrayList<Integer>();
        ((LayoutCellViewBinding) DataBindingUtil.inflate(LayoutInflater.from(getContext()),
                R.layout.layout_cell_view, this, true)).setCellView(this);
        init(attrs, R.layout.layout_cell_view);
    }

    private void init(AttributeSet attrs, int cell_view) {

    }

    public void resetCustomStates() {
        customStates.clear();
    }

    public void addCustomState(int state) {
        if (!customStates.contains(state)) {
            customStates.add(state);
        }
    }

    public void setDate(String date) {
        textDate.set(date);
    }

    public void setHeight(int height) {
        heightView.set(height);
    }

    //@Override
    //protected int[] onCreateDrawableState(int extraSpace) {
    //    init(attrs);
    //    int customStateSize = customStates.size();
    //    if (customStateSize > 0) {
    //        final int[] drawableState = super.onCreateDrawableState(extraSpace + customStateSize);
    //        int[] stateArray = new int[customStateSize];
    //        int i = 0;
    //        for (Integer state : customStates) {
    //            stateArray[i] = state;
    //            i++;
    //        }
    //        mergeDrawableStates(drawableState, stateArray);
    //        return drawableState;
    //    } else {
    //        return super.onCreateDrawableState(extraSpace);
    //    }
    //}
}
