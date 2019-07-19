package com.hans.tellmyfriend.ui.adapter

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.hans.tellmyfriend.R
import com.hans.tellmyfriend.data.entity.FriendEntity

/**
 *
 * @date:     2019-07-19 18:22
 * @author: hanxu
 * @email hxxx1992@163.com
 * @description null
 */
class FriendListAdapter :
    BaseQuickAdapter<FriendEntity, BaseViewHolder>(R.layout.item_friend_name, ArrayList<FriendEntity>()) {

    override fun convert(helper: BaseViewHolder?, item: FriendEntity?) {
    }
}