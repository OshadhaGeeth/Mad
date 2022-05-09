package com.example.distancediner;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity5 extends AppCompatActivity {

    EditText et3,et2,et11,et;
    Button b11;
    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add Orders");
        //actionBar.setSubtitle("Insert your details to calculate");
        actionBar.setDisplayHomeAsUpEnabled(true);


        et3 = findViewById(R.id.et3);
        et = findViewById(R.id.et);
        et2 = findViewById(R.id.et2);
        et11 = findViewById(R.id.et11);




        b11 = findViewById(R.id.b11);
        db = FirebaseDatabase.getInstance().getReference().child("Orders");

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insertData();
            }
        });

    }
    private void insertData(){

        String name = et3.getText().toString();
        String parcels = et.getText().toString();
        String contact = et2.getText().toString();
        String address = et11.getText().toString();


        Orders order = new Orders(name, contact, address, parcels);

        db.push().setValue(order);
        Toast.makeText(MainActivity5.this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }
}