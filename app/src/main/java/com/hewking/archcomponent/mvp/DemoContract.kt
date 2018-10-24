package com.hewking.archcomponent.mvp

import com.hewking.arch.BaseIPresenter
import com.hewking.arch.BaseIView

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
interface DemoContract {

    interface DemoIView : BaseIView {
        fun test()
    }

    interface DemoIPresenter : BaseIPresenter<DemoIView> {

        fun testPresenter()
    }

}