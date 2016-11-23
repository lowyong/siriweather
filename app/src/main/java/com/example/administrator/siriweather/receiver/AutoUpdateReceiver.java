package com.example.administrator.siriweather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Administrator on 2016/11/20.
 */

public class AutoUpdateReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context,AutoUpdateReceiver.class);
        context.startActivity(i);
    }
}
