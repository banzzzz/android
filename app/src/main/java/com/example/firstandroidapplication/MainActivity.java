package com.example.firstandroidapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = findViewById(R.id.Butto;n_1);
        final TextView tv1 = findViewById(R.id.tv1);

        btn1.setOnClickListener((v)->{
            tv1.setText("What a wonderful world!");
            Log.d("MainActivity","hello!！！world,zyr");
        });
        Log.d("MainActivity","hello");
    }
}