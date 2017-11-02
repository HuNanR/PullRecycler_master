package com.example.refreshview;

/**
 * Created by fanqh on 2017/11/2.
 */

public interface FooterViewListener {

    /**
     * 正常的loading的View
     */
    void onLoadingMore();

    /**
     * footerView ui-没有更多数据
     */
    void onNoMore();

    /**
     * footerView ui-加载更多失败的View
     */
    void onError();
}
