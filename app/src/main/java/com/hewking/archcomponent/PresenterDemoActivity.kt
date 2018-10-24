package com.hewking.archcomponent

import com.hewking.arch.BasePresenterActivity
import com.hewking.archcomponent.mvp.DemoContract
import com.hewking.archcomponent.mvp.DemoPresenter

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
class PresenterDemoActivity : BasePresenterActivity<DemoContract.DemoIView, DemoContract.DemoIPresenter>(),DemoContract.DemoIView{

    override fun test() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun reflesh() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun bindPresenter() {
        presenter = DemoPresenter()
        presenter?.bind(this)
    }

}