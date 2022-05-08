package com.example.distancediner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;

    ArrayList<List> list;

    public MyAdapter(Context context, ArrayList<List> list) {
        this.context = context;
        this.list = list;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.orders,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        List li = list.get(position);
        holder.name.setText(li.getName());
        holder.contact.setText(li.getContact());
        holder.address.setText(li.getAddress());
        holder.noOfParcels.setText(li.getNoOfParcels());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name, contact, address, noOfParcels;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.viewName);
            contact = itemView.findViewById(R.id.viewContact);
            address = itemView.findViewById(R.id.viewAddress);
            noOfParcels = itemView.findViewById(R.id.viewParcels);

        }
    }
}