package com.example.appnghenhac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class ChonNhacActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6;
    Button btnChon;
    TextView tvNumberSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chon_nhac);

        btn1 = findViewById(R.id.btnSong1);
        btn2 = findViewById(R.id.btnSong2);
        btn3 = findViewById(R.id.btnSong3);
        btn4 = findViewById(R.id.btnSong4);
        btn5 = findViewById(R.id.btnSong5);
        btn6 = findViewById(R.id.btnSong6);
        tvNumberSong = findViewById(R.id.tvNumberSong);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("1");
                MediaPlayer song = MediaPlayer.create(ChonNhacActivity.this,R.raw.bai1);
                song.start();
                Intent intent = new Intent(ChonNhacActivity.this, com.example.appnghenhac.MainActivity.class);
                intent.putExtra("bai1","1");
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("2");
                MediaPlayer song = MediaPlayer.create(ChonNhacActivity.this,R.raw.bai2);
                song.start();
                Intent intent = new Intent(ChonNhacActivity.this, com.example.appnghenhac.MainActivity.class);
                intent.putExtra("bai2","2");
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("3");
                MediaPlayer song = MediaPlayer.create(ChonNhacActivity.this,R.raw.bai3);
                song.start();
                Intent intent = new Intent(ChonNhacActivity.this, com.example.appnghenhac.MainActivity.class);
                intent.putExtra("bai3","3");
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("4");
                MediaPlayer song = MediaPlayer.create(ChonNhacActivity.this,R.raw.bai4);
                song.start();
                Intent intent = new Intent(ChonNhacActivity.this, com.example.appnghenhac.MainActivity.class);
                intent.putExtra("bai4","4");
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("5");
                MediaPlayer song = MediaPlayer.create(ChonNhacActivity.this,R.raw.bai5);
                song.start();
                Intent intent = new Intent(ChonNhacActivity.this, com.example.appnghenhac.MainActivity.class);
                intent.putExtra("bai5","5");
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvNumberSong.setText("6");
                MediaPlayer song = MediaPlayer.create(ChonNhacActivity.this,R.raw.bai6);
                song.start();
                Intent intent = new Intent(ChonNhacActivity.this, com.example.appnghenhac.MainActivity.class);
                intent.putExtra("bai6","6");
                startActivity(intent);
            }
        });

//        btnChon.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
    }
}