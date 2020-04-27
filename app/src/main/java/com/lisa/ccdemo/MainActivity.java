package com.lisa.ccdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.billy.cc.core.component.CC;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go2HomeActivity(View view) {
        CC.obtainBuilder("HomeComponent")
                .setActionName("go2HomeActivity")
                .build()
                .call();
    }
}
