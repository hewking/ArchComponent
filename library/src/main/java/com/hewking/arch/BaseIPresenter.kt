package com.hewking.arch

import android.util.Log

/**
 * 项目名称：FlowChat
 * 类的描述：
 * 创建人员：hewking
 * 创建时间：2018/10/24 0024
 * 修改人员：hewking
 * 修改时间：2018/10/24 0024
 * 修改备注：
 * Version: 1.0.0
 */
interface BaseIPresenter< in T : BaseIView> {

    fun bind(view : T)

    fun showLoading()

    fun hideLoading()

}