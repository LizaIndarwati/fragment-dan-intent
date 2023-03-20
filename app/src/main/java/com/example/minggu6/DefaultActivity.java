package com.example.minggu6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DefaultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);

        ImageView ivDefault = findViewById(R.id.iv_default);
        TextView tvDefault = findViewById(R.id.tv_default);
        TextView avDefault = findViewById(R.id.av_default);

        Intent intent = getIntent();

        int gambarfacebook = intent.getIntExtra("GAMBAR_DEFAULT",0);
        String namafacebook = intent.getStringExtra("TEKS_DEFAULT");
        String deskripsi = intent.getStringExtra("DESKRIPSI_DEFAULT");


        ivDefault.setImageResource(gambarfacebook);
        tvDefault.setText(namafacebook);
        avDefault.setText(deskripsi);

    }
}