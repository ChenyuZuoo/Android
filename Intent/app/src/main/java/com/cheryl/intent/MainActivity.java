package com.cheryl.intent;

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

        OnButtonClickListener listener = new OnButtonClickListener();
        button.setOnClickListener(listener);
    }

    class OnButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, SecondActivity.class);
            intent.putExtra("com.cheryl.intent.Age", 30);
            intent.putExtra("com.cheryl.intent.Name","Sarah");
            startActivity(intent);
        }
    }
}
