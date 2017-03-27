package com.example.shelby.yu_gi_ohdueltracker;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button toLPTracker, toCardManager;
    TextView duelTracker;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);

        toLPTracker = (Button) findViewById(R.id.button);
        toCardManager = (Button) findViewById(R.id.button2);
        duelTracker = (TextView) findViewById(R.id.textView2);

        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/MatrixRegularSmallCaps.ttf");

        toLPTracker.setTypeface(custom_font);
        toCardManager.setTypeface(custom_font);
        duelTracker.setTypeface(custom_font);

        toLPTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LPTracker.class);
                startActivity(intent);
            }
        });
        toCardManager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CardManager.class);
                startActivity(intent);
            }
        });


    }
}
