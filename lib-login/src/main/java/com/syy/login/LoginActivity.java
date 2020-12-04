package com.syy.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.syy.annotation.BindPath;
import com.syy.route.ARouter;

@BindPath("login/login")
public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void jumpActivity(View view) {
        ARouter.getInstance().jumpActivity("member/member", null);
    }
}