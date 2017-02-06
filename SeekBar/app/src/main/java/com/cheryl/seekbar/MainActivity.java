package com.cheryl.seekbar;

import android.content.DialogInterface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private RatingBar ratingBar;
    private Button button;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.seekBar);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        button = (Button) findViewById(R.id.button);

        OnSeekbarListener listener = new OnSeekbarListener();
        seekBar.setOnSeekBarChangeListener(listener);

        OnRatingListener listener1 = new OnRatingListener();
        ratingBar.setOnRatingBarChangeListener(listener1);

        OnButtonClickListener listener2 = new OnButtonClickListener();
        button.setOnClickListener(listener2);
    }

    class OnSeekbarListener implements SeekBar.OnSeekBarChangeListener {

        @Override
        public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            System.out.println("Progress: " + i + ";\n fromUser:" + b);
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            System.out.println("OnStartTracking");
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            System.out.println("OnStopTracking");
        }
    }

    class OnRatingListener implements RatingBar.OnRatingBarChangeListener {
        @Override
        public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
            System.out.print("\nRating: " + v + "\nfromUser: " + b);
        }
    }

    class OnButtonClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            ratingBar.setRating(ratingBar.getRating() + 1.0f);
        }
    }
}
