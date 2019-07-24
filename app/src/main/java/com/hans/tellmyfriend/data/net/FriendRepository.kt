package com.hans.tellmyfriend.data.net

import com.hans.tellmyfriend.base.MyApp
import com.mckj.tec_library.http.HttpManager
import com.mckj.tec_library.http.HttpResultFunc
import com.mckj.tec_library.http.IRetrofit
import io.reactivex.Observable

/**
 *
 * @date:     2019-07-24 10:16
 * @author: hanxu
 * @email hxxx1992@163.com
 * @description null
 */
class FriendRepository {


    companion object {
        val instance: FriendRepository by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            FriendRepository()
        }
    }

    private val friendService by lazy {
        HttpManager.getRetrofit(HttpManager.Retrofits.base).create(FriendService::class.java)
    }

    private val context by lazy { MyApp.getInstance().applicationContext }

    fun queryAll(): Observable<Any> {

        val objectObservable = friendService.queryAll()
            .map(HttpResultFunc<Any>(context, Any::class.java))
        return objectObservable
    }
}