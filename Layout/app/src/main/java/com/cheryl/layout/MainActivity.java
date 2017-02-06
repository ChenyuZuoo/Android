package com.cheryl.layout;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox eatingBox;
    private CheckBox chicBox;
    private CheckBox codingBox;
    private CheckBox checkAllBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eatingBox = (CheckBox) findViewById(R.id.Eating);
        chicBox = (CheckBox) findViewById(R.id.Chic);
        codingBox = (CheckBox) findViewById(R.id.Coding);
        checkAllBox = (CheckBox) findViewById(R.id.CheckAll);

        CheckBoxListener listener = new CheckBoxListener();
        eatingBox.setOnCheckedChangeListener(listener);
        chicBox.setOnCheckedChangeListener(listener);
        codingBox.setOnCheckedChangeListener(listener);

        AllCheckListener CheckAll = new AllCheckListener();
        checkAllBox.setOnCheckedChangeListener(CheckAll);

        /*OnBoxClickListener listener = new OnBoxClickListener();
        eatingBox.setOnClickListener(listener);
        chicBox.setOnClickListener(listener);
        codingBox.setOnClickListener(listener);*/
    }

    class AllCheckListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b == true){
                eatingBox.setChecked(b);
                chicBox.setChecked(b);
                codingBox.setChecked(b);
            }
//            else {
//                System.out.println("All unchecked");
//                eatingBox.setChecked(false);
//                chicBox.setChecked(false);
//                codingBox.setChecked(false);
//            }
//            eatingBox.setChecked(b);
//            chicBox.setChecked(b);
//            codingBox.setChecked(b);
        }
    }

    class CheckBoxListener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (compoundButton.getId() == R.id.Coding){
                System.out.println("Coding");
            }
            else if (compoundButton.getId() == R.id.Chic){
                System.out.println("Chic");
            }
            else if (compoundButton.getId() == R.id.Eating){
                System.out.println("Eating");
            }

            if (b == true){
                System.out.println("Checked");
            }
            else {
                System.out.println("Unchecked");
            }

            if (eatingBox.isChecked() & chicBox.isChecked() & codingBox.isChecked()){
                checkAllBox.setChecked(true);
            }
            else {
                checkAllBox.setChecked(false);
            }
        }
    }
    //Example of Using OnClickListener
    /*class OnBoxClickListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            CheckBox box = (CheckBox)view;
            System.out.println("id----->" + view.getId());
            if(box.getId() == R.id.Eating){
                System.out.println("Eating Box is checked");
            }
            else if(box.getId() == R.id.Chic){
                System.out.println("Chicbox is checked");
            }
            else if(box.getId() == R.id.Coding){
                System.out.println("Codingbox is checked");
            }

            if(box.isChecked()){
                System.out.println("checked");
            }
            else {
                System.out.println("Unchecked");
            }
        }
    }*/
}
