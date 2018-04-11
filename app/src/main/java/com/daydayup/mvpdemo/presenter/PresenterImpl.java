package com.daydayup.mvpdemo.presenter;

import com.daydayup.mvpdemo.model.IModel;
import com.daydayup.mvpdemo.model.LoginListener;
import com.daydayup.mvpdemo.model.User;
import com.daydayup.mvpdemo.view.IMainView;

/**
 * Created by gjl on 2018/4/11.
 */

public class PresenterImpl implements IPresenter {
    @Override
    public void loginPresenter(IModel iModel, final IMainView iMainView) {
        iMainView.showProgressBar();
        User user = new User(iMainView.getMobile(), iMainView.getPassword());
        iModel.login(user, new LoginListener() {
            @Override
            public void loginSuccess() {
                iMainView.hideProgressBar();
                iMainView.showLoginSuccess();
            }

            @Override
            public void loginError() {
                iMainView.hideProgressBar();
                iMainView.showLoginError();
            }
        });

    }
}
