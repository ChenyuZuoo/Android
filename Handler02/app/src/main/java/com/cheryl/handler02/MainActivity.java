package com.cheryl.handler02;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonId);
        textView = (TextView) findViewById(R.id.textViewId);

        WorkerThread wt = new WorkerThread();
        wt.start();

        button.setOnClickListener(new OnButtonClick());
    }

    class WorkerThread extends Thread{
        @Override
        public void run() {
            Looper.prepare();
            System.out.println("Worker Thread");
            handler = new Handler(){
//                @Override
                public void handleMessage(Message msg){
                    System.out.println("Worker thread Message received");
                }
            };
            Looper.loop();
        }
    }

    class OnButtonClick implements View.OnClickListener{
        @Override
        public void onClick(View view) {
//            MyThread t = new MyThread();
//            t.start();
            System.out.println("OnClickListener1");
            Message msg = handler.obtainMessage();
            handler.sendMessage(msg);
            System.out.println("OnClickListener2");
        }
    }
}
