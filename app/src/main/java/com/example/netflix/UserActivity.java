package com.example.netflix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UserActivity extends AppCompatActivity {

    ImageButton bt1;
    ImageButton bt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        bt1 = (ImageButton) findViewById(R.id.adbtn);
        bt2 = (ImageButton) findViewById(R.id.usbtn);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this,VideoActivity.class);
                startActivity(intent);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserActivity.this,VideoActivity.class);
                startActivity(intent);
            }
        });

    }
}
