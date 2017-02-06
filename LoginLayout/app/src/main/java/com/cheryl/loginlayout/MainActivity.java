package com.cheryl.loginlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnClickLoginButton(View view){
        EditText userName = (EditText) findViewById(R.id.UsernameID);
        EditText password = (EditText) findViewById(R.id.PasswordID);
        String userNameString = userName.getText().toString();
        String allString = userNameString +"/n"+ password.getText().toString();

        Intent intent = new Intent(this,ButtonNewActivity.class);
        intent.putExtra(getPackageName(),allString);

        startActivity(intent);

    }
}
