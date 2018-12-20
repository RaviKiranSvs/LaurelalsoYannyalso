package com.example.ravikiran.laurelalsoyannyalso;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMain extends AppCompatActivity {

    //final String TAG = "Activity Main";
    Button b_main;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_main = findViewById(R.id.b_main);
        mp = MediaPlayer.create(ActivityMain.this, R.raw.original);

        b_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        mp.release();
        mp = null;
    }
}
