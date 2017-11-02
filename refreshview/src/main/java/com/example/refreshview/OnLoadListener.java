package com.example.refreshview;

/**
 * <p>
 *   下拉刷新，上拉加载接口回调
 * </p>
 * Created by fanqh on 2017/11/2.
 */

public interface OnLoadListener {

        void onRefresh();

        void onLoadMore();
    }