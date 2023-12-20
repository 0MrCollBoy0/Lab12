package com.example.lab12_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
    }

    public void onIncreaseClick(View v) {
        text.setText(String.valueOf(Integer.parseInt(text.getText().toString()) + 1));
    }

    public void onDecreaseClick(View v) {
        text.setText(String.valueOf(Integer.parseInt(text.getText().toString()) - 1));
    }
}