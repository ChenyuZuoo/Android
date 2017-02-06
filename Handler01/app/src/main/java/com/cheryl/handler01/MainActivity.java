package com.cheryl.handler01;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Handler handler;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonId);
        button.setOnClickListener(new OnButtonClick());

        textView = (TextView) findViewById(R.id.textViewId);

        handler = new MyHandler();

    }

    class OnButtonClick implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            //当用户点击按钮时，穿件一个消息对象，并实用Handler发送该对象
            System.out.println("OnClickListener");
//            Message msg = handler.obtainMessage();
//            msg.what = 2;
//            handler.sendMessage(msg);
            Thread t = new MyThread();
            t.start();
        }
    }

    class MyHandler extends Handler{
        @Override
        public void handleMessage(Message msg) {
//            int what = msg.what;
//            System.out.println("What: " + what);
            System.out.println("handleMessage------>" + Thread.currentThread().getName());
            String s = (String)msg.obj;
            textView.setText(s);
        }
    }

    class MyThread extends Thread{
        @Override
        public void run() {
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //实用s模拟网络中获取的数据
            System.out.println("MyThreadMessage------>" + Thread.currentThread().getName());
            String s = "Data from internet!"; 
            Message msg = handler.obtainMessage();
            msg.obj = s;
            handler.sendMessage(msg);
        }
    }
}
