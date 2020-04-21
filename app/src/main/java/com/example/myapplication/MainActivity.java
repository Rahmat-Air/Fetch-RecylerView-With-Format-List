package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.example.myapplication.adapter.KameraAdapter;
import com.example.myapplication.model.Kamera;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private ArrayList<Kamera> kameras = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.kamera_reycle);
        recyclerView.setHasFixedSize(true);




        kameras.addAll(DataCam.getListData());
        TunjukkanRecyler();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.maenu, menu);
    return true;

}
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.nav_prof) {
            Intent ja = new Intent(MainActivity.this, Main2Activity.class);
            startActivity(ja);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void TunjukkanRecyler() {

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        KameraAdapter kameraAdapter = new KameraAdapter(kameras);
        recyclerView.setAdapter(kameraAdapter);

        kameraAdapter.setOnItemClickCallback(new KameraAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kamera data) {
                showSelectedHero(data);
            }
        });
    }
    private void showSelectedHero(Kamera kamera) {
//        Toast.makeText(this, "Ini " + kamera.getJenis(), Toast.LENGTH_SHORT).show();


        Intent prgi = new Intent(MainActivity.this,DetailActivity.class);
        prgi.putExtra("Nama",kamera.getJenis());
        prgi.putExtra("Gambar",kamera.getGambar());
        prgi.putExtra("deskripsi",kamera.getDesk());
        startActivity(prgi);

    }

}


