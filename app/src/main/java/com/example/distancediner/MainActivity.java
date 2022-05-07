package com.example.distancediner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    EditText txtDate,txtTrip,txtExpenses,txtIncome;
    Button btnAdd;

    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Profit Calculator");
        //actionBar.setSubtitle("Insert your details to calculate");
        actionBar.setDisplayHomeAsUpEnabled(true);

        txtDate = findViewById(R.id.txtDate);
        txtTrip = findViewById(R.id.txtTrip);
        txtExpenses = findViewById(R.id.txtExpenses);
        txtIncome = findViewById(R.id.txtIncome);

        btnAdd = findViewById(R.id.btnAdd);

        db = FirebaseDatabase.getInstance().getReference().child("Trips");

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insertData();
            }
        });

    }

    private void insertData(){

        String date = txtDate.getText().toString();
        String trip = txtTrip.getText().toString();
        String expenses = txtExpenses.getText().toString();
        String income = txtIncome.getText().toString();

        Trips trips = new Trips(date,trip,expenses,income);

        db.push().setValue(trips);
        Toast.makeText(MainActivity.this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }
}