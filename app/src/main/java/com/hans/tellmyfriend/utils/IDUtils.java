package com.hans.tellmyfriend.utils;

import android.content.Context;
import android.provider.Settings;
import android.telephony.TelephonyManager;

/**
 * @date: 2019-07-22 10:40
 * @author: hanxu
 * @email hxxx1992@163.com
 * @description null
 */
public class IDUtils {

    public static String getAndroidId(Context context){
        return Settings.System.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
    }

    /**
     * 设备IMEI
     */
    public static String getDeviceId(Context context) {
        TelephonyManager tm = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        return tm.getDeviceId();
    }

}
