package com.syy.component;

import android.app.Application;

import com.syy.route.ARouter;

/**
 * Created by zjp on 2019-06-05.
 *
 * @author zjp
 * @date 2019-06-05
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.getInstance().init(this);
    }
}
