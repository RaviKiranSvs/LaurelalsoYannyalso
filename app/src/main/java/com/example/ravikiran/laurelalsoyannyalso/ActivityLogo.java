package com.example.ravikiran.laurelalsoyannyalso;

import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityLogo extends AppCompatActivity {

    //String TAG = "Logo Activity";
    View bg;
    int blue = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo);

        bg = findViewById(R.id.bg);

        bg.setBackgroundColor(Color.rgb(0, 0, blue));

        final Handler handle_bg = new Handler();
        Runnable run_bg = new Runnable() {
            @Override
            public void run() {
                blue++;
                bg.setBackgroundColor(Color.rgb(0, 0, blue));
                if (blue == 255)    {
                    Intent i = new Intent(ActivityLogo.this, ActivityMain.class);
                    startActivity(i);
                }
                if (blue < 255)
                    handle_bg.postDelayed(this, 5);
            }
        };
        handle_bg.postDelayed(run_bg, 5);
    }
}
