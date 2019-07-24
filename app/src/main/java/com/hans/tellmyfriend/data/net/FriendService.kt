package com.hans.tellmyfriend.data.net

import com.mckj.tec_library.http.HttpJSONResult
import com.mckj.tec_library.http.HttpResultFunc
import io.reactivex.Observable
import retrofit2.http.GET

/**
 *
 * @date:     2019-07-24 10:06
 * @author: hanxu
 * @email hxxx1992@163.com
 * @description null
 */
interface FriendService {

    @GET("friend/queryAll")
    fun queryAll(): Observable<HttpJSONResult<Any>>

}