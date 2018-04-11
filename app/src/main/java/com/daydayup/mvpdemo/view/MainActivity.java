package com.daydayup.mvpdemo.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.daydayup.mvpdemo.R;
import com.daydayup.mvpdemo.model.ModelImpl;
import com.daydayup.mvpdemo.presenter.PresenterImpl;

/**
 * MVP
 *  核心就是接口回调
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener, IMainView {

    private ProgressBar progressBar;
    private EditText et_mobile;
    private EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        et_mobile = findViewById(R.id.et_mobile);
        et_password = findViewById(R.id.et_password);
        Button login = findViewById(R.id.login);
        progressBar = findViewById(R.id.progressbar);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                PresenterImpl presenter = new PresenterImpl();
                presenter.loginPresenter(new ModelImpl(), this);
                break;
        }

    }

    @Override
    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void showLoginError() {
        Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showLoginSuccess() {
        Toast.makeText(MainActivity.this, "成功---", Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getMobile() {
        return et_mobile.getText().toString();
    }

    @Override
    public String getPassword() {
        return et_password.getText().toString();
    }
}
