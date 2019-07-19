package com.hans.tellmyfriend.ui.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hans.tellmyfriend.R
import com.hans.tellmyfriend.ui.contract.UpdateFriendContract
import com.hans.tellmyfriend.ui.presenter.UpdateFriendPresenter
import com.mckj.tec_library.base.BaseActivity

class UpdateFriendActivity : BaseActivity(), UpdateFriendContract.View {
    override val layoutId = R.layout.activity_update_friend

    companion object {
        fun goToPage(context: Context) {
            val intent = Intent(context, UpdateFriendActivity::class.java)
            context.startActivity(intent)
        }
    }

    private val updateFriendPresenter by lazy { UpdateFriendPresenter() }
    override fun addPresenter() {
        addToPresenters(updateFriendPresenter)
    }

    override fun init() {

    }

}
