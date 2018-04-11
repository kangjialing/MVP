package com.daydayup.mvpdemo.model;

/**
 * Created by gjl on 2018/4/11.
 */

public class User {
    private String mobile;
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String mobile, String password) {
        this.mobile = mobile;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "mobile='" + mobile + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
