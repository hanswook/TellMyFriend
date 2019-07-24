//package com.hans.tellmyfriend.data.net;
//
//import android.content.Context;
//import com.hans.tellmyfriend.base.MyApp;
//import com.mckj.tec_library.http.HttpManager;
//import com.mckj.tec_library.http.HttpResultFunc;
//
///**
// * @date: 2019-07-24 10:36
// * @author: hanxu
// * @email hxxx1992@163.com
// * @description null
// */
//public class FriendRepository {
//    private static FriendRepository INSTANCE = new FriendRepository();
//
//    public static FriendRepository getInstance() {
//        return INSTANCE
//    }
//
//    private FriendService friendService;
//
//    public FriendRepository() {
//        friendService = HttpManager.getRetrofit(HttpManager.Retrofits.base).create(FriendService.class);
//        context = MyApp.getInstance().getApplicationContext();
//    }
//
//
//    private Context context;
//
//
//
//    public void queryAll(){
//        friendService.queryAll()
//        .map(new HttpResultFunc<Object>(context,Object.class));
//    }
//
//}
