package com.hewking.arch

import android.support.v7.app.AppCompatActivity

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
abstract class BasePresenterActivity<in T : BaseIView,P : BaseIPresenter<T>> : AppCompatActivity(){

    open var presenter : P? = null

    init {
        bindPresenter()
    }

    abstract fun bindPresenter()

}