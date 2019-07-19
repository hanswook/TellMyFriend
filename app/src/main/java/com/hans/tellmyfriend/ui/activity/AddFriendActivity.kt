package com.hans.tellmyfriend.ui.activity

import android.content.Context
import android.content.Intent
import com.hans.tellmyfriend.R
import com.hans.tellmyfriend.ui.contract.AddFriendContract
import com.hans.tellmyfriend.ui.presenter.AddFriendPresenter
import com.mckj.tec_library.base.BaseActivity

class AddFriendActivity : BaseActivity(), AddFriendContract.View {
    override val layoutId = R.layout.activity_add_friend

    companion object {
        fun goToPage(context: Context) {
            val intent = Intent(context, AddFriendActivity::class.java)
            context.startActivity(intent)
        }
    }


    private val addFriendPresenter by lazy { AddFriendPresenter() }

    override fun addPresenter() {
        addToPresenters(addFriendPresenter)
    }

    override fun init() {
    }

}
