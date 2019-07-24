package com.hans.tellmyfriend.base;

import android.app.Application;
import com.hans.tellmyfriend.BuildConfig;
import com.mckj.tec_library.base.BaseApplication;
import com.mckj.tec_library.http.HttpManagerInitor;

/**
 * @date: 2019-07-19 15:03
 * @author: hanxu
 * @email hxxx1992@163.com
 * @description null
 */
public class MyApp extends BaseApplication {

    private static Application instance;

    public static Application getInstance() {
        return instance;
    }

    @Override
    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }

    @Override
    public void onCreate() {
        instance = this;
        super.onCreate();
        HttpManagerInitor.init(this, isDebug());
    }
}
