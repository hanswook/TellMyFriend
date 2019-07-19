package com.hans.tellmyfriend.base;

import com.hans.tellmyfriend.BuildConfig;
import com.mckj.tec_library.base.BaseApplication;

/**
 * @date: 2019-07-19 15:03
 * @author: hanxu
 * @email hxxx1992@163.com
 * @description null
 */
public class MyApp extends BaseApplication {
    @Override
    public boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}
