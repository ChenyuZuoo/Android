package com.cheryl.progressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private Button mainButton;
    private Button secButton;
    private Button resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        mainButton = (Button) findViewById(R.id.mainProgressButton);
        secButton = (Button) findViewById(R.id.secondaryProgressButton);
        resetButton = (Button) findViewById(R.id.resetButton);

        OnButtonClickListener listener = new OnButtonClickListener();
        mainButton.setOnClickListener(listener);
        secButton.setOnClickListener(listener);
        resetButton.setOnClickListener(listener);
    }

    class OnButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            if (mainButton.getId() == view.getId()){
                progressBar.incrementProgressBy(10);
            }
            else if (secButton.getId() == view.getId()){
                progressBar.incrementSecondaryProgressBy(20);
            }
            else if(resetButton.getId() == view.getId()){
                progressBar.setProgress(0);
                progressBar.setSecondaryProgress(0);
            }
        }
    }
}
