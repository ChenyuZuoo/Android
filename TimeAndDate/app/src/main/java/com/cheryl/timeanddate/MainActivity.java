package com.cheryl.timeanddate;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private TimePicker firstTimePicker;
    private Button buttonOK;
    private DatePicker firstDatePicker;
    private Button buttonOK2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstTimePicker = (TimePicker) findViewById(R.id.timePicker);
        buttonOK = (Button) findViewById(R.id.buttonOK);
        firstDatePicker = (DatePicker) findViewById(R.id.datePicker);
        buttonOK2 = (Button) findViewById(R.id.buttonOK2);

        timePickerListener listener = new timePickerListener();
        OnClickButton listener1 = new OnClickButton();
//        firstTimePicker.setOnTimeChangedListener(listener);

        //setting 24 hour mode
        firstTimePicker.setIs24HourView(true);
        buttonOK.setOnClickListener(listener1);

        Button2Listener listener3 = new Button2Listener();
        buttonOK2.setOnClickListener(listener3);
    }

    class timePickerListener implements TimePicker.OnTimeChangedListener{
        @Override
        public void onTimeChanged(TimePicker timePicker, int i, int i1) {
            System.out.println("Hour: " + i + ", Min: " + i1);
        }
    }

    class OnClickButton implements View.OnClickListener{
//        @RequiresApi(api = Build.VERSION_CODES.M)
        @Override
        public void onClick(View view) {
//            System.out.println("Hour: " + i + ", Min: " + i1);
            int Hour = firstTimePicker.getCurrentHour();
            System.out.println("Hour: " + Hour);
        }
    }

    class Button2Listener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            int date = firstDatePicker.getDayOfMonth();
            System.out.println("Day: " + date);
        }
    }
}
