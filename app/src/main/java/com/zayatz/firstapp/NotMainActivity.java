package com.zayatz.firstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Zayatz on 14.02.2016.
 */

    import android.os.Bundle;
    import android.support.v7.app.AppCompatActivity;
    import android.view.View;

public class NotMainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_not_main);
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(NotMainActivity.this, OneMoreActivity.class);
            startActivity(intent);
        }

}
