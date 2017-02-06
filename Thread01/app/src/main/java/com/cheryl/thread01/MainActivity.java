package com.cheryl.thread01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonID);
        progressBar = (ProgressBar) findViewById(R.id.progressBarId);

        button.setOnClickListener(new OnButtonListener());
    }

    class OnButtonListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
//            MyThread thread = new MyThread();
//            thread.start();
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                progressBar.incrementProgressBy(5);
            }
        }
//        public void run() {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            //textView.setText("Change From Thread!");
//            progressBar.incrementProgressBy(10);
//        }
    }
}
