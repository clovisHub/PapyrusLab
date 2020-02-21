package com.clovis.rollsui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.LinearLayoutCompat;

public class BigConstraint extends LinearLayoutCompat {

    public BigConstraint(Context context) {
        super(context);
    }

    public BigConstraint(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BigConstraint(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setName() {
        System.out.println("yes you do it");
    }
}
