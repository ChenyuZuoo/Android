package com.cheryl.radiocheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButtonFemale;
    private RadioButton radioButtonMale;

    private RadioGroup radioGroup2;
    private RadioButton radioButtonRed;
    private RadioButton radioButtonYellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.RadioGroupId);
        radioButtonFemale = (RadioButton) findViewById(R.id.femaleButtonId);
        radioButtonMale = (RadioButton) findViewById(R.id.maleButtonId);

        radioGroup2 = (RadioGroup) findViewById(R.id.RadioGroupId2);
        radioButtonRed = (RadioButton) findViewById(R.id.Red);
        radioButtonYellow = (RadioButton) findViewById(R.id.Yellow);

        RadioGroupListener Listener = new RadioGroupListener();
        radioGroup.setOnCheckedChangeListener(Listener);
        radioGroup2.setOnCheckedChangeListener(Listener);

        RadioButtonListener ButtonListener = new RadioButtonListener();
        radioButtonFemale.setOnCheckedChangeListener(ButtonListener);
    }

    class RadioButtonListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b){

            }
        }
    }

    class RadioGroupListener implements RadioGroup.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int checkedID) {
            if (checkedID == radioButtonFemale.getId()){
                radioButtonRed.setChecked(true);
            }
            else if (checkedID == radioButtonMale.getId()){
                radioButtonYellow.setChecked(true);
            }
        }
    }
}
