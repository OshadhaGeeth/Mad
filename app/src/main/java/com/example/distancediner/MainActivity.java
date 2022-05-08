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

public class MainActivity extends AppCompatActivity {

    EditText et1,et3,etm1;
    Button b1;
    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Add Menu");
        //actionBar.setSubtitle("Insert your details to calculate");
        actionBar.setDisplayHomeAsUpEnabled(true);

        et1 = findViewById(R.id.et11);
        et3 = findViewById(R.id.et3);
        etm1 = findViewById(R.id.etm11);

        b1 = findViewById(R.id.b11);
        db = FirebaseDatabase.getInstance().getReference().child("Menues");

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insertData();
            }
        });

    }
    private void insertData(){

        String price = et1.getText().toString();
        String meal = et3.getText().toString();
        String description = etm1.getText().toString();

        Menues menu = new Menues(meal, description, price);

        db.push().setValue(menu);
        Toast.makeText(MainActivity.this, "Data Inserted Successfully", Toast.LENGTH_SHORT).show();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }
}