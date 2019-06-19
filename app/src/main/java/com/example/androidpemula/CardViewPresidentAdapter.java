package com.example.androidpemula;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardViewPresidentAdapter extends RecyclerView.Adapter<CardViewPresidentAdapter.CardViewViewHolder>{

    private Context context;
    private ArrayList<President> listPresident;
    private ArrayList<InfoPresiden> infoPresiden;

    public ArrayList<InfoPresiden> getInfoPresiden() {
        return infoPresiden;
    }

    public void setInfoPresiden(ArrayList<InfoPresiden> infoPresiden) {
        this.infoPresiden = infoPresiden;
    }

    public CardViewPresidentAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<President> getListPresident() {
        return listPresident;
    }

    public void setListPresident(ArrayList<President> listPresident) {
        this.listPresident = listPresident;
    }

    @NonNull
    @Override
    public CardViewPresidentAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview_president, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewPresidentAdapter.CardViewViewHolder cardViewViewHolder, int i) {
        final President p = getListPresident().get(i);
        final InfoPresiden ip = getInfoPresiden().get(i);

        Glide.with(context)
                .load(p.getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(cardViewViewHolder.imgPhoto);
//        Glide.with(context)
//                .load(ip.getFoto())
//                .apply(new RequestOptions().override(350, 550))
//                .into(cardViewViewHolder.imgfoto);
        cardViewViewHolder.tvName.setText(p.getName());
        cardViewViewHolder.tvRemarks.setText(p.getRemarks());
        cardViewViewHolder.btnFavorite.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Favorite "+getListPresident().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        cardViewViewHolder.btnShare.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share "+getListPresident().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
        cardViewViewHolder.imgPhoto.setOnClickListener(new CustomOnItemClickListener(i, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {

                Intent intent = new Intent(context, DetilActivity.class);
                intent.putExtra(DetilActivity.gambar, ip.getFoto());
                intent.putExtra(DetilActivity.info,ip.getInfo());
                intent.putExtra(DetilActivity.lahir,ip.getLahir());
                intent.putExtra(DetilActivity.wafat,ip.getWafat());
                intent.putExtra(DetilActivity.tinggi,ip.getTinggiBadan());
                Log.d("extra",ip.getInfo());
                Log.d("extra",ip.getLahir());
                Log.d("extra",ip.getWafat());
                Log.d("extra",ip.getTinggiBadan());
                context.startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListPresident().size();
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto, imgfoto;
        TextView tvName, tvRemarks;
        Button btnFavorite, btnShare;

        public CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgfoto = itemView.findViewById(R.id.img_item);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);
            btnShare = itemView.findViewById(R.id.btn_set_share);
        }
    }
}