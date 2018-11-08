package com.example.consultants.mvp.UI.base;

public interface BasePresenter<V extends BaseView> {

    void attachView(V view);

    void detachView();
}
