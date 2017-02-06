package com.cheryl.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int age = intent.getIntExtra("com.cheryl.intent.Age",10);
        String name = intent.getStringExtra("com.cheryl.intent.Name");

        textView = (TextView) findViewById(R.id.SeocndView);
        textView.setText(name + ": " + age);
    }
}
