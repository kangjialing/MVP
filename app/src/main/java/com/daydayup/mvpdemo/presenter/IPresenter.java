package com.daydayup.mvpdemo.presenter;

import com.daydayup.mvpdemo.model.IModel;
import com.daydayup.mvpdemo.view.IMainView;

/**
 * P层
 * <p>
 * 逻辑层
 */

public interface IPresenter {

    //登陆
    void loginPresenter(IModel iModel, IMainView iMainView);

}
