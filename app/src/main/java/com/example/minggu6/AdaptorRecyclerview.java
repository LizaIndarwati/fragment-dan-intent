package com.example.minggu6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdaptorRecyclerview extends RecyclerView.Adapter<AdaptorRecyclerview.ViewHolder> {

    private ArrayList<ItemModel> dataItem;

    private Context context;

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textHead;
        TextView textsubhead;
        ImageView imageIcon;
        LinearLayoutCompat parentLayout;

        public ViewHolder(@NonNull View itemview) {
            super(itemview);

            textHead = itemview.findViewById(R.id.text_title);
            textsubhead = itemview.findViewById(R.id.text_subtitle);
            imageIcon = itemview.findViewById(R.id.imageList);
            parentLayout = itemview.findViewById(R.id.parentLayout);
        }

    }

    AdaptorRecyclerview(Context context,ArrayList<ItemModel> dataItem) {
        this.context = context;
        this.dataItem = dataItem;
    }
    @NonNull
    @Override
    public AdaptorRecyclerview.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptorRecyclerview.ViewHolder holder, int position) {

        TextView textHead = holder.textHead;
        TextView textSubhead = holder.textsubhead;
        ImageView imageIcon = holder.imageIcon;

        textHead.setText(dataItem.get(position).getName());
        textSubhead.setText(dataItem.get(position).getType());
        imageIcon.setImageResource(dataItem.get(position).getImage());

        Glide.with(context).load(dataItem.get(position).getImage()).into(imageIcon);

        holder.parentLayout.setOnClickListener(v -> {
            Toast.makeText(context, dataItem.get(position).getName(), Toast.LENGTH_SHORT).show();

            if (dataItem.get(position).getName().equals("facebook")) {
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.facebook);
                intent.putExtra("TEKS_DEFAULT", "facebook");
                intent.putExtra("DESKRIPSI_DEFAULT", "Facebook adalah layanan jejaring sosial online yang berkantor pusat di Menlo Park, California");
                context.startActivity(intent);
            }if (dataItem.get(position).getName().equals("whatsapp")) {
                    Intent intent = new Intent(context, DefaultActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.whatsapp);
                    intent.putExtra("TEKS_DEFAULT", "whatsapp");
                    intent.putExtra("DESKRIPSI_DEFAULT", "Whatsapp adalah aplikasi berkirim pesan dan panggilan yang sederhana, aman, dan reliabel, serta dapat diunduh ke ponsel di seluruh dunia secara gratis");
                    context.startActivity(intent);
            }if (dataItem.get(position).getName().equals("instagram")) {
                    Intent intent = new Intent(context, DefaultActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.instagram);
                    intent.putExtra("TEKS_DEFAULT", "instagram");
                    intent.putExtra("DESKRIPSI_DEFAULT", "Instagram adalah sosial media berbasis gambar yang memberikan layanan berbagai foto atau video secara langsung");
                    context.startActivity(intent);
            }if (dataItem.get(position).getName().equals("android")) {
                    Intent intent = new Intent(context, DefaultActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.android);
                    intent.putExtra("TEKS_DEFAULT", "android");
                    intent.putExtra("DESKRIPSI_DEFAULT", "Android adalah sistem operasi berbasis Linux yang dipergunakan sebagai pengelola sumber daya perangkat keras");
                    context.startActivity(intent);
            }if (dataItem.get(position).getName().equals("twitter")) {
                    Intent intent = new Intent(context, DefaultActivity.class);
                    intent.putExtra("GAMBAR_DEFAULT", R.drawable.twitter);
                    intent.putExtra("TEKS_DEFAULT", "twitter");
                    intent.putExtra("DESKRIPSI_DEFAULT", "Twitter adalah layanan bagi teman, keluarga, sekerja untuk berkomunikasi dan tetap terhubung melalui pertukaran pesan yang cepat dan sering");
                    context.startActivity(intent);
            }if (dataItem.get(position).getName().equals("youtube")) {
                Intent intent = new Intent(context, DefaultActivity.class);
                intent.putExtra("GAMBAR_DEFAULT", R.drawable.youtube);
                intent.putExtra("TEKS_DEFAULT", "youtube");
                intent.putExtra("DESKRIPSI_DEFAULT", "youtube adalah keterangan singkat dari video yang diunggah ke channel youtube sehingga orang mengetahui apa yang disampaikan dalam video tersebut");
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

}
