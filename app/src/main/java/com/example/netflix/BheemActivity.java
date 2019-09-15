package com.example.netflix;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class BheemActivity extends AppCompatActivity {

    Button clk;
    VideoView videov;
    MediaController mediac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bheem);
        clk = (Button) findViewById(R.id.stpbtn);
        videov = (VideoView) findViewById(R.id.videoView);
        mediac = new MediaController(this);
    }

    public void videoplay(View v)
    {
        String videopath = "android.resource://com.example.netflix/"+R.raw.cbheem;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediac);
        mediac.setAnchorView(videov);
        videov.start();

    }

}