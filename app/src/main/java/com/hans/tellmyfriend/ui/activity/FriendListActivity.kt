package com.hans.tellmyfriend.ui.activity

import android.content.Context
import android.content.Intent
import com.hans.tellmyfriend.R
import com.hans.tellmyfriend.ui.contract.FriendListContract
import com.hans.tellmyfriend.ui.presenter.FriendListPresenter
import com.mckj.tec_library.base.BaseActivity

class FriendListActivity : BaseActivity(), FriendListContract.View {
    override val layoutId = R.layout.activity_friend_list


    companion object {
        fun goToPage(context: Context) {
            val intent = Intent(context, FriendListActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun addPresenter() {
        addToPresenters(friendListPresenter)
    }

    private val friendListPresenter by lazy { FriendListPresenter() }
    override fun init() {

    }


}
