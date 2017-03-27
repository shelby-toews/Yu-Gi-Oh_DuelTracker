package com.example.shelby.yu_gi_ohdueltracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class CardManager extends AppCompatActivity {

    private ViewGroup mContainerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_manager);
    }

    private void addItem() {
        View newView;

        mContainerView.addView(newView, 0);
    }
}
