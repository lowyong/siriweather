package com.example.administrator.siriweather.util;

/**
 * Created by Administrator on 2016/11/18.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
