package com.example.zy2;

import android.widget.Button;

import com.example.zy2.base.BaseActivity;
import com.example.zy2.base.BasePresenter;
import com.example.zy2.presenter.LoginPreenter;

import butterknife.BindView;

public class MainActivity extends BaseActivity<LoginPreenter> {
    @BindView(R.id.btn)
    Button mBtn;

    @Override
    protected LoginPreenter initPresenter() {
        return new LoginPreenter();
    }

    @Override
    protected void initListener() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutID() {
        return R.layout.activity_main;
    }

}