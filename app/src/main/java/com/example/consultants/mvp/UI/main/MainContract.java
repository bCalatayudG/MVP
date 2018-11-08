package com.example.consultants.mvp.UI.main;

import com.example.consultants.mvp.UI.base.BasePresenter;
import com.example.consultants.mvp.UI.base.BaseView;

public interface MainContract {

    //Communicate from presenter to the view
    interface View extends BaseView{
        void onManipulationResult(String manipulatedString);
    }

    //communicate from view to the presenter
    interface Presenter extends BasePresenter<View>{
        void manipulateString(String rawString);
    }
}
