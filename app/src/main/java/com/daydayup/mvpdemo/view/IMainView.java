package com.daydayup.mvpdemo.view;

/**
 * View层的接口
 * 只需要定义功能/方法
 */

public interface IMainView {
    //显示进度
    void showProgressBar();

    //隐藏进度
    void hideProgressBar();

    //提示登录失败
    void showLoginError();

    //登录成功，跳转
    void showLoginSuccess();

    //获取手机号
    String getMobile();

    //获取密码
    String getPassword();
}
