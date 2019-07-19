package com.mckj.tec_library.utils.logger;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.orhanobut.logger.LogStrategy;

/**
 * 适用于com.orhanobut:logger:2.2.0或更新版本
 * @Description: 解决日志打印错位不整齐的问题
 * @Author: YinYongbo
 * @Time: 2018/7/25 11:27
 */
public class CustomLogCatStrategy implements LogStrategy {

    @Override
    public void log(int priority, @Nullable String tag, @NonNull String message) {
        Log.println(priority, randomKey() + tag, message);
    }

    private int last;

    private String randomKey() {
        int random = (int) (10 * Math.random());
        if (random == last) {
            random = (random + 1) % 10;
        }
        last = random;
        return String.valueOf(random);
    }

}
