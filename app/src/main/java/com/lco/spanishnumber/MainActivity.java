package com.lco.spanishnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    MediaPlayer m1, m2, m3, m4, m5, m6, m7, m8, m9, m10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find_id();
        media_object();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m1.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m2.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m3.start();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m4.start();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m5.start();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m6.start();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m7.start();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m8.start();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m9.start();
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                m10.start();
            }
        });
    }

    public void find_id() {
        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        b10 = findViewById(R.id.btn10);

    }

    public void media_object() {
        m1 = MediaPlayer.create(MainActivity.this, R.raw.one);
        m2 = MediaPlayer.create(MainActivity.this, R.raw.two);
        m3 = MediaPlayer.create(MainActivity.this, R.raw.three);
        m4 = MediaPlayer.create(MainActivity.this, R.raw.four);
        m5 = MediaPlayer.create(MainActivity.this, R.raw.five);
        m6 = MediaPlayer.create(MainActivity.this, R.raw.six);
        m7 = MediaPlayer.create(MainActivity.this, R.raw.seven);
        m8 = MediaPlayer.create(MainActivity.this, R.raw.eight);
        m9 = MediaPlayer.create(MainActivity.this, R.raw.nine);
        m10 = MediaPlayer.create(MainActivity.this, R.raw.ten);
    }
}