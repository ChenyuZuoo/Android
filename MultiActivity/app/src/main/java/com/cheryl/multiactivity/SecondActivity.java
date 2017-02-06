package com.cheryl.multiactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        System.out.println("SecondActivity OnCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("SecondActivity OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("SecondActivity OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("SecondActivity OnDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("SecondActivity OnResume");
    }

    @Override
    protected void onPause() {
        super.onResume();
        System.out.println("SecondActivity OnPause");
    }

    @Override
    protected void onRestart() {
        super.onResume();
        System.out.println("SecondActivity OnRestart");
    }
}
