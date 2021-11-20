package com.example.appnghenhac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnChonBai,btnPlay,btnPause;
    TextView tvNumberSong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChonBai = findViewById(R.id.btnChonBai);
        btnPlay = findViewById(R.id.btnPlay);
        btnPause = findViewById(R.id.btnPause);
        tvNumberSong = findViewById(R.id.tvNumberSong);

        btnChonBai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ChonNhacActivity.class);
                startActivity(intent);
            }
        });;

        Intent intent = this.getIntent();
//
//        String songName = intent.getStringExtra("bai1");
        tvNumberSong.setText(intent.getStringExtra("bai1"));
        tvNumberSong.setText(intent.getStringExtra("bai2"));
        tvNumberSong.setText(intent.getStringExtra("bai3"));
        tvNumberSong.setText(intent.getStringExtra("bai4"));
        tvNumberSong.setText(intent.getStringExtra("bai5"));
        tvNumberSong.setText(intent.getStringExtra("bai6"));
    }
}