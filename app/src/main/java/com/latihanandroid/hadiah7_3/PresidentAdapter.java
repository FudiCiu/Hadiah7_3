package com.latihanandroid.hadiah7_3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PresidentAdapter extends RecyclerView.Adapter<PresidentAdapter.PresidentViewHolder> {
    ArrayList<President> presidents;
    Context context;

    public ArrayList<President> getPresidents() {
        return presidents;
    }

    public void setPresidents(ArrayList<President> presidents) {
        this.presidents = presidents;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public PresidentAdapter(ArrayList<President> presidents, Context context) {
        this.presidents = presidents;
        this.context = context;
    }

    @NonNull
    @Override
    public PresidentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item_row= LayoutInflater.from(context).inflate(R.layout.item_president,parent,false);
        return new PresidentViewHolder(item_row);
    }

    @Override
    public void onBindViewHolder(@NonNull PresidentViewHolder holder, final int position) {
        Glide.with(context).load(presidents.get(position).getPhoto()).into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,presidents.get(position).getName()+"-"+presidents.get(position).getRemarks(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return presidents.size();
    }

    public class PresidentViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        public PresidentViewHolder(View itemView) {
            super(itemView);
            imageView=(ImageView) itemView.findViewById(R.id.photo);
        }
    }
}
