package com.hans.tellmyfriend.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hans.tellmyfriend.R
import com.hans.tellmyfriend.data.net.FriendRepository
import com.hans.tellmyfriend.utils.IDUtils
import com.mckj.tec_library.http.HttpResultObserver
import com.mckj.tec_library.utils.RxUtil
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("IDUtils:" + IDUtils.getAndroidId(this))
        println("tellmyfriend MainActivity IDUtils:" + IDUtils.getAndroidId(this))


        FriendRepository.instance.queryAll()
            .compose(RxUtil.applySchedulers())
            .subscribe(object : Observer<Any> {
                override fun onComplete() {
                    println("queryAll onComplete ")

                }

                override fun onSubscribe(d: Disposable) {
                    println("queryAll onSubscribe ")
                }

                override fun onNext(t: Any) {
                    println("queryAll onNext ${t.toString()}")
                }

                override fun onError(e: Throwable) {
                    println("queryAll onError ${e.toString()}")
                }

            })
    }
}
