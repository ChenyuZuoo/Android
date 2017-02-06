package com.cheryl.multiactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);

        ButtonListener listener = new ButtonListener();
        button.setOnClickListener(listener);

        System.out.println("MainActivity OnCreate");
    }

    class ButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, SecondActivity.class);

            startActivity(intent);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MainActivity OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("MainActivity OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("MainActivity OnDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MainActivity OnResume");
    }

    @Override
    protected void onPause() {
        super.onResume();
        System.out.println("MainActivity OnPause");
    }

    @Override
    protected void onRestart() {
        super.onResume();
        System.out.println("MainActivity OnRestart");
    }
}
