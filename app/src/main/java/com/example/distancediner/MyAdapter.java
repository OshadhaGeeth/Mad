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
        View v = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        List li = list.get(position);
        holder.date.setText(li.getDate());
        holder.trip.setText(li.getTrip());
        holder.expenses.setText(li.getExpenses());
        holder.income.setText(li.getIncome());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView date, trip, expenses, income;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            date = itemView.findViewById(R.id.viewDate);
            trip = itemView.findViewById(R.id.viewTrip);
            expenses = itemView.findViewById(R.id.viewExpenses);
            income = itemView.findViewById(R.id.viewIncome);

        }
    }
}
