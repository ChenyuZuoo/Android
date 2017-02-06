package com.cheryl.intentapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonMainActivity extends AppCompatActivity {

    private TextView textView;
    private Button buttonC;
    String[] strArry = {"If you are reading this", "means", "it is fun", "focus on your work", "Hello Dresden", "Yeahhhhhhh", "Welcome to Dresden!"};
    int Count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_main);

        Intent intent = getIntent();
        String text = intent.getStringExtra(getPackageName());
        EditText editText = (EditText) findViewById(R.id.edit_text);
        editText.setText(text);

        textView = (TextView) findViewById(R.id.textviewHello);
        buttonC = (Button) findViewById(R.id.CountingButton);

        ButtonListener buttonListener = new ButtonListener();
        buttonC.setOnClickListener(buttonListener);
    }

    class ButtonListener implements View.OnClickListener {

        @Override
        public void onClick(View v){

            Count = (int)((Math.random())*6);

            textView.setText(strArry[Count]);
//            Count++;
//            if (Count > 4){
//                Count = 0;
//            }
        }
    }

    public void onClickStartNewActivity(View view) {
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String text = editText.getText().toString();

        Intent intent = new Intent(this, ButtonNewActivity.class);
        intent.putExtra(getPackageName(), text);

        startActivity(intent);
    }




//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_button_new, menu);
//        return true;
//    }
//
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_clear:
////                ...
//                TextView textview = (TextView) findViewById(R.id.text_view_2);
//                textview.setText("");
//        }
//        return super.onOptionsItemSelected(item);
//    }
}
