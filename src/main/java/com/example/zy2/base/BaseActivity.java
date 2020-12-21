package com.example.zy2.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView{

    private P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        ButterKnife.bind(this);
        presenter = initPresenter();
        if (presenter!=null){
            presenter.bind(this);
        }
        initView();
        initListener();
        initData();
    }

    protected abstract P initPresenter();

    protected abstract void initListener();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int getLayoutID();

}
