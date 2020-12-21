package com.example.zy2.base;

public abstract class BasePresenter{

    private BaseView presenter;

    public void bind(BaseView baseView) {
        this.presenter=baseView;
    }
}
