package com.cheryl.intentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ButtonNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_new);

        Intent intent = getIntent();
        String text = intent.getStringExtra(getPackageName());
        TextView textview = (TextView) findViewById(R.id.text_view_2);
        textview.setText(text);
    }

    public void onClickStartNewActivity(View view) {
        TextView textview = (TextView) findViewById(R.id.text_view_2);
        String text = textview.getText().toString();
        Intent intent = new Intent(this, ButtonMainActivity.class);
        intent.putExtra(getPackageName(), text);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_button_new, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_clear:
//                ...
            TextView textview = (TextView) findViewById(R.id.text_view_2);
            textview.setText("");
        }
        return super.onOptionsItemSelected(item);
    }
}
