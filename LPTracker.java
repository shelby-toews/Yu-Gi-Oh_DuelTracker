package com.example.shelby.yu_gi_ohdueltracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;



public class LPTracker extends AppCompatActivity {

    Button two, four, six, eight, ten, twelve, fourteen, sixteen;
    EditText lifepoints, increase, decrease;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lptracker);

        Intent intent = getIntent();


        two = (Button) findViewById(R.id.button7);
        four = (Button) findViewById(R.id.button6);
        six = (Button) findViewById(R.id.button5);
        eight = (Button) findViewById(R.id.button4);
        ten = (Button) findViewById(R.id.button11);
        twelve = (Button) findViewById(R.id.button10);
        fourteen = (Button) findViewById(R.id.button9);
        sixteen = (Button) findViewById(R.id.button8);

        lifepoints = (EditText) findViewById(R.id.editText);
        increase = (EditText) findViewById(R.id.editText2);
        decrease = (EditText) findViewById(R.id.editText3);

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifepoints.setText("2000");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifepoints.setText("4000");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifepoints.setText("6000");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifepoints.setText("8000");
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifepoints.setText("10 000");
            }
        });
        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifepoints.setText("12 000");
            }
        });
        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifepoints.setText("14 000");
            }
        });
        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lifepoints.setText("16 000");
            }
        });

        increase.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0)
                    Increase();
            }
        });
        decrease.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {}

            @Override
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start,
                                      int before, int count) {
                if(s.length() != 0)
                    Decrease();
            }
        });
    }

    private void Increase() {
        String lpValue = lifepoints.getText().toString();
        String increaseValue = increase.getText().toString();
        int currentLP = 0;
        int plus = 0;
        try {
            currentLP = Integer.parseInt(lpValue);
            plus = Integer.parseInt(increaseValue);
        }
        catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(), "Not a valid input.",
                    Toast.LENGTH_SHORT).show();
        }
        
        int newLP = currentLP + plus;

        lifepoints.setText(Integer.toString(newLP));
    }

    private void Decrease() {
        String lpValue = lifepoints.getText().toString();
        String decreaseValue = decrease.getText().toString();
        int currentLP = 0;
        int minus = 0;
        try {
            currentLP = Integer.parseInt(lpValue);
            minus = Integer.parseInt(decreaseValue);
        }
        catch (NumberFormatException e){
            Toast.makeText(getApplicationContext(), "Not a valid input.",
                    Toast.LENGTH_SHORT).show();
        }

        int newLP = currentLP - minus;

        lifepoints.setText(Integer.toString(newLP));
    }



}
