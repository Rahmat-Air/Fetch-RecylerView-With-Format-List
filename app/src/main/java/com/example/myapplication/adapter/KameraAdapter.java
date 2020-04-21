package com.example.myapplication.adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.myapplication.model.Kamera;
import com.example.myapplication.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class KameraAdapter extends RecyclerView.Adapter<KameraAdapter.HolderList> {

    private ArrayList <Kamera> kameras ;
    private OnItemClickCallback onItemClickCallback2;

    public KameraAdapter(ArrayList<Kamera> kameras) {
        this.kameras = kameras;

    }


    @NonNull
    @Override
    public HolderList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.main, parent, false);
        return new HolderList(view);

    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback2 = onItemClickCallback;
    }



    @Override
    public void onBindViewHolder(@NonNull final HolderList holder, final int position) {
        final Kamera kamera = kameras.get(position);
        Glide.with(holder.itemView.getContext())
                .load(kamera.getGambar())
                .apply(new RequestOptions().override(80, 80))
                .into(holder.kamera_foto);

        holder.nama.setText(kamera.getJenis());
        holder.desk.setText(kamera.getDesk());

        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            onItemClickCallback2.onItemClicked(kameras.get(holder.getAdapterPosition()));

    }
});

    }

    @Override
    public int getItemCount() {
        return kameras.size();
    }

    class HolderList extends RecyclerView.ViewHolder {

        CircleImageView kamera_foto;
        TextView nama, desk;

        HolderList(@NonNull View itemView) {
            super(itemView);

            kamera_foto = itemView.findViewById(R.id.imageView23);
            nama = itemView.findViewById(R.id.jenis);
            desk = itemView.findViewById(R.id.deskripsi);

        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Kamera data);
    }

}
