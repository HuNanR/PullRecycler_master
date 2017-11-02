package com.example.refreshview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/**
 * Created by fanqh on 2017/11/2.
 */

public abstract class BaseFooterView extends FrameLayout implements FooterViewListener{

    public BaseFooterView(Context context) {
        super(context);
    }

    public BaseFooterView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BaseFooterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public abstract void setPullRefreshView(PullRefreshView pullRefreshView);
}