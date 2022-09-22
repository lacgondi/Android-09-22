package com.example.a09_22;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RelativeLayout layout;
    EditText input;
    TextView output;
    Button toUpper;
    Button toLower;
    Button changeColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        toUpper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String i = String.valueOf(input.getText()).toUpperCase();
                output.setText(i);
            }
        });
        toLower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String i = String.valueOf(input.getText()).toLowerCase();
                output.setText(i);
            }
        });
        changeColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                Random rnd = new Random();
                output.setBackgroundColor(Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            }
        });
    }

    public void init(){
        layout = findViewById(R.id.rel);
        input = findViewById(R.id.input);
        toUpper = findViewById(R.id.button1);
        toLower = findViewById(R.id.button2);
        changeColor = findViewById(R.id.button3);
        output = findViewById(R.id.output);
    }
}