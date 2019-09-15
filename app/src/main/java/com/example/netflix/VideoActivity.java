package com.example.netflix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class VideoActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        textView1=(TextView)findViewById(R.id.st1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VideoActivity.this,StActivity.class);
                startActivity(intent);
            }
        });

        textView4=(TextView)findViewById(R.id.cb1);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VideoActivity.this,BheemActivity.class);
                startActivity(intent);
            }
        });

        textView5=(TextView)findViewById(R.id.sgbtn);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VideoActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });

    }
}
