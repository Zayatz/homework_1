package com.zayatz.firstapp;

/**
 * Created by Zayatz on 14.02.2016.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView NewTextView;
    private EditText NewEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewTextView = (TextView) findViewById(R.id.textView);
        NewEditText = (EditText) findViewById(R.id.editText);
    }

    public void onClick(View view) {
        setContentView(R.layout.tap_the_button);
    }

    public void onClick_1(View view) {
        if(NewEditText.getText().length()==0)
            NewTextView.setText("Hello World!!!");
        else
            NewTextView.setText("Hello " + NewEditText.getText());

    }
}
