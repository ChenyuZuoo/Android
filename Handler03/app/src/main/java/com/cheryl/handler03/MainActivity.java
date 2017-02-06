package com.cheryl.handler03;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TestThread t = new TestThread();
                t.start();
            }
        });
    }

    class TestThread extends Thread{
        @Override
        public void run() {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    String LocalThreadName = Thread.currentThread().getName();
                    System.out.println("Current thread---------->  " + LocalThreadName );
                }
            };
            handler.post(r);
        }
    }
}
