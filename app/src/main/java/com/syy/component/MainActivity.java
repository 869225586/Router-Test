package com.syy.component;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.syy.annotation.BindPath;
import com.syy.route.ARouter;

@BindPath("main/main")
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private TextView tv_main_view;
    private RelativeLayout cl_main_viewgroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jumpActivity(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("bundle", "From MainActivity");
        ARouter.getInstance().jumpActivity("login/login", bundle);
    }


    private void log(String msg) {
        Log.d(TAG, msg);
    }

}


