package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class DetailActivity extends AppCompatActivity {
    private ImageView foto;
    private TextView jenis2, desk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        foto = findViewById(R.id.foto_detail);
        jenis2 = findViewById(R.id.jenis);
        desk = findViewById(R.id.deskripsi);

        ActionBar balik = getSupportActionBar();

        balik.setDisplayShowHomeEnabled(true);
        balik.setDisplayHomeAsUpEnabled(true);


        gambarDetail();
        nama();
        deskr();

    }


    private void nama() {
        jenis2.setText(" " + getIntent().getStringExtra("Nama"));
    }

    private void deskr() {
        desk.setText(" " + getIntent().getStringExtra("deskripsi"));

    }


    private void gambarDetail() {
        foto.setImageResource(getIntent().getIntExtra("Gambar", 0));
    }


}
