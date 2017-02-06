package com.cheryl.loginlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ButtonNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_new);

        Intent intent = getIntent();
        String text = intent.getStringExtra(getPackageName());

        TextView textView = (TextView) findViewById(R.id.PasswordID);
        textView.setText(text);
    }
}
